package com.sennikov.otus.page.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class WdFactoryIfElse {

    private WdFactoryIfElse() {
    }

    public static WebDriver getDriver(String name) {
        WebDriver driver = null;
        if ("FIREFOX".equalsIgnoreCase(name)) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if ("CHROME".equalsIgnoreCase(name)) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if ("IE".equalsIgnoreCase(name)) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }
        return driver;
    }
}
