package org.example.dz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Test3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // обработка предусловия
        driver.get("https://context.reverso.net/%D0%BF%D0%B5%D1%80%D0%B5%D0%B2%D0%BE%D0%B4/"); //пользователь авторизован
        driver.get("https://account.reverso.net/Account/Login?returnUrl=https%3A%2F%2Fcontext.reverso.net%2F&lang=ru");
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("nagornaya.teacher@gmail.com");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Nevermore13");
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-submit']")).click();

        // тестовые действия
        driver.get("https://www.reverso.net/%D0%BF%D1%80%D0%BE%D0%B2%D0%B5%D1%80%D0%BA%D0%B0-%D0%BE%D1%80%D1%84%D0%BE%D0%B3%D1%80%D0%B0%D1%84%D0%B8%D0%B8/%D0%B0%D0%BD%D0%B3%D0%BB%D0%B8%D0%B9%D1%81%D0%BA%D0%B8%D0%B9/");
        driver.findElement(By.xpath("//input[@css='.speller-link > span']")).click();
        driver.findElement(By.xpath("//input[@ngx-speller-textarea ]")).sendKeys("I is student");
        driver.findElement(By.xpath("//button[@class='speller-actions-input_button correct-button']")).click();

        System.out.println("Тест-кейс №3 пройден");   // выведется только если тест не упадет

        // выход из браузера
        driver.quit();
    }
}
