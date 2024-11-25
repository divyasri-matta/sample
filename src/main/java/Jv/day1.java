package Jv;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;

public class day1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.Amazon.in");
		WebElement ele = driver.findElement(By.name("field-keywords"));
		
		WebElement ele1 = driver.findElement(By.xpath("//button[@class='a-button-text']"));
		ele1.click();
		WebElement ele2 = driver.findElement(By.id("searchDropdownBox"));
		ele2.click();
		WebElement ele3= driver.findElement(By.className("nav-search-scope nav-sprite"));
		ele3.click();
		String Title=driver.getTitle();
		System.out.println(Title);
		if(Title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
			System.out.println("Test Case Verified");
		}
		else {
			System.out.println("Testcase Fail");
		}
		driver.navigate().to("https://www.Google.com");
		String URL= driver.getCurrentUrl();
		System.out.println(URL);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println("Program completed");
		
		 ele.sendKeys("AGCXBG");
	for(int i=0;i<=5;i++);
	
		Thread.sleep(5000);
     ele.sendKeys(Keys.ARROW_DOWN);    
	} 
	
     
	//driver.findElement(By.xpath("(//h3[text()='Online Python Compiler (Interpreter)'])[1])")).click();
	//WebElement loc = driver.findElement(By.xpath("//h3[text()='Amazon Customer Support']"));
   // loc.click();

	

}

