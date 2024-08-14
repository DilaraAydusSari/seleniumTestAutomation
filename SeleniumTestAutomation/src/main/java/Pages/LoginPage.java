package Pages;

import Base.Data;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends Data {

    public LoginPage fillEmail(String text) {
        driver.findElement(By.name("userLoginId")).sendKeys(text);
        return this;
    }

    public LoginPage fillPassword(String text) {
        driver.findElement((By.name("password"))).sendKeys(text);
        return this;
    }

    public LoginPage clickLogin() {
        driver.findElement(By.cssSelector("[data-uia='login-submit-button']")).click();
        return this;
    }

    public LoginPage passwordErrorTextControl() {
        String value = driver.findElement(By.cssSelector("[data-uia='error-message-container+header']")).getText();
        Assert.assertEquals("sss@gmail.com için parola yanlış", value);
        return this;
    }

    public LoginPage passwordMaxControl() {
        String value = driver.findElement(By.cssSelector("[data-uia='password-field+validationMessage']")).getText();
        Assert.assertEquals(value, maxErrorMessage);
        return this;
    }

}
