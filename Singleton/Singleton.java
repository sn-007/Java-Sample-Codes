public class ConfigurationManager {
    
    private static ConfigurationManager instance;
    private Properties configuration;
    private int data;

    private ConfigurationManager() {
        
        //generate a random number for data
        data = (int) (Math.random() * 100);
        // ideally we are supposed to Load configuration properties from local storage
        configuration = new Properties();
        print("ConfigurationManager instance created");
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

    public int getData() {
        return data;
    }
}
