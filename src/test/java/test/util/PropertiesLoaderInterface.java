package test.util;

import java.util.*;
import java.io.*;

public interface PropertiesLoaderInterface {
    default Properties loadProperties(String propertiesFilePath)  {
        Properties properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream(propertiesFilePath));
        } catch(IOException ioException) {
            System.out.println("Can't load the properties file" + ioException);
            ioException.printStackTrace();
            return null;
        } catch(Exception exception) {
            System.out.println("Problem: " + exception);
            exception.printStackTrace();
            return null;
        }
        return properties;
    }
}
