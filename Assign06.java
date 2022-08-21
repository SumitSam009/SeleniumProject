package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign06 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement search = driver.findElement(By.xpath("//input[@name='search_query']"));
		search.sendKeys("Rings",Keys.ENTER);
		
		
		//WebElement Ring = driver.findElement(By.xpath("//span[text()='Price']"));
		
		

		/*List<WebElement> price = driver.findElements(By.xpath("//span[text()='Price']"));
		 Actions a = new Actions(driver);                    // Mouse Over Action on price
		 for (WebElement ring : price) {
			a.moveToElement(ring).perform();
			System.out.println(ring);
			} */
			
			WebElement Price = driver.findElement(By.xpath("//span[text()='Price']"));
			Price.click();
			
			WebElement Arrow = driver.findElement(By.xpath("//span[@data-displayname='below rs 10000']"));
			System.out.println(Arrow.getText());
			
			driver.close();
			}
     }
