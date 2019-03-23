package Calculation;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToolsQA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strChromePath="C:\\Users\\mampi\\Desktop\\Selenium\\Selenium Software\\Jars\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", strChromePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		driver.findElement(By .name("firstname")).sendKeys("Ria");
		driver.findElement(By .name("lastname")).sendKeys("Pal");
		driver.findElement(By .id("sex-1")).click();
		driver.findElement(By .id("exp-3")).click();
		driver.findElement(By .id("datepicker")).sendKeys("24/02/2018");
		driver.findElement(By.id("profession-1")).click();
		//driver.findElement(By .id("photo")).click();
		
		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\mampi\\Desktop\\ria pic\\DSC_1102.NEF");
		WebElement element=driver.findElement(By.id("continents"));
		
		Select drop_element= new Select(element);
	
		//drop_element.selectByVisibleText("Äfrica");
		drop_element.selectByIndex(2);
		
		
		//driver.findElement(By.linkText("Link Test")).click();
		//driver.findElement(By.partialLinkText("Test File")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input")).sendKeys("Sameer");
		
		//tagname[@property= 'propertyvalue']
		//input[@name='firstname']
		
	}

	

}
