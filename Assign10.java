package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign10 {

	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.bluestone.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			WebElement search = driver.findElement(By.xpath("//input[@name='search_query']"));
			search.sendKeys("Rings",Keys.ENTER);
			
			WebElement RING = driver.findElement(By.xpath("//a[@href='https://www.bluestone.com/jewellery/rings.html']"));
			RING.click();
			
			
			WebElement Gender =driver.findElement(By.xpath("//span[text()='Gender']"));
			Gender.click();
			
			WebElement suggestWomen = driver.findElement(By.xpath("//span[@data-displayname='women']"));
			System.out.println(suggestWomen.getText());
			
			driver.close();
		

	}

}
