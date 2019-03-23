package Calculation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String strChromePath="C:\\Users\\mampi\\Desktop\\Selenium\\Selenium Software\\Jars\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", strChromePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		//WebDriverWait wait= new WebDriverWait(driver,10);
		
		/*
		//driver.findElement(By.className("btn btn-default"));
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		//button[text()='Click me!' and @onclick='myAlertFunction()']
		//button[@onclick='myAlertFunction()']
		//driver.switchTo().alert().accept();
		//System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().dismiss();
		
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		
		driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		//myalert.dismiss();
		*/
		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
		
		Alert myalert=driver.switchTo().alert();
		
		Thread.sleep(5000);
		myalert.sendKeys("Prompt Demo");
		Thread.sleep(5000);
		myalert.accept();
		
	}

}
