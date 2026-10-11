package tests;

import base.BaseTest;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest2 extends BaseTest {

    @Test
    public void loginTest1() {
        LoginPage loginPage=new LoginPage(page);
        HomePage homepage=new HomePage(page);
        test.info("Navigating to login page");
        page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        test.info("Adding username");
        loginPage.addUsername("Admin");
        test.info("Adding password");
        loginPage.addPassword("admin123");
        test.info("Clicking login button");
        loginPage.clickLoginButton();
        test.info("all steps completed");
        homepage.clickTimeLink();
        //loginPage.login("Admin","admin123");


    }

//    @Test
//    public void loginTest2() {
//        test.skip("skipping this test");
//        throw new SkipException("Skipping this test");
//
//    }

    @Test
    public void loginTest3() {
        LoginPage loginPage=new LoginPage(page);
        HomePage homepage=new HomePage(page);
        test.info("Navigating to login page");
        page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        test.info("Adding username");
        loginPage.addUsername("Admin");
        test.info("Adding password");
        loginPage.addPassword("admin123");
        test.info("Clicking login button");
        loginPage.clickLoginButton();
        test.info("all steps completed");
        //homepage.clickTimeLink();
        //loginPage.login("Admin","admin123");


    }
}