package Jv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn {

	public static void main(String[] args)   {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		WebElement ele= driver.findElement(By.cssSelector("input#email"));
		ele.sendKeys("lkjhgfds");
		
		
		
	}

}
