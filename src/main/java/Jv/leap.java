package Jv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class leap{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
driver.findElement(By.className("M6CB1c yZqNl")).click();
   
    driver.close();
    Thread.sleep(2000);
	}
}
