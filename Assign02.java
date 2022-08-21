package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign02 {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.bluestone.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			  
			List<WebElement> menus = driver.findElements(By.xpath("//a[@href='https://www.bluestone.com/jewellery.html']"));
			Actions a =new Actions(driver);                 //22-24 is called mouse over action
			 for(WebElement menu : menus) {
				 a.moveToElement(menu).perform();
				 
				 Thread.sleep(2000);
			 }
			 Thread.sleep(2000);
			 
			 WebElement goldcoins = driver.findElement(By.xpath("//a[text()='Gold Coins']"));
			 goldcoins.click();
			 
			 Thread.sleep(2000);
			 
			 WebElement Gram20 = driver.findElement(By.xpath("//span[text()=20]"));
			 Gram20.click();
			 
			 boolean  GoldCoin = Gram20.isDisplayed();
			 System.out.println(Gram20.isDisplayed());
			 
			 }
		
          }
