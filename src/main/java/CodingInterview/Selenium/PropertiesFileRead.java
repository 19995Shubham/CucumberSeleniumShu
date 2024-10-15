package CodingInterview.Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileRead {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/global.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String url = prop.getProperty("QAURl");
        System.out.println(url);

    }
}
