package Calculation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Tooltips {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String strChromePath="C:\\Users\\mampi\\Desktop\\Selenium\\Selenium Software\\Jars\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", strChromePath);
		WebDriver driver=new ChromeDriver();
		//driver.get("http://www.airindia.com/");
		String mainWindow=driver.getWindowHandle();
		
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement mic=driver.findElement(By .id("gsri_ok0"));
		//mic.click();
		Actions builder= new Actions(driver);
		builder.clickAndHold(<webelement>);
		Action mouseHover = builder.moveToElement(mic).build();
		mouseHover.perform();
		
		Set<String> s1=driver.getWindowHandles();
		System.out.println("No. of open windows: "+ s1.size());
		
		Iterator<String> i1=s1.iterator();
		
		for (int i=0;i<s1.size();i++)
		{
			
			String childWindow=i1.next();
			if (!mainWindow.equalsIgnoreCase(childWindow))
			{
				
				
			}
			
		}
		
		String strExpectText="Search by voice";
		String actualText=driver.findElement(By.className("gsst_a")).getAttribute("aria-label");
		
		if (strExpectText==actualText)
		{
			System.out.println("Matching "+actualText);
		}
		else
		{
			System.out.println("Not Matching "+actualText+"  "+strExpectText);
		
		}
		*/
	}

}
		