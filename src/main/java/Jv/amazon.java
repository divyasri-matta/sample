package Jv;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("selenium");
		
		for (int i = 0; i <= 3; i++)	
		{
			Thread.sleep(3000);
			ele.sendKeys(Keys.ARROW_DOWN);
		}

		ele.sendKeys(Keys.ENTER);
	}
}
