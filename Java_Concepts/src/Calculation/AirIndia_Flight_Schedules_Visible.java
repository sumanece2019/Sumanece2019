package Calculation;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AirIndia_Flight_Schedules_Visible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strChromePath="C:\\Users\\mampi\\Desktop\\Selenium\\Selenium Software\\Jars\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", strChromePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.airindia.in/");		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String mainWindow = driver.getWindowHandle();
		
		//FLIGHT SCHEDULE
		WebElement TRIP=driver.findElement(By.xpath("//a[@id='aMnu1']"));
		TRIP.click();
		//String first_page=driver.getTitle();
		//System.out.println(first_page);
		WebElement Flight_Sch=driver.findElement(By.xpath("//a[text()='Flight Schedules']"));
		Flight_Sch.click();
		
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
				
				//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				String sec_page=driver.getTitle();
				System.out.println(sec_page);
		//--------------------SCHEDULES WINDOW----------------------		
		Select origin = new Select (driver.findElement(By .xpath("//select[@id='searchDepartLocation']")));
		origin.selectByVisibleText("Mumbai (BOM)");
				
		Select dest = new Select (driver.findElement(By .xpath("//select[@id='searchArriveLocation']")));
		dest.selectByVisibleText("London (LHR)");		
				
		driver.findElement(By .xpath("//input[@id='tripTypeReturnRadio']")).click();
		driver.findElement(By .xpath("//select[@id='wdfday0']")).sendKeys("31");
		Select origin_month = new Select (driver.findElement(By .xpath("//select[@id='wdfmonthyear0']")));
		origin_month.selectByVisibleText("March 2018");
		
		
		driver.findElement(By .xpath("//select[@id='wdfday1']")).sendKeys("7");
		Select dest_month = new Select (driver.findElement(By .xpath("//select[@id='wdfmonthyear1']")));
		dest_month.selectByVisibleText("April 2018");
		
		WebElement radio_weekly = driver.findElement(By .xpath("//input[@value='Weekly']"));
		
		radio_weekly.click();
		
		if (radio_weekly.isSelected()==true && !driver.findElement(By .xpath("//input[@name='bookButton']")).isDisplayed())
		{
			
			System.out.println("Element is Not visible");
			
		}
		else if (radio_weekly.isSelected()==false && driver.findElement(By .xpath("//input[@name='bookButton']")).isDisplayed())
		{
			
			System.out.println("Element is visible");
			
		}
			
		
		//driver.findElement(By .xpath("//input[@id='searchButton']")).click();
		
		
		
		
		//div[@id='outboundschedule']/table[@class='output caljnycal']/tbody/tr[2]/td[3]
		//div[@id='inboundschedule']/table[@class='output caljnycal']/tbody/tr[2]/td[6]
		
		/*
		List<WebElement> cols=driver.findElements(By.xpath("//div[@id='outboundschedule']/table[@class='output caljnycal']/tbody/tr/th"));
		System.out.println("No. of Cols "+cols.size());
		
		List<WebElement> rows=driver.findElements(By.xpath("//div[@id='outboundschedule']/table[@class='output caljnycal']/tbody/tr"));
		System.out.println("No. of rows "+rows.size());
		
		if (cols.size()==0) 
		{
			
			System.out.println("No records found");
			
		}
		//-----------------------------PRINTING FLIGHT POP UP DETAILS--------------------------------------
		//Actions action= new Actions(driver);
		
		
		for(int i=2;i<=rows.size();i++)
		{
			
			//System.out.print(driver.findElement(By.xpath("//div[@id='outboundschedule']/table[@class='output caljnycal']/tbody/tr[3]/td[3]")).getText()+" ");
			
			WebElement Flight_No= driver.findElement(By.xpath("//div[@id='outboundschedule']/table[@class='output caljnycal']/tbody/tr["+i+"]/td[3]/span/a"));
		
			System.out.print(Flight_No.getText());
			System.out.println("--------------------------------------");
			
			// Store the current window handle
			String winHandleBefore = driver.getWindowHandle();
			
			Flight_No.click();
			
			// Perform the click operation that opens new window

			// Switch to new window opened
			for(String winHandle : driver.getWindowHandles()){
				    driver.switchTo().window(winHandle);
			}
			
			System.out.println(driver.findElement(By .xpath("//p")).getText());
			System.out.print(driver.findElement(By .xpath("//li[@class='servicecode']/div[1]")).getText()+" : ");
			System.out.println(driver.findElement(By .xpath("//li[@class='servicecode']/div[2]")).getText());
			
			System.out.print(driver.findElement(By .xpath("//li[@class='loc deploc']/div[1]")).getText()+" : ");
			System.out.println(driver.findElement(By .xpath("//li[@class='loc deploc']/div[2]")).getText());
			
			//loc arrloc
			//date depdate
			
			driver.findElement(By.xpath("//a[text()='close the popup']")).click();
			
			
			// Switch back to original browser (first window)
			driver.switchTo().window(winHandleBefore);
		}
		
		//-------------------------------------------------------------------
		/*
		//PRINTING OUTBOUND TABLE HEADER
		for(int i=1;i<=cols.size();i++)
		{
			
			System.out.print(driver.findElement(By.xpath("//div[@id='outboundschedule']/table[@class='output caljnycal']/tbody/tr[1]/th["+i+"]")).getText()+"| |");
			
		} 
		
		System.out.println();
		
		//PRINTING OUTBOUND TABLE
		for(int i=2;i<=rows.size();i++)
		{
			
			for(int j=1;j<=cols.size()+1;j++)
			{
				try{
				     System.out.print(driver.findElement(By.xpath("//div[@id='outboundschedule']/table[@class='output caljnycal']/tbody/tr["+i+"]/td["+j+"]")).getText()+" ");
				} catch(Throwable e) {

					System.out.println("Merged");
					
				  }

			}
			System.out.println();
			System.out.println();
		}
	*/
		
		//driver.switchTo().window(mainWindow);
		//Set<String> s1 = driver.getWindowHandles();
		
	}

}
