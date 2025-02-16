package org.example.TestCases.totestselenoid;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import com.google.common.util.concurrent.Uninterruptibles;
import org.testng.annotations.Test;

public class RunTestsInSelenoid{

    @Test
    public void test1() throws MalformedURLException {
        // Define Selenoid-specific capabilities
        HashMap<String, Object> selenoidOptions = new HashMap<>();
        selenoidOptions.put("enableVNC", true);  // Enable VNC (view running browser)
        selenoidOptions.put("enableVideo", true);  // Enable video recording
        selenoidOptions.put("videoName", "test_video.mp4");  // Name of the recorded video
        selenoidOptions.put("name", "Test badge...");  // Test badge name
        selenoidOptions.put("env", new String[]{"TZ=UTC"});  // Set timezone
        selenoidOptions.put("labels", new HashMap<String, Object>() {{
            put("manual", "true");  // Add "trash" button in Selenoid UI
        }});

        // Set browser capabilities
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setCapability("selenoid:options", selenoidOptions);  // Use W3C-compliant format

        // Initialize Remote WebDriver with Selenoid
        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);

        // Open Google and perform a search
        driver.get("https://google.co.in");
        System.out.println("Page title: " + driver.getTitle());

        driver.findElement(By.name("q")).sendKeys("Testing minibytes", Keys.ENTER);

        // Wait for search results to load
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);

        // Quit the driver session
        driver.quit();
    }
}