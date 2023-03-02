package org.example.dz;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends AbstractPage{
    JavascriptExecutor js = (JavascriptExecutor) getDriver();

    @FindBy(xpath = "//input[@css='.speller-link > span']")
    private WebElement SpellerField;
    @FindBy(xpath = "//input[@ngx-speller-textarea ]")
    private WebElement SpellerWords;

    @FindBy(xpath = "//button[@class='speller-actions-input_button correct-button']")
    private WebElement SpellerButton;

    @FindBy(xpath = "///div[@class='corrected-text_text-detail']")
    private WebElement CorrectText;


    public MenuPage(WebDriver driver) {
        super(driver);
    }

    public MenuPage pressSpellerField(){
        this.SpellerField.click();
        return this;
    }
    public MenuPage setSpWords(String words){
        this.SpellerField.click();
        this.SpellerWords.sendKeys(words);
        return this;
    }
    public MenuPage pressSpBut(){
        this.SpellerButton.click();
        return this;
    }
    public String getCorrectText(){
        return this.CorrectText.getText();
    }

}
