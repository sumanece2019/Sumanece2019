package Calculation;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AirIndia_Timetable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strChromePath="C:\\Users\\mampi\\Desktop\\Selenium\\Selenium Software\\Jars\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", strChromePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.airindia.in/");		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//String mainWindow = driver.getWindowHandle();
		
		//TIMETABLE
		WebElement TRIP=driver.findElement(By.xpath("//a[@id='aMnu1']"));
		TRIP.click();
		//String first_page=driver.getTitle();
		//System.out.println(first_page);
		WebElement TIMETABLE=driver.findElement(By.xpath("//a[text()='Time Table']"));
		TIMETABLE.click();
		
		Select drp_down = new Select (driver.findElement(By .xpath("//select[@id='ContentPlaceHolder1_TimeTableControl1_ddlType']")));
		drp_down.selectByVisibleText("ORIGIN");
		
		driver.findElement(By .xpath("//input[@id='ContentPlaceHolder1_TimeTableControl1_txtSearch']")).sendKeys("DIGHA");
		
		driver.findElement(By .xpath("//input[@id='ContentPlaceHolder1_TimeTableControl1_btnGo']")).click();
		
		List<WebElement> cols=driver.findElements(By.xpath("//tr[@class='header evenRow']/th"));
		System.out.println("No. of Cols "+cols.size());
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='tableData']/tbody/tr"));
		System.out.println("No. of rows "+rows.size());
		
		if (cols.size()==0) 
		{
			
			System.out.println("No records found");
			
		}
		
		
		 //table[@class='tableData']/tbody/tr[2]/th[1]
		 //table[@class='tableData']/tbody/tr[5]/td[8]
		
		//PRINTING TIME TABLE HEADER
		for(int i=1;i<=cols.size();i++)
		{
			
			System.out.print(driver.findElement(By.xpath("//table[@class='tableData']/tbody/tr[1]/th["+i+"]")).getText()+"| |");
			
		}
		
		System.out.println();
		
		//PRINTING TIME TABLE
		for(int i=2;i<=rows.size();i++)
		{
			
			for(int j=1;j<=cols.size();j++)
			{
			
				System.out.print(driver.findElement(By.xpath("//table[@class='tableData']/tbody/tr["+i+"]/td["+j+"]")).getText()+" ");
				
			}
			System.out.println();
			System.out.println();
		}
	
		
		//WebElement f_book=driver.findElement(By.xpath("//a[text()='Book a Flight']"));
		//f_book.click();
		
		
		
		
		
		//driver.switchTo().window(mainWindow);
		//Set<String> s1 = driver.getWindowHandles();
		
	}

}
