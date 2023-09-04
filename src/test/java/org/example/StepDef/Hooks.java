package org.example.StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static java.lang.Thread.sleep;


public class Hooks {
    public static WebDriver driver;

    @Before
    public void OpenBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @After
    public void CloseBrowser() {
        driver.close();
    }
}
