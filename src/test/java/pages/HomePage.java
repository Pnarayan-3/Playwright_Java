package pages;

import com.microsoft.playwright.Page;

public class HomePage {
    private final Page page;
    //private final String timeLink = "oxd-text oxd-text--span oxd-main-menu-item--name";
    private final String timeLink = "oxd-main-menu-item";

    public HomePage(Page page){
        this.page=page;
    }

    public void clickTimeLink(){
        page.locator(timeLink).click();
    }
}
