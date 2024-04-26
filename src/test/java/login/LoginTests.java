package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import java.io.FileNotFoundException;

public class LoginTests extends BaseTests {

    @Test
    public void testLoginSuccessfully() throws FileNotFoundException {
        LoginPage loginPage = homePage.clickOnLoginLink();
        loginPage.loginFeature(dataModel().Login.ValidCredentials.Username,dataModel.Login.ValidCredentials.Password);
    }
}