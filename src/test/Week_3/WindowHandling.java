package Week_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class WindowHandling {

    /*
    To handle new tab with selenium
    Get current window id. Before new tab open
    then open new tab.
    Get all tabs id.( Make sure to have only 2 tab )
    Loop through all tabs and switch to new tab when the is not equals to current tab.
     */

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get( "https://retail.tekschool-students.com/");

        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds( 10 ) );

        // Step 1) Get current window id.
        String currentWindowId = driver.getWindowHandle();

        driver.findElement( By.linkText( "Test Selenium") ).click();

        // Step 2) Get all tabs id.
        Set<String> allTabs = driver.getWindowHandles();

        // Step 3) Switch to new tab
        for ( String tab : allTabs ){

            if ( !tab.equals( currentWindowId ) ){
                driver.switchTo().window( tab );
                break;
            }
        }
        driver.findElement( By.linkText( "Inputs" ) ).click();

        driver.close();

        // It's important to switch back to main window once new tab closed.

        driver.switchTo().window( currentWindowId );

        driver.findElement( By.linkText( "Sign in" ) ).click();

        driver.quit();


    }
}
