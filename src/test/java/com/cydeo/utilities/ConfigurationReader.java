package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    //1 create an Object of Properties
    private static final Properties properties = new Properties();
    static {
        try{
            //We need to open the file in java memory: FileInputStream
            FileInputStream file = new FileInputStream("Configuration.properties");
            //Load the properties object using FileInputStream object
            properties.load(file);
            //close the file
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}
