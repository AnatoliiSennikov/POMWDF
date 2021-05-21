package com.sennikov.otus.sp_tests;

import com.sennikov.otus.sp.GoogleSearchResults;
import com.sennikov.otus.sp.SearchForKeyword;
import com.sennikov.otus.sp.StartWith;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.hasItem;

@RunWith(SerenityRunner.class)
public class GoogleSearchScreenplayLiveTest {
    @Managed(driver = "chrome")
    private WebDriver browser;

    private Actor myUser = Actor.named("myUser");

    @Before
    public void setup() {
        myUser.can(BrowseTheWeb.with(browser));
    }

    @Test
    public void whenGoogleBaeldungThenShouldSeeEugen() {
        givenThat(myUser).wasAbleTo(StartWith.googleSearchPage());

        when(myUser).attemptsTo(SearchForKeyword.of("baeldung"));

        then(myUser).should(seeThat(GoogleSearchResults.displayed(), hasItem(containsString("Eugen (Baeldung)"))));
    }

}

