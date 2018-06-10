package br.com.upperapps.sakilasparkapi.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFactory {

    private static Logger logger = LoggerFactory.getLogger(PropertiesFactory.class);

    public static Properties getProperties(){
        Properties props = new Properties();
        FileInputStream file;
        try {
            file = new FileInputStream(new File(".").getAbsoluteFile() + "\\properties\\default.properties");
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
