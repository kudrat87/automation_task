package com.tipico.utilites;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

// This class will be used to read/get data from resources such URL, Drivers, Browsers etc..
public class DataReader {

    public static Properties properties = new Properties();

    static {
        String filePath ="src/test/resources/config/user.properties";

        try {
            FileInputStream file = new FileInputStream(filePath);
            properties.load(file);
            file.close();
        } catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException("Path to the file was Not found");
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }

}
