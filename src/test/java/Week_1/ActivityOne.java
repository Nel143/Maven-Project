package Week_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityOne {

    public static void main(String[] args){

        ChromeDriver driver = new ChromeDriver();

        driver.get( "https://mail.google.com/mail/u/0/#inbox?projector=1" );

        driver.quit();

        driver.manage().window().maximize();

        driver.manage().window().maximize();

        String title = driver.getTitle();

        System.out.println(title);


        
    }
}
