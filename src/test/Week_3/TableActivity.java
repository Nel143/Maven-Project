package Week_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class TableActivity {

    /*
    On Insurance app "https://div.insurance.tekschool-students.com/", login with
    supervisor/ tek_supervisor credentials, and go to plan section
    then print all the price values from tables.
     */
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get( "https://div.insurance.tekschool-students.com/" );

        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds( 10 ) );

        driver.findElement( By.linkText( "login" ) ).click();

        driver.findElement( By.name( "username" ) ).sendKeys( "supervisor" );

        driver.findElement( By.name( "password" ) ).sendKeys( "tek_supervisor");

        driver.findElement( By.xpath( "//button[text()='sign In']" ) ).click();

        driver.findElement( By.linkText( "plan" ) ).click();

        List<WebElement> priceElements = driver.findElements
                ( By.xpath("//table/tbody/tr/td[3]" ) );

        for ( WebElement element : priceElements  ){

            System.out.println( element.getText() );

            driver.quit();
        }
    }
}
