package com.sennikov.otus;

import com.sennikov.otus.page.factory.WdFactoryIfElse;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class WDFTest {

    @Test
    public void firstTest() {
        WebDriver wd = WdFactoryIfElse.getDriver("CHROME");

        wd.get("https://otus.ru/");

        Assert.assertEquals("Онлайн‑курсы для профессионалов, дистанционное обучение современным профессиям",
                wd.getTitle());

        wd.close();

    }
}
