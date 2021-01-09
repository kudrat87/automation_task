package com.tipico.step_definition;

import com.tipico.pages.GoogleTrends_page;
import com.tipico.utilites.Driver;
import com.tipico.utilites.Wait_Utility;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.Locale;

public class GoogleTrends_Steps {

    GoogleTrends_page trendsPage = new GoogleTrends_page();
    @Given("User goes to {string}")
    public void user_goes_to(String url) {
        Driver.getDriver().get(url);
    }



    @Given("User enters {string} in search input box and presses enter")
    public void user_enters_in_search_input_box_and_presses_enter(String selenium) {
        trendsPage.searchTermOrATopicBox.sendKeys(selenium + Keys.ENTER);
    }

    @Then("User should be redirected to the Explore page")
    public void user_should_be_redirected_to_the_explore_page() {
        // We want to make sure we are in the "Explore" page
        // by verifying and printing title of the page
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Explore"));
        System.out.println("Verifying title of the page ==> "+Driver.getDriver().getTitle());

    }

    @Then("User enters {string} to the Compare field and presses enter")
    public void user_enters_to_the_compare_field_and_presses_enter(String javaScript) throws InterruptedException {
        trendsPage.compareButton.click();
        //Thread.sleep(1000);
        Wait_Utility.wait(1000);
        trendsPage.addASearchTermField.sendKeys(javaScript + Keys.ENTER);

    }

    @Then("User should be on the Compare page")
    public void user_should_be_on_the_compare_page() {
        // We want to make sure we are on Explore/Compare page
        // by verifying and printing title of the page

        System.out.println("Verifying title of the page ==> "+Driver.getDriver().getTitle());


    }


    @And("User selects {string} and {string} from the filters")
    public void userSelectsAndFromTheFilters(String country, String state)throws InterruptedException {
        trendsPage.countryFilters.click();
        //Thread.sleep(1000);
        Wait_Utility.wait(1000);
        trendsPage.countrySearchBox.sendKeys(country);
        trendsPage.United_States.click();
        //Thread.sleep(1000);
        Wait_Utility.wait(1000);
        trendsPage.countryFilters.click();
        trendsPage.US_NewYork.sendKeys(state +Keys.ENTER + Keys.ARROW_DOWN + Keys.ENTER);
    }


    @Then("User selects Past {int} days from the filters")
    public void user_selects_past_days_from_the_filters(Integer int1) {
        trendsPage.pastFilters.click();
        trendsPage.past_90_Days.click();


    }
    @Then("User gets percentual ratio from the Compared breakdown by metro section and display it on the console")
    public void user_get_percentual_ratio_from_the_compared_breakdown_by_metro_section_and_display_it_on_the_console() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(trendsPage.break_Down_By_Metro).build().perform();
        String selenium=trendsPage.seleniumWebDriver.getText().replaceAll("\n"," usage is: ");
        String webDriverIO=trendsPage.javascriptWebDriverIO.getText().replaceAll("\n"," usage is: ");
        System.out.println(selenium+"\n"+webDriverIO);



    }


    @Then("Make sure that Selenium WebDriver is more popular than WebDriverIO")
    public void makeSureThatSeleniumWebDriverIsMorePopularThanWebDriverIO() {


        int seleniumNumber = Integer.parseInt(trendsPage.seleniumWebDriver.getText().toLowerCase().replaceAll("[a-z% ]","").replaceAll("\n",""));
        int webDriverIONumber= Integer.parseInt(trendsPage.javascriptWebDriverIO.getText().toLowerCase().replaceAll("[a-z% ]","").replaceAll("\n",""));

        if (seleniumNumber > webDriverIONumber){
            System.out.println("Selenium is more popular than WebDriverIO");
        } else {
            System.out.println("WebDriverIO is more popular than Selenium");
        }

    }
}
