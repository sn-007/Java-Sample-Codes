public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Properties configuration;

    int data;

    private ConfigurationManager() {
        // Load configuration properties from local storage
        //configuration = new Properties();

        
    }

    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    //some boiler plate methods to access something or modify something in the configuration
    public String getProperty(String key) {
        return configuration.getProperty(key);
    }

    public void setProperty(String key, String value) {
        configuration.setProperty(key, value);

    }
}
