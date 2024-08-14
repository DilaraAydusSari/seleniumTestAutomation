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

}
