package Week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSActivityOne {

    // In Retail app navigate to sign in and login with valid credentials and after
    // sign in go to account page and print profile email.
    // Only use CSS selector.
    // Push to GitHub repository.

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get( "https://tek-retail-ui.azurewebsites.net/" );

        driver.findElement( By.cssSelector( "#signinLink" )).click();

        driver.findElement( By.cssSelector( "input[name='email']" ))
                .sendKeys( "nilofar.afzalyar@gmail.com" );

        driver.findElement( By.cssSelector( "input[name='password']" ))
                .sendKeys("password123" );

        driver.findElement( By.cssSelector( ".login__submit" )).click();

        driver.findElement( By.cssSelector( "#accountLink" )).click();

        String actualEmailText = driver.findElement( By.cssSelector( "div.account__Information-detail>h1:last-child"))
                .getText();

        System.out.println( actualEmailText );

        driver.quit();
    }
}
