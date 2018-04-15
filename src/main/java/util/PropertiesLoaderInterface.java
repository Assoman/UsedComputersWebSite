package util;

import java.io.IOException;
import java.util.Properties;
/**
 * This is the properties interface class.
 * @author Osamah Shareef
 */
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
