package com.sennikov.otus;

import com.sennikov.otus.page.factory.another_way.Browsers;
import com.sennikov.otus.page.factory.another_way.WebDriverFactory;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WDAnotherTest {

    @Test
    public void firstTest() {
        ChromeOptions ch = new ChromeOptions();
        ch.setHeadless(true);
        ch.addArguments("--window-size=800,600");
        WebDriver wd = WebDriverFactory.createDriver(Browsers.CHROME);
//        WebDriver wd = WebDriverFactory.createDriver(Browsers.CHROME);

        wd.get("https://otus.ru/");

        Assert.assertEquals("nj nj",
                wd.getTitle());

        wd.close();
    }
}
