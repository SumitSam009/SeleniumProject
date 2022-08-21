package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software1/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		  
		List<WebElement> menus = driver.findElements(By.xpath("//a[@href='https://www.bluestone.com/jewellery.html']"));
		Actions a =new Actions(driver);       // 21-23 is called mouseover action
		 for(WebElement menu : menus) {
			 a.moveToElement(menu).perform();
			
			 Thread.sleep(2000);
		 }
		 Thread.sleep(2000);
		 
		 WebElement goldcoins = driver.findElement(By.xpath("//a[text()='Gold Coins']"));
		 goldcoins.click();
		 
		 Thread.sleep(2000);
		 
		 WebElement Gram50 = driver.findElement(By.xpath("//span[text()=50]"));
		 Gram50.click();
		 
		 boolean  GoldCoin = Gram50.isDisplayed();
		 System.out.println(Gram50.isDisplayed());
		 
		}
	 }
