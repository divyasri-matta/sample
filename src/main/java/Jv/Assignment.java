package Jv;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignment {

	@Test
	public void setUp() {
		
		        ChromeOptions opt=new ChromeOptions();
		       //opt.addArguments("--headless");
		        WebDriver driver= new ChromeDriver(opt);
		        driver.manage().window().maximize();
		        driver.get("https://omayo.blogspot.com/");
		     
		        List<WebElement> elements=driver.findElements(By.tagName("button"));
		         for(WebElement element:elements){
		             System.out.println(element.getText());
		              WebElement blog= driver.findElement(By.id("blogsmenu"));
		             Actions action=new Actions(driver);
		             action.moveToElement(blog).build().perform();
		            }
		         
		         driver.close();
		    }
}
		

	


