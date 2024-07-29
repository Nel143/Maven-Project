package Week_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DropDownActivityFour {

    /*
    Navigate to Facebook.com click on create new account and filled up the form
    Do NOT click on sign up
     */

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get( "https://www.facebook.com/login.php/" );

        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(10) );

        WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10) );

        wait.until( ExpectedConditions.elementToBeClickable( By.linkText( "Create new account") ) ).click();

        wait.until( ExpectedConditions.visibilityOfElementLocated( By.className( "First name" ) ) )
                .sendKeys( "Tom" );

        wait.until(ExpectedConditions.visibilityOfElementLocated( By.name( "Last name" ) ) )
                .sendKeys( "John" );

        wait.until( ExpectedConditions.visibilityOfElementLocated( By.name( "reg_email__") ) )
                .sendKeys( "Tom.John@gmail.com" );

        wait.until( ExpectedConditions.visibilityOfElementLocated( By.name( "reg_passwd__" ) ) )
                .sendKeys( "Password1" );

        WebElement monthElement = wait.until( ExpectedConditions.visibilityOfElementLocated( By.id( "month" ) ) );
        Select monthSelect = new Select( monthElement );
        monthSelect.selectByIndex( 1 );

        WebElement dayElement = wait.until( ExpectedConditions.visibilityOfElementLocated( By.id( "day" ) ) );
        Select daySelect = new Select( dayElement );
        daySelect.selectByValue( "21" );

        WebElement yearelement = wait.until( ExpectedConditions.visibilityOfElementLocated( By.id( "year" ) ) );
        Select yearSelect = new Select( yearelement );
        yearSelect.selectByVisibleText( "1980" );

        wait.until( ExpectedConditions.visibilityOfElementLocated
                ( By.xpath( "//input[@value='2']" ) ) ).click();

    }
}
