package tests;

import base.BaseTest;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    void test() {

        // Login
        page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        page.getByRole(
                AriaRole.TEXTBOX,
                new Page.GetByRoleOptions().setName("Username")
        ).fill("Admin");

        page.getByRole(
                AriaRole.TEXTBOX,
                new Page.GetByRoleOptions().setName("Password")
        ).fill("admin123");

        page.getByRole(
                AriaRole.BUTTON,
                new Page.GetByRoleOptions().setName("Login")
        ).click();


        // Open user profile
        page.locator("span")
                .filter(new Locator.FilterOptions().setHasText("Alex Morgan"))
                .click();

        // Directory
        page.getByRole(
                AriaRole.LINK,
                new Page.GetByRoleOptions().setName("Directory")
        ).click();

        // Admin
        page.getByRole(
                AriaRole.LINK,
                new Page.GetByRoleOptions().setName("Admin")
        ).click();

        // Add user
        page.getByRole(
                AriaRole.BUTTON,
                new Page.GetByRoleOptions().setName(" Add")
        ).click();


        // User Role dropdown
        page.locator(".oxd-select-text")
                .nth(0)
                .click();

        page.getByRole(
                AriaRole.OPTION,
                new Page.GetByRoleOptions().setName("ESS")
        ).click();


        // Employee Name
        page.getByRole(
                AriaRole.TEXTBOX,
                new Page.GetByRoleOptions().setName("Type for hints...")
        ).fill("alex");

        page.getByText("Alex Morgan", new Page.GetByTextOptions().setExact(true))
                .click();


        // Username
        page.getByRole(AriaRole.TEXTBOX).nth(2).fill("alexa");


        // Password
        page.getByRole(AriaRole.TEXTBOX).nth(3).fill("Alexa@123456");


        // Confirm Password
        page.getByRole(AriaRole.TEXTBOX).nth(4).fill("Alexa@123456");


        // Save
        page.getByRole(
                AriaRole.BUTTON,
                new Page.GetByRoleOptions().setName("Save")
        ).click();


        // Logout
        page.getByRole(AriaRole.BANNER)
                .getByText("Alex Morgan")
                .click();

        page.getByRole(
                AriaRole.MENUITEM,
                new Page.GetByRoleOptions().setName("Logout")
        ).click();


        // Login with newly created user
        page.getByRole(
                AriaRole.TEXTBOX,
                new Page.GetByRoleOptions().setName("Username")
        ).fill("alexa");

        page.getByRole(
                AriaRole.TEXTBOX,
                new Page.GetByRoleOptions().setName("Password")
        ).fill("Alexa@123456");

        page.getByRole(
                AriaRole.BUTTON,
                new Page.GetByRoleOptions().setName("Login")
        ).click();
    }
}