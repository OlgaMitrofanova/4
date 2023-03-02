package org.example.dz;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BacketPage extends AbstractPage{
    JavascriptExecutor js = (JavascriptExecutor) getDriver();


    @FindBy(xpath = "//button[@class='icon delete']")
    private WebElement deleteItems;
    @FindBy(xpath = "//button[@class='accept all']")
    private WebElement acceptAll;
    @FindBy(xpath = "body[@class='user-profile favourities hide-dapp-promo empty']")
    private WebElement EmptyField;


    public BacketPage(WebDriver driver) {
        super(driver);
    }

    public BacketPage pressDelIt() throws InterruptedException {
        this.deleteItems.click();
        return this;
    }
    public BacketPage pressAcAll() throws InterruptedException {
        this.acceptAll.click();
        return this;
    }
    public String getEmptyF() throws InterruptedException {
        return this.EmptyField.getText();
    }

    public String getText() {
        return this.EmptyField.getText();
    }
}
