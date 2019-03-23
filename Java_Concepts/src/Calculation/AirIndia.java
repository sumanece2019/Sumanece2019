package Calculation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AirIndia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strChromePath="C:\\Users\\mampi\\Desktop\\Selenium\\Selenium Software\\Jars\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", strChromePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.airindia.in/");		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String mainWindow = driver.getWindowHandle();
		
		//MANAGE YOUR TRIP
		//String first_page=driver.getTitle();
		//System.out.println(first_page);
		WebElement TRIP=driver.findElement(By.xpath("//a[@id='aMnu1']"));
		TRIP.click();
		
		WebElement f_book=driver.findElement(By.xpath("//a[text()='Book a Flight']"));
		f_book.click();
		
		//NO of OPEN WINDOWS
		
		Set<String> s1 = driver.getWindowHandles();
		System.out.println("No. of open windows: " + s1.size());
		
		Iterator<String> i1= s1.iterator();
		
		for(int i=0; i<s1.size();i++)
		{
			String childWindow = i1.next();
			if (!mainWindow.equalsIgnoreCase(childWindow))
			{
				driver.switchTo().window(childWindow);
				//System.out.println("Child window title is: " + driver.getTitle());
				//driver.close();
			}
		}
		
		
		//EXPLICIT WAIT
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		
		//Booking With RETURN
		
		String sec_page=driver.getTitle();
		System.out.println(sec_page);
		
		WebElement v_radio =driver.findElement(By.xpath("//input[@id='wdfreturnradio']"));
		//v_radio=wait.until(ExpectedConditions.visibilityOfElementLocated(By .xpath("//input[@id='wdfreturnradio']")));
		v_radio.click();
		
		Select origin = new Select (driver.findElement(By .xpath("//select[@id='wdforigin1']")));
		origin.selectByVisibleText("Mumbai, Chhatrapati Shivaji International Airport, BOM, India");
		
		Select dest = new Select (driver.findElement(By .xpath("//select[@id='wdfdest1']")));
		dest.selectByVisibleText("London, London Heathrow International Airport, LHR, United Kingdom");
		
		WebElement start_date = driver.findElement(By .xpath("//input[@id='wdfdate1']"));
	    start_date.clear();
		start_date.sendKeys("31/03/2018");
		
		
		WebElement return_date = driver.findElement(By .xpath("//input[@id='wdfdate2']"));
		return_date.clear();
		return_date.sendKeys("07/04/2018");
		
		driver.findElement(By .xpath("//input[@value='Book Now']")).click();
		
		driver.findElement(By .xpath("//input[@alt='New search']")).click();
		
		
		
		//driver.switchTo().window(mainWindow);
		//Set<String> s1 = driver.getWindowHandles();
		
	}

}
