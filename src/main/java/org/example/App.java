package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty(
                "webdriver.chrome.driver","src/main/resources/chromedriver.exe"
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

        WebElement photo = driver.findElement(By.xpath("//body[@id='bd']/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[3]/b"));
        photo.click();

        WebElement landscape = driver.findElement(By.xpath("//a[contains(text(),'Пейзажи')]"));
        landscape.click();

        WebElement photoSelection = driver.findElement(By.cssSelector("tr:nth-child(1) > .tph:nth-child(2) img"));
        photoSelection.click();

        WebElement comment = driver.findElement(By.name("info"));
        comment.click();
        comment.sendKeys("Очень красиво!");

        WebElement addComment = driver.findElement(By.cssSelector("input:nth-child(9)"));
        addComment.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.quit();

        new App2();








    }
}
