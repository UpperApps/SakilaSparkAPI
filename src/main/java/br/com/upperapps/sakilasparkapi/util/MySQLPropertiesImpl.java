package br.com.upperapps.sakilasparkapi.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MySQLPropertiesImpl implements IJDBCProperties{

    public static final Logger logger = LoggerFactory.getLogger(MySQLPropertiesImpl.class);

    private String driver;
    private String URL;
    private String user;
    private String password;

    /**
     *
     * @param environment
     */
    public MySQLPropertiesImpl(String environment) {
        Properties properties = getProperties(environment);

        driver = properties.getProperty("jdbc.driver");
        URL = properties.getProperty("jdbc.url");
        user = properties.getProperty("jdbc.user");
        password = properties.getProperty("jdbc.password");
    }

    @Override
    public Properties getProperties(String environment) {
        Properties props = new Properties();
        FileInputStream file;
        try {
            file = new FileInputStream(new File(".").getAbsoluteFile() + "\\properties\\application_" + environment + ".properties");
            props.load(file);
        } catch (FileNotFoundException e) {
            logger.error("Propoerties file not found.");
            e.printStackTrace();
        } catch (IOException e) {
            logger.error("Uneble to load properties.");
            e.printStackTrace();
        }
        return props;
    }

    @Override
    public String getDriver() {
        return driver;
    }

    @Override
    public String getURL() { return URL; }

    @Override
    public String getUser() {
        return user;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
