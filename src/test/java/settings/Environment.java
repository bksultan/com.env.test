package settings;

import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

public class Environment {
    public static String getSystemProperties(String key) throws IOException {
        Properties props = new Properties();
        props.load(Environment.class.getClassLoader().getResourceAsStream("system.properties"));

        return props.getProperty(key);
    }
}
