package br.com.upperapps.sakilasparkapi.infra;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class JOOQPropertiesImpl  implements IJOOQProperties{

    private static final Logger logger = LoggerFactory.getLogger(JOOQPropertiesImpl.class);

    private String generator;
    private String database;
    private String schema;

    public JOOQPropertiesImpl(String environment) {
        Properties properties = getProperties(environment);
        this.generator = properties.getProperty("jooq.generator");
        this.database = properties.getProperty("jooq.database");
        this.schema = properties.getProperty("jooq.schema");
    }

    @Override
    public String getGenerator() {
        return generator;
    }

    @Override
    public String getDatabase() {
        return database;
    }

    @Override
    public String getSchema() {
        return schema;
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
}
