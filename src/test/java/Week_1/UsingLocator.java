package Week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLocator {

    //     In Retail app, click on sign in then click on Create new Account
    //    then fill up the form and sign up. Expectation is to Create new Account.
    //    once account created make sure profile picture is displayed. (isDisplayed)
    //    And print result of isDisplayed method.

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get( "https://tek-retail-ui.azurewebsites.net/order" );

         By signInLocator = By.id("signinLink");

         WebElement signInElement = driver.findElement( signInLocator );

         signInElement.click();

         By newAccountLocator = By.id( "newAccountBtn" );

         WebElement newAccountElement = driver.findElement( newAccountLocator );

         newAccountElement.click();

         By nameLocator = By.id( "nameInput" );

         WebElement nameElement = driver.findElement( nameLocator );

         nameElement.sendKeys( "Nelofar" );

         By emailLocator = By.id( "emailInput" );

         WebElement emailElemnet = driver.findElement( emailLocator );

         emailElemnet.sendKeys( "nilofar.afzalyar@gmail.com" );

         By passwordLocator = By.id( "passwordInput" );

         WebElement passwordElement = driver.findElement( passwordLocator );

         passwordElement.sendKeys( "Password1" );

         By confirmPasswordlocator = By.id( "confirmPasswordInput" );

         WebElement confirmPasswordElement = driver.findElement( confirmPasswordlocator );

         confirmPasswordElement.sendKeys( "Password1" );

         By signUpLoactor = By.id( "signUpBtn" );

         WebElement signUpElement = driver.findElement( signUpLoactor );

         signUpElement.click();

         By profileLocator = By.id( "profileImage" );

         WebElement profileElement = driver.findElement( profileLocator );

         boolean profileIsDisplay = profileElement.isDisplayed();

         if ( profileIsDisplay ){

             System.out.println( "Test Passed" );
         } else
         {
             System.out.println( "Test Failed" );
         }
         driver.quit();








    }


}
