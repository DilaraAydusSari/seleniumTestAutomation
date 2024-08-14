import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.MainPage;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test
    public void loginSuccessful() throws InterruptedException {
        mainPage.clickOneTrustClose();
        loginPage
                .fillEmail("sevdekulhan@gmail.com")
                .fillPassword("12345678")
                .clickLogin();
        Thread.sleep(3000);
        homePage.loginTextControl();
    }

    @Test
    public void loginUnsuccessful() throws InterruptedException {
        mainPage.clickOneTrustClose();
        loginPage
                .fillEmail("sss@gmail.com")
                .fillPassword("ssss")
                .clickLogin();
        Thread.sleep(3000);
        loginPage.passwordErrorTextControl();
    }

    @Test
    public void maxKarakterControl() throws InterruptedException {
        mainPage.clickOneTrustClose();
        loginPage
                .fillEmail("ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss@gmail.com")
                .fillPassword("123456781234567812345678123456781234567812345678123456781234567812345678123456781234567812345678123456781234567812345678123456781234567812345678123456781234567812345678123456781234567812345678123456781234567812345678123456781234567812345678123456781234567812345678123456781234567812345678123456781234567812345678123456781234567812345678")
                .clickLogin();
        Thread.sleep(3000);
        loginPage.passwordMaxControl();
    }

    @Test
    public void minKarakterControl() throws InterruptedException {
        mainPage.clickOneTrustClose();
        loginPage
                .fillEmail("sevdekulhan@gmail.com")
                .fillPassword("1")
                .clickLogin();
        Thread.sleep(3000);
        loginPage.passwordMaxControl();
    }

}
