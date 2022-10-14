package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HookStep {

    public static WebDriver webDriver;

    @Before
    public void setup() {
        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--disable-extensions");
        chrome_options.addArguments("--disable-popup-blocking");
        chrome_options.addArguments("--profile-directory=Default");
        chrome_options.addArguments("--ignore-certificate-errors");
        chrome_options.addArguments("--disable-plugins-discovery");
//        chrome_options.addArguments("--incognito");
        chrome_options.addArguments("user_agent=DN");
        chrome_options.addArguments("user-data-dir=C:\\Users\\fpsar\\AppData\\Local\\Google\\Chrome\\User Data");
        chrome_options.addArguments("--profile-directory=Default");

        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver106\\chromedriver.exe");
        webDriver = new ChromeDriver(chrome_options);
        webDriver.manage().window().maximize();

        try {
            webDriver.get("https://staging.cicle.app");
            Thread.sleep(10000);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            webDriver.get("https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8");
        }
//        webDriver.get("https://staging.cicle.app/signin");

    }


    @After
    public void closeBrowser(){
        webDriver.quit();
    }
}
