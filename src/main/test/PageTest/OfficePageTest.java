package PageTest;

import org.testng.annotations.*;

import static Pages.StartSitePage.UPPER_BAR_OFFICE_LOCATOR;
import static Pages.StartSitePage.WHERE_ARE_YOU_FROM_LOCATOR;
import static Utils.WebDriverUtils.startBrowser;
import static Utils.WebDriverUtils.timeOut;
import static Utils.WebDriverUtils.clickInteractiveElement;
import static Utils.WebDriverUtils.getResponseCode;
import static Utils.WebDriverUtils.closeBrowser;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static Pages.OfficePage.NOTEBOOK24_FAVORITES_CLICK_LOCATOR;
import static Pages.LoginAndRegistrationPage.isElementsDisplayed;

public class OfficePageTest {

    @BeforeClass
    public static void openBrowser() {
        startBrowser();
        timeOut();
        clickInteractiveElement(WHERE_ARE_YOU_FROM_LOCATOR);
        timeOut();
    }

    @Test
    public static void addFavorites() {
        clickInteractiveElement(UPPER_BAR_OFFICE_LOCATOR);
        clickInteractiveElement(NOTEBOOK24_FAVORITES_CLICK_LOCATOR);
        timeOut();

        assertEquals(getResponseCode(), 200);
        assertTrue(isElementsDisplayed());
    }

    @AfterClass
    public static void exitBrowser() {
        closeBrowser();
    }
}