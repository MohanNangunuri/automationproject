package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassOne {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohan Nangunuri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement firstname = driver.findElement(By.id("firstName"));
		action.click(firstname).sendKeys(firstname,"siddhi").build().perform();
		WebElement lastname = driver.findElement(By.id("lastName"));
		action.click(lastname).keyDown(lastname, Keys.SHIFT).sendKeys(lastname,"bhongir").build().perform();
		
		
		
		
		driver.close();
		driver.quit();
	}

}
