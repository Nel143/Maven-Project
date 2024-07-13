package Week_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityOne {

    public static void main(String[] args){

        ChromeDriver driver = new ChromeDriver();

        // Navigate to "https://mail.google.com/mail/u/0/#inbox?projector=1"

        driver.get( "https://mail.google.com/mail/u/0/#inbox?projector=1" );

        // Close browser.
        driver.quit();

        // Maximize window.

        driver.manage().window().maximize();

        // Minimize window.

        driver.manage().window().minimize();

        // Print title.

        String title = driver.getTitle();


        // Push changes to respiratory.


        
    }
}
