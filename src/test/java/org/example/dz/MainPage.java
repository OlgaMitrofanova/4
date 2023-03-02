package org.example.dz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractPage{
    @FindBy(xpath ="//form [@id='account']")
    private WebElement loginBtt;

    @FindBy(xpath = "//div[@class='option front closed']")
    private WebElement cabinetBtt;

    @FindBy(xpath = "//span[@class='text username']")
    private WebElement userName;

    @FindBy(xpath = "//h1")
    private WebElement contentHeader;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage pressLoginBtt() {
        this.loginBtt.click();
        return this;
    }

    public MainPage pressCabinetBtt() {
        this.cabinetBtt.click();
        return this;
    }

    public Boolean checkUser(String chUserName) {
        String s = userName.getText();
        return s.equals(chUserName);
    }

    public MainPage pressMenuItem(String x_path) throws InterruptedException {
        getDriver().findElement(By.xpath(x_path)).click();
        Thread.sleep(1000);
        return this;
    }

    public Boolean checkMenuItemTitle(String x_path, String title) {
        return getDriver()
                .findElement(By.xpath(x_path))
                .getText()
                .equals(title);
    }

    public Boolean checkContentHeader(String header) {
        return this.contentHeader.getText().equals(header);
    }
}
