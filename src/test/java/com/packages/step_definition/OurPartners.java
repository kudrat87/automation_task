package com.packages.step_definition;

import com.packages.pages.Page_WebElements;
import com.packages.utilites.Driver;
import com.packages.utilites.Wait_Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 If web elements are static in Page_WebElements class we can extend it and call all those Elements through the current class.
If web elements are Not static in Page_WebElements class we can create an Object of
Page_WebElements class in this class and call those Element through the object.
 In this case I'll create an object of Page_WebElements class and call webElements through the object
 */

public class OurPartners extends Page_WebElements { /** Inheriting all properties from Page_WebElement class*/

  Page_WebElements webElements = new Page_WebElements();
    @Given("Go to {string}")
    public void go_to(String baseURL) {
        Driver.getDriver().get(baseURL);
    }




    @Given("Click on Hamburger menu in the top right corner")
    public void click_on_hamburger_menu_in_the_top_right_corner() {
        webElements.hamburgerMenu.click();
    }

    @Given("Open our partners from the list")
    public void open_our_partners_from_the_list() {
        webElements.ourPartners.click();
    }

    @Given("List all partners logo")
    public void list_all_partners_logo() {
        for (WebElement eachLogo : webElements.allPartnersLogo){
            // Validation each logo is Not empty by validation attribute value
            Assert.assertFalse(eachLogo.getAttribute("alt").isEmpty());
            // Printing each logo name after validation
            System.out.println(eachLogo.getAttribute("alt"));
        }
    }

    @Then("Check all presented partners has logo, header and text description")
    public void check_all_presented_partners_has_logo_header_and_text_description() {

        // Looping through each partners and validating each Partners Logo, Header and text description
        for (WebElement allPartners : webElements.allPresentedPartners){
            // Validating all presented partners has Logo by using isDisplayed() method to make sure logo is presented
            Assert.assertTrue("Logo is Not presented",allPartners.findElement(By.tagName("img")).isDisplayed());
            // Validating all presented partners has header
            Assert.assertFalse("Presented Partner does Not have Header", allPartners.findElement(By.tagName("h3")).getText().isEmpty());
            // Validating all presented partners has text description
            Assert.assertFalse("Presented Partner does Not have text description", allPartners.findElement(By.tagName("p")).getText().isEmpty());


        }
        // After Validation waiting 5 seconds and quiting driver
        Wait_Utility.wait(5000);
        Driver.quitDriver();

    }

}
