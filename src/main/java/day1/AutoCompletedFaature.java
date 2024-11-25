package day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletedFaature {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("amazon");
		Thread.sleep(2000);
		String val = "amazon customer care number";
		List<WebElement> values = driver.findElements(By.xpath("//div[@class='eIPGRd']//div[@class='wM6W7d']"));
		List<String> allvalues = new ArrayList<String>();
		for (WebElement e : values) {
			Thread.sleep(1000);
			String texts = e.getText();
			System.out.println(texts);
			allvalues.add(texts);
		}
		
		System.out.println(allvalues.size());
		
		for (WebElement e : values) {
			ele.sendKeys(Keys.ARROW_DOWN);
			String texts = e.getText();
			if(texts.equalsIgnoreCase(val)) {
				ele.sendKeys(Keys.ENTER);
				break;
			}
		}
		WebElement ele1= driver.findElement(By.xpath("//h3[text()='Amazon – Contact Us']"));
		ele1.click();
		WebElement ele2=driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
		ele2.click();
		WebElement ele3 =driver.findElement(By.name("customerName"));
				//.xpath("//a[@id='ap_customer_name']"));
		ele3.sendKeys("divya matta");
		//ele3.sendKeys(Keys.ENTER);
		WebElement ele4=driver.findElement(By.xpath("//input[@id='ap_phone_number']"));
		ele4.sendKeys("9133034321");
		WebElement ele5 =driver.findElement(By.name("password"));
		ele5.sendKeys("Divya123");
		//ele5.sendKeys(Keys.ENTER);
	}
}
