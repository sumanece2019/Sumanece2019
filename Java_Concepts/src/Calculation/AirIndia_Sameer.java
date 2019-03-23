package Calculation;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AirIndia_Sameer {

	public static void main(String[] args) {
		//String strChromePath = "D:\\SeleniumJar\\Selenium\\chromedriver_win32\\chromedriver.exe";
		String strChromePath="C:\\Users\\mampi\\Desktop\\Selenium\\Selenium Software\\Jars\\chromedriver_win32\\chromedriver.exe";
		String strBaseUrl = "http://www.airindia.com/";
		
		System.setProperty("webdriver.chrome.driver", strChromePath);
		WebDriver driver = new ChromeDriver();
	
		driver.get(strBaseUrl);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String mainWindow = driver.getWindowHandle();
		
		WebElement manageYourHome = driver.findElement(By .xpath("//a[@class='menuFirstNode' and @id='aMnu1']"));
		
		Actions builder = new Actions(driver);
		builder.clickAndHold(manageYourHome);
		Action mouseHover = builder.build();
		mouseHover.perform();
		
		driver.findElement(By .xpath("//a[text()='Book a Flight']")).click();
		
		Set<String> s1 = driver.getWindowHandles();
		System.out.println("No. of open windows: " + s1.size());
		
		Iterator<String> i1= s1.iterator();
		
		for(int i=0; i<s1.size();i++)
		{
			String childWindow = i1.next();
			if (!mainWindow.equalsIgnoreCase(childWindow))
			{
				driver.switchTo().window(childWindow);
				System.out.println("Child window title is: " + driver.getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
		System.out.println("Main window title is: " + driver.getTitle());
	}

}
