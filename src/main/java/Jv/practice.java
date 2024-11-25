package Jv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class practice {
	@Test
	public void select() {
	WebDriver driver = new ChromeDriver();
   driver.get("https://www.amazon.in");
   WebElement ele=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
   Select select = new Select(ele);
   select.selectByVisibleText("Electronics");
   select.selectByVisibleText("Books");
   select.selectByVisibleText("Appliances");
   

}
}