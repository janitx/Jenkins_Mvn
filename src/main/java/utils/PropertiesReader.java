package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
    private static final String FILE = "src/main/resources/config.properties";


    Properties property = new Properties();

    public PropertiesReader() {
        FileInputStream fis;
        try {
            fis = new FileInputStream(FILE);
            property.load(fis);
        } catch (IOException e) {

        }
    }

    public String getUrl() {
        return property.getProperty("URL");
    }

    public String getExpUrl(){return property.getProperty("EXP_URL");}

    public String getPathToFileXml() {
        return property.getProperty("FILE_CREDENTIALS_XML");
    }
}
