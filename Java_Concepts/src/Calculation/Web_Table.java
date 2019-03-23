package Calculation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strChromePath="C:\\Users\\mampi\\Desktop\\Selenium\\Selenium Software\\Jars\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", strChromePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		driver.findElement(By.linkText("Link Test")).click();
		//driver.findElement(By.className("tsc_table_s13")).getText();
		
		//System.out.println(driver.findElement(By.className("tsc_table_s13")).getText());
		//System.out.println(driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/")).getText());
		//System.out.println(driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[1]/th")).getText());
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
		System.out.println("No. of Rows "+rows.size());
		
		List<WebElement> cols=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[1]/td"));
		System.out.println("No. of Cols "+cols.size());
		
		for(int i=1;i<=rows.size();i++)
		{
			
			for(int j=1;j<cols.size();j++)
			{
			
				System.out.print(driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/td["+j+"]")).getText()+" ");
				
			}
			System.out.println();
		}
		
	}

}
