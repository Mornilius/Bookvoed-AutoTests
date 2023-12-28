package PageTest;

import org.testng.annotations.*;

import static Pages.SchoolPage.isElementsDisplayed;
import static Pages.StartSitePage.UPPER_BAR_BOOKS_LOCATOR;
import static Pages.StartSitePage.WHERE_ARE_YOU_FROM_LOCATOR;
import static Pages.StartSitePage.UPPER_BAR_OFFICE_LOCATOR;
import static Pages.StartSitePage.UPPER_BAR_SCHOOL_LOCATOR;
import static Utils.WebDriverUtils.startBrowser;
import static Utils.WebDriverUtils.timeOut;
import static Utils.WebDriverUtils.getResponseCode;
import static Utils.WebDriverUtils.isDisplay;
import static Utils.WebDriverUtils.closeBrowser;
import static Utils.WebDriverUtils.clickInteractiveElement;
import static Pages.BooksPage.BOOKS_LOCATOR;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static Pages.OfficePage.OFFICE_LOCATOR;

public class StartSitePageTest {

    @BeforeClass
    public static void openBrowser() {
        startBrowser();
        timeOut();
        clickInteractiveElement(WHERE_ARE_YOU_FROM_LOCATOR);
        timeOut();
    }

    @Test
    public static void checkOpenWebSite() {
        assertEquals(getResponseCode(), 200);
    }

    @Test
    public static void checkBooksPage() {
        clickInteractiveElement(UPPER_BAR_BOOKS_LOCATOR);
        timeOut();

        assertEquals(getResponseCode(), 200);
        assertTrue(isDisplay(BOOKS_LOCATOR));
    }

    @Test
    public static void checkOfficePage() {
        clickInteractiveElement(UPPER_BAR_OFFICE_LOCATOR);
        timeOut();

        assertEquals(getResponseCode(), 200);
        assertTrue(isDisplay(OFFICE_LOCATOR));
    }

    @Test
    public static void checkSchoolPage() {
        clickInteractiveElement(UPPER_BAR_SCHOOL_LOCATOR);
        timeOut();

        assertEquals(getResponseCode(), 200);
        assertTrue(isElementsDisplayed());
    }

    @AfterClass
    public static void exitBrowser() {
        closeBrowser();
    }
}