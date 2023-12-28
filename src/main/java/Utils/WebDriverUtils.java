package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

public class WebDriverUtils {

    public static final String URL = "https://www.bookvoed.ru/";
    public static WebDriver driver = getWebDriver("Firefox");
    public static final int TIME = 3;

    public static boolean isDisplay(By XPATH) {
        return driver.findElement(XPATH).isDisplayed();
    }

    public static void clickInteractiveElement(By XPATH) {
        driver.findElement(XPATH).click();
    }

    public static WebDriver getWebDriver(String browserName) {
        switch (browserName){
            case "Firefox":
                return new FirefoxDriver();
            case "Edge":
                return new EdgeDriver();
            case "Chrome":
                return new ChromeDriver();
            default:
                throw new RuntimeException("Incorrect browser name");
        }
    }

    public static int getResponseCode() {
        try{
            HttpURLConnection connection = (HttpURLConnection) new URL(driver.getCurrentUrl()).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();
            int response = connection.getResponseCode();
            return response;
        }catch(Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    public static void displayResponseCode() {
        System.out.println(getResponseCode());
    }

    public static void startBrowser() {
        driver.get(URL);
    }

    public static void closeBrowser() {
        driver.close();
    }

    public static void timeOut() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIME));
    }
}