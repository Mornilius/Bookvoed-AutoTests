package Pages;

import org.openqa.selenium.By;

import static Utils.WebDriverUtils.driver;

public class SchoolPage {

    public static final By FIRST_CLASS_LOCATOR = By.xpath("//*[@id='tabs']/div/div[2]/div[1]/div[1]/div/div/div[1]/a");
    public static final By SECOND_CLASS_LOCATOR = By.xpath("//*[@id='tabs']/div/div[2]/div[1]/div[1]/div/div/div[2]/a");
    public static final By THIRD_CLASS_LOCATOR = By.xpath("//*[@id='tabs']/div/div[2]/div[1]/div[1]/div/div/div[3]/a");
    public static final By FOURTH_CLASS_LOCATOR = By.xpath("//*[@id='tabs']/div/div[2]/div[1]/div[1]/div/div/div[4]/a");
    public static final By FIFTH_CLASS_LOCATOR = By.xpath("//*[@id='tabs']/div/div[2]/div[1]/div[1]/div/div/div[5]/a");
    public static final By SIXTH_CLASS_LOCATOR = By.xpath("//*[@id='tabs']/div/div[2]/div[1]/div[1]/div/div/div[6]/a");
    public static final By SEVENTH_CLASS_LOCATOR = By.xpath("//*[@id='tabs']/div/div[2]/div[1]/div[1]/div/div/div[7]/a");
    public static final By EIGHTH_CLASS_LOCATOR = By.xpath("//*[@id='tabs']/div/div[2]/div[1]/div[1]/div/div/div[8]/a");
    public static final By NINTH_CLASS_LOCATOR = By.xpath("//*[@id='tabs']/div/div[2]/div[1]/div[1]/div/div/div[9]/a");
    public static final By TENTH_CLASS_LOCATOR = By.xpath("//*[@id='tabs']/div/div[2]/div[1]/div[1]/div/div/div[10]/a");
    public static final By ELEVENTH_CLASS_LOCATOR = By.xpath("//*[@id='tabs']/div/div[2]/div[1]/div[1]/div/div/div[11]/a");

    public static boolean isElementsDisplayed() {
        return driver.findElement(FIRST_CLASS_LOCATOR).isDisplayed() &&
                driver.findElement(SECOND_CLASS_LOCATOR).isDisplayed() &&
                driver.findElement(THIRD_CLASS_LOCATOR).isDisplayed() &&
                driver.findElement(FOURTH_CLASS_LOCATOR).isDisplayed() &&
                driver.findElement(THIRD_CLASS_LOCATOR).isDisplayed() &&
                driver.findElement(FIFTH_CLASS_LOCATOR).isDisplayed() &&
                driver.findElement(SIXTH_CLASS_LOCATOR).isDisplayed() &&
                driver.findElement(SEVENTH_CLASS_LOCATOR).isDisplayed() &&
                driver.findElement(EIGHTH_CLASS_LOCATOR).isDisplayed() &&
                driver.findElement(NINTH_CLASS_LOCATOR).isDisplayed() &&
                driver.findElement(TENTH_CLASS_LOCATOR).isDisplayed() &&
                driver.findElement(ELEVENTH_CLASS_LOCATOR).isDisplayed();
    }
}