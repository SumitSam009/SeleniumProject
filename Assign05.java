package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign05 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> allJwellary = driver.findElements(By.xpath("//a[@href='https://www.bluestone.com/jewellery.html']"));
		 Actions a = new Actions(driver);                    // Mouse Over Action on jwellary
		 for (WebElement allJwellary02 : allJwellary) {
			a.moveToElement(allJwellary02).perform(); 
		 }
		
		 WebElement goldcoin = driver.findElement(By.xpath("//a[@title='Gold Coins']"));
		 goldcoin.click();
		 Thread.sleep(2000);
		 
		 WebElement CoinGram5 = driver.findElement(By.xpath("//span[text()='10']"));
		 CoinGram5.click();
		 
		 WebElement LaxmiCoin = driver.findElement(By.id("pid_9167"));
		 LaxmiCoin.click();
		 
		 boolean  GoldCoin = LaxmiCoin.isDisplayed();
		 System.out.println(LaxmiCoin.isDisplayed());
		 
		 Thread.sleep(2000);
		 driver.close();  
		 
        }

      }
