package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign08 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement search = driver.findElement(By.xpath("//input[@name='search_query']"));
		search.sendKeys("Rings", Keys.ENTER);

		WebElement Metal = driver.findElement(By.xpath("//span[text()='Metal']"));
		Actions a = new Actions(driver);    // mouse over action
		a.moveToElement(Metal).perform();

		WebElement platinum = driver.findElement(By.xpath("//span[@data-displayname='platinum']"));
		System.out.println(platinum.getText());        
		platinum.click();

		/*
		 * List<WebElement> ArrowDown =
		 * driver.findElements(By.xpath("//span[@data-displayname='platinum']")); for
		 * (WebElement metal : ArrowDown) { String name = metal.getText();
		 * System.out.println(name); // console shows platinum(79) }
		 */

		// driver.close();

	}

}
