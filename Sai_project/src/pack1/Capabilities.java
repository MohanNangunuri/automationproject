package pack1;


import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Capabilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohan Nangunuri\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		
		try {
			driver.get("https://demoqa.com/automation-practice-form");
			String sessionid = ((RemoteWebDriver)driver).getSessionId().toString();
			System.out.println(sessionid);
			String browsername = ((RemoteWebDriver)driver).getCapabilities().getBrowserName();
			System.out.println(browsername);
			String platform = ((RemoteWebDriver)driver).getCapabilities().getPlatform().toString();
			System.out.println(platform);
			String version = ((RemoteWebDriver)driver).getCapabilities().getVersion();
			System.out.println(version);
			String version1 = ((RemoteWebDriver)driver).getCapabilities().getCapability("browserversion").toString();
			System.out.println(version1);
			Set<String> caps = ((RemoteWebDriver)driver).getCapabilities().getCapabilityNames();
			
			for(String cap1:caps)			{ 					
				System.out.println(cap1);
			
			}
			
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	finally
	{
		driver.close();		
		driver.quit();
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
