package Week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class SynchronizationActivityOne {

    // In retail sign in with valid credentials and go to account page.
    // Update phone number and validate success toast is displayed.
    // Your test should work without changing multiple time.
    // Apply implicit and explicit wait.
    // Use any locators available and you like.
    // Push to repository.
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get( "https://tek-retail-ui.azurewebsites.net/" );

        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds( 15) );

        WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds( 15 ) );

        wait.until(ExpectedConditions.elementToBeClickable( By.linkText( "sign in" )) ).click();

        wait.until( ExpectedConditions.visibilityOfElementLocated( By.name( "email" )) )
                .sendKeys( "nilofar.afzalyar@gamil.com" );

        wait.until( ExpectedConditions.visibilityOfElementLocated( By.name( "Password" )) )
                .sendKeys( "Password1" );

        wait.until( ExpectedConditions.elementToBeClickable( By.id( "LoginBtn" )) ).click();

        wait.until( ExpectedConditions.elementToBeClickable( By.linkText( "Account" )) ).click();

        WebElement phoneElement = wait.until( ExpectedConditions
                .visibilityOfElementLocated( By.name( "password" )) );
        phoneElement.clear();
        phoneElement.sendKeys( "5632563225" );

        wait.until( ExpectedConditions.elementToBeClickable( By.id( "personalUpdateBtn" )) ).click();

        Boolean isToastDisplayed = wait.until( ExpectedConditions.
                visibilityOfElementLocated( By.className( "Toastify" ))).isDisplayed();

        if( isToastDisplayed )

            System.out.println( "Test Passed Toast Displayed" );
        else
            System.out.println( "Test failed" );
        driver.quit();
    }
}
