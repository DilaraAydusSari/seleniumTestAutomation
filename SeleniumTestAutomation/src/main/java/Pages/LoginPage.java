package Pages;

import Base.Data;
import org.openqa.selenium.By;

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
}
