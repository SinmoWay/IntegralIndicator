package root.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class StringResources {

    private static final Properties prop = new Properties();

    static {
        try {
            InputStream inputStream = StringResources.class.getResourceAsStream("/strings.properties");
            InputStreamReader reader = new InputStreamReader(inputStream, "UTF-8");
            prop.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return prop.getProperty(key);
    }

}
