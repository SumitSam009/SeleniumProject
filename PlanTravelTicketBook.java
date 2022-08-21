package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PlanTravelTicketBook {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			WebElement close= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
			close.click();
			  
			WebElement travel= driver.findElement(By.xpath("//img[@alt='Travel']"));
			travel.click();
			
			
			List<WebElement> from=driver.findElements(By.xpath("//input[@class='_1w3ZZo _1YBGQV lZd1T6 _2vegSu _2mFmU7']"));
			Actions a = new Actions(driver);                    // Mouse Over Action on from
			 for (WebElement fromss:from) {
				a.moveToElement(fromss).perform();
				
				List<WebElement> to = driver.findElements(By.xpath("//input[@value='Bangkok, BKK - Bangkok']"));
				Actions a1 = new Actions(driver);                    // Mouse Over Action on to
				 for (WebElement allJwellary03 :to) {
					a1.moveToElement(allJwellary03).perform();
				
				 }
				
				//Thread.sleep(5000);
				
				//WebElement toto= driver.findElement(By.xpath("//input[@value='Kolkata, CCU - Netaji Subhash Chandra Bose Intl Airport, India']"));
				//toto.submit();
				
			
			 }	
			
	}

}
