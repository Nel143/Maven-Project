package Week_2;

import org.checkerframework.common.value.qual.EnsuresMinLenIf;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.element.Element;
import java.util.List;

public class TagNameLocatorActivityOne {

    // Find how many buttons are in the BBC home pages.
    // And print the text of each button.

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get( "https://www.bbc.com/" );

        driver.manage().window().maximize();

        By anchorsTagLocator = By.tagName( "a" );

        List< WebElement > anchorsElements = driver.findElements( anchorsTagLocator );

        System.out.println( anchorsElements.size() );
        
        System.out.println();

        for ( WebElement element: anchorsElements ){

            System.out.println( element.getText() );
        }
        System.out.println();
        // Find how many image in the BBC home page.
        By imageTagLocator = By.tagName( "img" );

        List< WebElement > imageElement = driver.findElements( imageTagLocator );

        System.out.println( imageElement.size() );

        // Find how many button are in the BBC home page
        // And print the text of each button.
        By buttonLocator = By.tagName( "button" );

        List< WebElement > buttonElement = driver.findElements( buttonLocator);

        System.out.println( buttonElement.size() );

        // Find the text in BBC home page
        // And print the text
        for ( WebElement element : buttonElement ){

            System.out.println( element.getText() );
        }
        for ( WebElement element : buttonElement ){

            String text = element.getText();

            System.out.println( ! text.isEmpty() );
        }
        driver.quit();







    }
}
