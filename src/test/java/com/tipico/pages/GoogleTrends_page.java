package com.tipico.pages;

import com.tipico.utilites.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleTrends_page {
    public GoogleTrends_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//input[@type='search'])[2]")
    public WebElement searchTermOrATopicBox;

    @FindBy (xpath = "//*[@class = 'compare-term-container add-term-button pill-outline md-button md-ink-ripple']")
    public WebElement compareButton;

    @FindBy (xpath = "(//input[@type = 'search'])[2]")
    public WebElement addASearchTermField;

    @FindBy (xpath = "//*[@track-name='geoPicker']")
    public WebElement countryFilters;

    @FindBy (xpath = "(//input[@autocomplete='off'])[3]")
    public WebElement countrySearchBox;

    @FindBy (xpath = "//span[@class='highlight' and .='United States']")
    public WebElement United_States;

    @FindBy (xpath = "(//div[@id='compare-pickers-wrapper']/div/hierarchy-picker/ng-include/div/md-autocomplete//input)[1]")
    public WebElement US_NewYork;


    @FindBy (xpath = "(//md-select-value[@class='_md-select-value'])[1]")
    public WebElement pastFilters;

    @FindBy (xpath = "//div[contains(text(), 'Past 90 days')]")
    public WebElement past_90_Days;

    @FindBy (xpath = "//span[@class='progress-bar-multi-heat-volume']")
    public WebElement break_Down_By_Metro;

    @FindBy (xpath = "(//div[@class='tooltip-percentage-container'])[1]")
    public WebElement seleniumWebDriver;

    @FindBy (xpath = "(//div[@class='tooltip-percentage-container'])[2]")
    public WebElement javascriptWebDriverIO;






//    @Test
//    public void temp() throws InterruptedException {
//        Driver.getDriver().get("http://trends.google.com/");
//
//        Driver.getDriver().findElement(By.xpath("(//input[@type = 'search'])[2]")).sendKeys("Selenium WebDriver" + Keys.ENTER);
//        Driver.getDriver().findElement(By.xpath("//*[@class = 'compare-term-container add-term-button pill-outline md-button md-ink-ripple']")).click();
//        Thread.sleep(1000);
//        Driver.getDriver().findElement(By.xpath("(//input[@type = 'search'])[2]")).sendKeys("Javascript WebDriverIO" + Keys.ENTER);
//        Driver.getDriver().findElement(By.xpath("//*[@track-name='geoPicker']")).click();
//        Thread.sleep(1000);
//        Driver.getDriver().findElement(By.xpath("(//div[@id='compare-pickers-wrapper']/div/hierarchy-picker/ng-include/div/md-autocomplete//input)[1]")).sendKeys("New York NY" + Keys.ENTER + Keys.ARROW_DOWN + Keys.ARROW_DOWN + Keys.ENTER);
//        Driver.getDriver().findElement(By.xpath("(//md-select-value[@class='_md-select-value'])[1]")).click();
//        Driver.getDriver().findElement(By.xpath("//div[contains(text(), 'Past 90 days')]")).click();
//    }













}

