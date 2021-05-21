package com.sennikov.otus.sp;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com/ncr")
public class GoogleSearchPage extends PageObject {
    static final Target SEARCH_RESULT_TITLES = Target.the("search results").locatedBy("._ksh");

    static final Target SEARCH_INPUT_BOX = Target.the("search input box").locatedBy("#lst-ib");
}
