package Calculation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strChromePath="C:\\Users\\mampi\\Desktop\\Selenium\\Selenium Software\\Jars\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", strChromePath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		//driver.findElement(By .name("q")).sendKeys("Suman");
		driver.findElement(By.name("btnK")).click();
		
		//http://toolsqa.com/automation-practice-form/
		
		
		
		
	}

}
