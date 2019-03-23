package Calculation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strChromePath="C:\\Users\\mampi\\Desktop\\Selenium\\Selenium Software\\Jars\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", strChromePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		
		List<WebElement> totalFrames= driver.findElements(By.tagName("iframe"));
		System.out.println("Total no of Frames are "+totalFrames.size());
		
		driver.switchTo().frame("iframe2");
		String expTitle= driver.findElement(By .className("entry-title")).getText();
		System.out.println("Tile: "+expTitle);
		
		driver.switchTo().defaultContent();
		driver.findElement(By .className("h1-size")).getText();
		
		
		
	}

}
