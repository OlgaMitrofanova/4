package org.example.dz;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends AbstractPage{
    JavascriptExecutor js = (JavascriptExecutor) getDriver();

    @FindBy(xpath = "//div[@id='search-input']")
    private WebElement SearchField;
    @FindBy(xpath = "//input[@id='entry']")
    private WebElement SearchWords;

    @FindBy(xpath = "//button[@id='search-button']")
    private WebElement SearchBut;
    @FindBy(xpath = "//div[@class='src ltr']/class]")
    private WebElement SameText;
    public SearchPage(WebDriver driver) {

        super(driver);
    }

    public SearchPage pressSearchField(){
        this.SearchField.click();
        return this;
    }
    public SearchPage setSearchW(String words) {
        this.SearchField.click();
        this.SearchWords.sendKeys(words);
        return this;
    }

    public SearchPage pressSearchBut(){
        this.SearchBut.click();
        return this;
    }
    public String getSameText(){

        return this.SameText.getText();
    }
}
