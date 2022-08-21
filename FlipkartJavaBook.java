package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartJavaBook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		WebElement Search = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		  Search.sendKeys("Java Book",Keys.ENTER);
		  
		  WebElement LowHigh = driver.findElement(By.xpath("//div[text()='Price -- Low to High']"));
		  LowHigh.click();
	
	
	}

}
