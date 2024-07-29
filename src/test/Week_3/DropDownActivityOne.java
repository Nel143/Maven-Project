package Week_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DropDownActivityOne {

    /* From the page https://retail.tekschool-students.com/selenium/dropdown
    select your country drop down and select United States.
     */


    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get( "https://retail.tekschool-students.com/selenium/dropdown" );

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(10) );

        WebElement countryElement = driver.findElement(By.name("Country") );

        Select countrySelect = new Select( countryElement );

        countrySelect.selectByValue( "United States" );

        driver.quit();
    }
}
