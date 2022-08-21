package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SundayTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
		search.sendKeys("java");
		
		Thread.sleep(5000);
		search.clear();
		WebElement search2 = driver.findElement(By.xpath("//input[@title='Search']"));
		search2.sendKeys("Selenium",Keys.ENTER);
		System.out.println(driver.getTitle());
	}

}
