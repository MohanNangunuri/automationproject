package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().version("95.0.4638.54").setup();
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://www.google.com/");

		Thread.sleep(2000);
	chrome.close();
		chrome.quit();
		
		
		
	}

}
