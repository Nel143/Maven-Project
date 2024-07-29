package Week_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DropDownActivityTwo {

    /*
    From the page https://retail.tekschool-students.com/selenium/dropdown
    select website's language drop down select last option.
     */
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get( " https://retail.tekschool-students.com/selenium/dropdown" );

        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(10) );

        WebElement languageElement = driver.findElement( By.id( "languageSelect" ) );

        Select language = new Select( languageElement );

        language.deselectByVisibleText( "Italian" );

        driver.quit();
    }
}
