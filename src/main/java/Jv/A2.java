package Jv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class A2 {
//	@Test

	public void setup() {
		WebDriver divya = new ChromeDriver();
		divya.get("https://the-internet.herokuapp.com/");
		divya.findElement(By.linkText("Frames")).click();
		divya.findElement(By.linkText("Nested Frames")).click();
		divya.switchTo().frame("frame-top");
		divya.findElement(By.name("frame-middle")).click();
		divya.switchTo().defaultContent();
		divya.switchTo().frame("frame-top");
		divya.findElement(By.name("frame-left")).click();
//		divya.switchTo().parentFrame();
//		divya.switchTo().frame("frame-top");
//		divya.findElement(By.name("frame-right")).click();
		divya.findElement(By.cssSelector("button[value='LogIn']")).click();

		divya.close();
		System.out.println();

	}

//	@Test
	public void draganddrop() {
		WebDriver divya = new ChromeDriver();
		divya.get("http:/dhtmlgoodies.com/scripts//drag-drop-custom/demo-drag-drop-3.html");
		WebElement src = divya.findElement(By.xpath("//div[text()='Seoul' and@id='box5' ]"));
		WebElement des = divya.findElement(By.xpath("//div[text()='United States']"));
		WebElement src1 = divya.findElement(By.xpath("//div[text()='Rome'and @id='box6']"));
		WebElement des2 = divya.findElement(By.xpath("//div[text()='South Korea']"));

		Actions act = new Actions(divya);
		act.dragAndDrop(src, des).build().perform();

	}

//	@Test
	public void mouseOver() throws InterruptedException {
		WebDriver divya = new ChromeDriver();

		divya.manage().window().maximize();

		divya.get("https://omayo.blogspot.com/");
		WebElement src = divya.findElement(By.id("blogsmenu"));
		Actions act = new Actions(divya);
		Thread.sleep(2000);
		act.moveToElement(src).build().perform();

	}

//	@Test
	public void css() {
		WebDriver divya = new ChromeDriver();
		divya.get("https://omayo.blogspot.com/");
		divya.findElement(By.cssSelector("button[value='LogIn']")).click();
	}
@Test
	public void select() {
		WebDriver divya = new ChromeDriver();
		divya.get("https://omayo.blogspot.com/");
		WebElement multi = divya.findElement(By.id("multiselect"));
		Select obj = new Select(multi);
		obj.selectByVisibleText("Volvo");
		obj.selectByVisibleText("Swift");
		obj.selectByVisibleText("Hyundai");
} 
}
