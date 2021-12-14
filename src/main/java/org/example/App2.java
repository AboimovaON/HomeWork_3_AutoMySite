package org.example;

import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App2 {
    {
        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver.exe"
        );
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("incognito");

        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://nature.baikal.ru/");

        WebElement login = driver.findElement(By.xpath("//*[@name = 'author']"));
        login.click();
        login.sendKeys("qwerty11");

        WebElement password = driver.findElement(By.xpath("//input[@name='psw']"));
        password.click();
        password.sendKeys("ytrewq11");

        WebElement entry = driver.findElement(By.xpath("//input[@value='войти']"));
        entry.click();

        WebElement visitors = driver.findElement(By.xpath("//body[@id='bd']/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[9]/b"));
        visitors.click();

        WebElement myPage = driver.findElement(By.xpath("//a[contains(text(),'Моя страница')]"));
        myPage.click();

        Assert.assertNotNull(driver.findElement(By.xpath("//*[@class='tline']")));




        driver.quit();



    }
}
