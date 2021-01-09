package com.tipico.utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private Driver(){}

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            String browser = DataReader.getProperty("browser").toLowerCase();
            switch (browser){
                case "chrome":
                    System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver");
                    driver = new FirefoxDriver();
                    break;
                default:
                    System.out.println("Invalid browser name");
            }
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }

}
