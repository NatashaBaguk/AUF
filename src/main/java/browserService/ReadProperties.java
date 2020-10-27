package browserService;

import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    protected Properties properties;

    public ReadProperties() {
        properties = new Properties();
        try {
            properties.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getURL() {
        return properties.getProperty("URL");
    }

    public String getApiURL() {
        return properties.getProperty("apiURL");
    }

    public String getBrowserName() {
        return properties.getProperty(  "browserType");
    }

    public boolean isHeadless() {
        return properties.getProperty("headless").equalsIgnoreCase("true");
    }

    public int getTimeOut() {
        return Integer.parseInt(properties.getProperty("timeout"));
    }

    public String getPassword (){
        return properties.getProperty("password");
    }

    public String getUsername (){
        return properties.getProperty("username");
    }

    public String getTitle1 (){
        return properties.getProperty("title1");
    }

    public String getTitle2(){
        return properties.getProperty("title2");
    }

    public String getTitle3(){
        return properties.getProperty("title3");
    }

    public String getSteps1(){
        return properties.getProperty("Steps1");
    }

    public String getSteps2 (){
        return properties.getProperty("Steps2");
    }

    public String getSteps3 (){
        return properties.getProperty("Steps3");
    }

    public String getResult1 (){
        return properties.getProperty("Result1");
    }

    public String getResult2 (){
        return properties.getProperty("Result2");
    }

    public String getResult3 (){
        return properties.getProperty("Result3");
    }
}
