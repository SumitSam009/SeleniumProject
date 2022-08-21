package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign07 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement search = driver.findElement(By.xpath("//input[@name='search_query']"));
		search.sendKeys("Rings",Keys.ENTER);

		
		WebElement Delivery = driver.findElement(By.xpath("//label[@for='filter_ndd']"));
		Delivery.click();
		
		WebElement nextdayDelivery = driver.findElement(By.xpath("//label[@for='filter_ndd']"));
		System.out.println(nextdayDelivery.getText());
		
		driver.close();
		
	}

}
