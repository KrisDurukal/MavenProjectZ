package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigurationReader
{
    private static Properties properties;

    static
    {
        //path of the file location
        String path = "configuration.properties";

        try
        {
            // Java can not read files directly, it needs inputstream to read files
            // Inputstream takes the location of the file as a constructor
            FileInputStream fileInputStream = new FileInputStream(path);

            // Properties are used to read specifically Properties files, files with key value pairs
            properties = new Properties();

            //file content are loaded to Properties from the Inputstream
            properties.load(fileInputStream);

            // all input streams must be closed
            fileInputStream.close();
        }
        catch (java.io.IOException e)
        {
            e.printStackTrace();
        }
    }

    //returns the specific value of specific property
    public static String getProperty(String property)
    {
        return properties.getProperty(property);
    }
}
