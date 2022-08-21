package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign09 {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.bluestone.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			WebElement search = driver.findElement(By.xpath("//input[@name='search_query']"));
			search.sendKeys("Rings",Keys.ENTER);
			
			WebElement RING = driver.findElement(By.xpath("//a[@href='https://www.bluestone.com/jewellery/rings.html']"));
			RING.click();
			
			
			WebElement GoldPurity = driver.findElement(By.xpath("//span[text()='Gold Purity']"));
			GoldPurity.click();
			
			//WebElement purity22k = driver.findElement(By.xpath("//span[@data-displayname='22k']"));
			//System.out.println(purity22k.getText());
			
			
			List<WebElement> goldpurity = driver.findElements(By.xpath("//span[@data-p='jewellery@22k-rings!!']"));
			 for (WebElement purity : goldpurity) {
			 String name = purity.getText();
				System.out.println(name);  
				} 
			
		driver.close();
		
	}	
		
	}
