package util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Properties;
/**
 * This is the properties interface class.
 * @author Osamah Shareef
 */
public interface PropertiesLoaderInterface {

    default Properties loadProperties(String propertiesFilePath)  {
        Properties properties = new Properties();
        Logger logger = LogManager.getLogger(this.getClass());
        try {
            properties.load(this.getClass().getResourceAsStream(propertiesFilePath));
        } catch(IOException ioException) {
            logger.error("Can't load the properties file" + ioException);
            return null;
        } catch(Exception exception) {
            logger.error("Problem: " + exception);
            return null;
        }
        return properties;
    }
}
