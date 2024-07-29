package Week_3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertActivity {

    /*
    in link here "https://retail.tekschool-students.com/selenium/javascript-alerts"
    click on prompt button and when alerts opens.
    Enter your name in the alert input and click okay.
    then get the text below the alert button and print it.
     */

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get( "https://retail.tekschool-students.com/selenium/javascript-alerts" );

        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds( 15 ) );

        driver.findElement( By.id( "prompt" ) ).click();

        // Alert alert = driver.switchTo().alert();
        WebDriverWait wait = new WebDriverWait( driver,Duration.ofSeconds( 15 ) );

        // Option 2) using wait and ExpectedCondition as alertIsPresent
        Alert alert = wait.until(ExpectedConditions.alertIsPresent() );

        alert.sendKeys( "John" );

        alert.accept();

        String text = driver.findElement( By.id( "meassage") ).getText();

        System.out.println( text);

    }
}
