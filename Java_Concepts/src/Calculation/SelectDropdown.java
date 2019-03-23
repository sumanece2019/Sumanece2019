package Calculation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strChromePath="C:\\Users\\mampi\\Desktop\\Selenium\\Selenium Software\\Jars\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", strChromePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		
		Select continents = new Select(driver.findElement(By.id("continents")));
		
		continents.selectByIndex(3);
		continents.selectByVisibleText("Africa");
		
		//Select sel_cmd = new Select(driver.findElement(By.id("selenium_commands")));
		
		//tagname[@property='propertyvalue']
		//tagname[text()=Textvalue'] Only for text element
		//select[@id='selenium_commands']
		//input[@type='text' and @name='firstname']
		//Select sel_cmd=new Select(driver.findElement(By.xpath("//select[@id='selenium_commands']")));
		
		//sel_cmd.selectByVisibleText("Navigation Commands");
		//sel_cmd.selectByVisibleText("Switch Commands");
		
		
	}

}
