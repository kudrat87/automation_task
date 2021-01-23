package com.packages.pages;

import com.packages.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Page_WebElements {
    public Page_WebElements(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//button[@type='button'])[1]")
    public  WebElement hamburgerMenu;

    @FindBy (xpath = "//ul/li[.='Our Partners']")
    public  WebElement ourPartners;

    @FindBy (xpath = "//div[@class='row h-100 ']//img")
    public  List<WebElement> allPartnersLogo;

    @FindBy (xpath = "//div[@class='row h-100 ']" )
    public List<WebElement> allPresentedPartners;



}
