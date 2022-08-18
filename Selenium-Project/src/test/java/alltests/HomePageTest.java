package alltests;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value = TestListener.class)
public class HomePageTest extends BaseTest {

    @Test
    public void test1(){
        startHomePage()
                .registerUser().clickOpenAccountLink();
    }


}
