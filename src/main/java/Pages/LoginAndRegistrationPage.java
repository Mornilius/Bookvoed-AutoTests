package Pages;

import org.openqa.selenium.By;
import static Utils.WebDriverUtils.driver;

public class LoginAndRegistrationPage {

    public static final By MAIN_WINDOW_LOCATOR = By.xpath("//*[@id='bottom_action']/div");
    public static final By LOG_AND_REGISTRATION_LOCATOR = By.xpath("//*[@id='bottom_action-bac-phone_auth_form']/form/h2");
    public static final By SUPPORT_TEXT_LOCATOR = By.xpath("//*[@id='bottom_action-bac-phone_auth_form']/form/p[1]");
    public static final By PHONE_TEXT_LOCATOR = By.xpath("//*[@id='bottom_action-bac-phone_auth_form-phone']/label");
    public static final By PHONE_INPUT_FORM_LOCATOR = By.xpath("//*[@id='bottom_action-bac-phone_auth_form-phone-input']");
    public static final By GET_CODE_BTN_LOCATOR = By.xpath("//*[@id='bottom_action-bac-phone_auth_form']/form/div[3]");
    public static final By AGREEMENT_PERS_TEXT_LOCATOR = By.xpath("//*[@id='bottom_action-bac-phone_auth_form']/form/p[2]");

    public static boolean isElementsDisplayed() {
        return driver.findElement(MAIN_WINDOW_LOCATOR).isDisplayed() &&
                driver.findElement(LOG_AND_REGISTRATION_LOCATOR).isDisplayed() &&
                driver.findElement(SUPPORT_TEXT_LOCATOR).isDisplayed() &&
                driver.findElement(PHONE_TEXT_LOCATOR).isDisplayed() &&
                driver.findElement(PHONE_INPUT_FORM_LOCATOR).isDisplayed() &&
                driver.findElement(GET_CODE_BTN_LOCATOR).isDisplayed() &&
                driver.findElement(AGREEMENT_PERS_TEXT_LOCATOR).isDisplayed();
    }
}