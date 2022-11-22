package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    @Test
    public void verifyUserShouldNavigatePageSuccessfully() throws InterruptedException {

        //Find login link and click on login link

        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        String expectmessage = "Welcome,Please Sign In!";

        //Find the Welcome text element and get the text


        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']"));
       // Assert.assertEquals("Not navigate to login page",expectmessage,actualTextMessageElement);


    }
    @Test

    public void verifyTheErrorMessage(){
        WebElement loginLink = driver.findElement(By.linkText("log in"));
        loginLink.click();

        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("test33@gmail.com");

        //Find the password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("nehal123");

        //Find the login button click on it
        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
        loginButton.click();






    }
}
