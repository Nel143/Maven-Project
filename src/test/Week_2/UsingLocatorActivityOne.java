package Week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLocatorActivityOne {

    /*
    In Reatail app go to create new account
    and create new account
    use name, id, LinkText or anything that is available.
     */

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get( "https://tek-retail-ui.azurewebsites.net/" );

        driver.manage().window().maximize();

        By signInLocator = By.linkText( "Sign in" );
        WebElement signInElement = driver.findElement( signInLocator );
        signInElement.click();

        By newAccountLocator = By.id( "newAccountBtn" );
        WebElement newAcountElement = driver.findElement( newAccountLocator );
        newAcountElement.click();

        By nameLocator = By.id( "nameInput" );
        WebElement nameElement = driver.findElement( nameLocator );
        nameElement.sendKeys( "Nelofar" );

        By emailLocator = By.id( "emailInput" );
        WebElement emailElement = driver.findElement( emailLocator );
        emailElement.sendKeys( "nilofar.afzalyar@gamil.com" );

        By passwordLocator = By.id( "passwordInput" );
        WebElement passWordelement = driver.findElement( passwordLocator );
        passWordelement.sendKeys( "Password1" );

        By conFirmPasswordLocator = By.id( "confirmPasswordInput" );
        WebElement conFirmPasswordElement =  driver.findElement( conFirmPasswordLocator );
        conFirmPasswordElement.sendKeys( "Password1" );

        By signUpLocator = By.id( "signupBtn" );
        WebElement signUpElement = driver.findElement( signUpLocator );
        signUpElement.click();

        By errorLocator = By.id( "error" );
        WebElement errorElement = driver.findElement( errorLocator );
        String errorText = errorElement.getText();

        System.out.println( "errorText" );

        driver.quit();








    }
}
