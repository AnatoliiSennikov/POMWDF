package com.sennikov.otus.sp_tests;

import com.sennikov.otus.sp.GoogleSearchPageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class GoogleSearchPageObjectLiveTest {
    @Managed(driver = "chrome")
    private WebDriver browser;

    private GoogleSearchPageObject googleSearch;

    @Test
    public void whenGoogleBaeldungThenShouldSeeEugen() {
        googleSearch.open();

        googleSearch.searchFor("some");

        googleSearch.resultMatches("Eugen (Baeldung)");
    }
}
