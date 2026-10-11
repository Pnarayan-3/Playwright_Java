package tests;

import base.BaseTest;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import org.testng.annotations.Test;

public class LocatorsDemo extends BaseTest {
    @Test
    public void testAllLocators(){
        page.navigate("https://trytestingthis.netlify.app/");
        //id
        page.locator("#fname").fill("tom");
        //name attribute
        page.locator("input[name='lname']").fill("jerry");

        //page.pause();

        //radio btn using value
        page.locator("input[value='male']").check();

        //using nth element-radio btn
        page.locator("input[type='radio']").nth(1).check();

        //dropdown box
        page.locator("select#option").selectOption("Option 2");
        //we can also use this
        page.locator("#option").selectOption("Option 3");

        //checkbox
        page.locator("input[type='checkbox][value='Option 3']").check();
        //we can also use
        page.locator("input[name='option1']").check();
        page.getByLabel("Option 1").check();

        //xpath
        //date
        page.locator("//input[@type='date]").fill("2026-10-11");

        //visible links-btn
        page.getByText("Click Me").click();

        //role selector(for accessibility)
        page.getByRole(AriaRole.BUTTON,new Page.GetByRoleOptions().setName("Submit")).click();

        /*
        Do's: use id,name,value
              use getByText() for buttons
              use getByRole() for accessibility
         */

        /*
        Don'ts: Avoid auto-generated classes
                Avoid absolute XPaths
                Don't hardcode index unless stable
         */

        //do visit playwright fixtures.(fixtures are setups prepared in advance that tests can use when needed.
    }
}
