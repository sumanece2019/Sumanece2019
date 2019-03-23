package Calculation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strChromePath="C:\\Users\\mampi\\Desktop\\Selenium\\Selenium Software\\Jars\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", strChromePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com");
		//driver.get("https://mail.google.com/mail/u/0/#inbox");
		
		
		WebElement mail_id=driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf' and @aria-label='Email or phone']"));
		
		mail_id.sendKeys("Sumanece14151");
		
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//EXPLICIT WAIT
		//WebDriverWait wait = new WebDriverWait(driver,20);
		
		//System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("12345");
		//WebElement pwd;
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("james007");
		//pwd=wait.until(ExpectedConditions.visibilityOfElementLocated(By .name("lastnam")));
		
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		//driver.findElement(By.xpath("//span[@class='gb_db gbii']")).click();
		//WebDriverWait wait = new WebDriverWait(driver,20);
	
		//SOCIAL TAB
		
		driver.findElement(By.xpath("//div[@class='aKp aKe-aLf']")).click();//Click Social tab
		//driver.findElement(By.xpath("//div[@class='T-Jo-auh']")).click(); //click Checkbox
		
		int last_index=0;
		
		List<WebElement> a = driver.findElements(By.xpath("//div[@class='T-Jo-auh']"));
		List<WebElement> b = driver.findElements(By.xpath("//td[@class='yX xY ']"));
		//System.out.println(a.size());
		//i<b.size()
		for(int i=0;i<4;i++)
		 {
            //System.out.println(b.get(i).getText());
            if(b.get(i).getText().equals("Twitter")){  // if u want to click on the specific mail then here u can pass it
                a.get(i+1).click();
                last_index=i;
                
            }
        }
		
		
		WebElement productLink= b.get(last_index);
		 
		Actions action= new Actions(driver);
 		action.moveToElement(productLink);
 		action.contextClick(productLink).build().perform(); /* this will perform right click */
 		
 		WebElement elementOpen = driver.findElement(By .xpath("//div[@class='J-N-Jz' and text()='Move to tab']")); /*This will select menu after right click */
 		//System.out.println(elementOpen.getText());
 		Action mouseHover = action.moveToElement(elementOpen).build();
		mouseHover.perform();
 		
		WebElement elementOpen2 = driver.findElement(By .xpath("//div[@class='J-N-Jz' and text()='Promotions']"));
		elementOpen2.click();
 		
	
		
		//PROMOTIONS module
		
		//driver.findElement(By.xpath("//div[@class='aAy aJi-aLe']")).click();//Click PROMOTIONS tab
		driver.findElement(By.xpath("//div[@class='aKz' and text()='Promotions']")).click();//Click PROMOTIONS tab
		
		List<WebElement> c = driver.findElements(By.xpath("//div[@class='T-Jo-auh']"));//CHECKBOX
		List<WebElement> d = driver.findElements(By.xpath("//td[@class='yX xY ']"));//2nd COL
		
		int last_index_p=0;
		
		for(int i=0;i<d.size();i++)
		 {
           //System.out.println(d.get(i).getText());
           if(d.get(i).getText().equals("Twitter")){  // if u want to click on the specific mail then here u can pass it
               c.get(i+1).click();
               last_index_p=i;
               
           }
       }
		
		WebElement productLink2= d.get(last_index_p);
		 
		
		//Actions action= new Actions(driver);
 		//action.moveToElement(productLink2);
 		action.contextClick(productLink2).build().perform(); /* this will perform right click */
 		
 		
 		
 		WebElement elementOpen3 = driver.findElement(By .xpath("//div[@class='J-N-Jz' and text()='Move to tab']")); /*This will select menu after right click */
 		//System.out.println(elementOpen3.getText());
 		//driver.switchTo().window("elementOpen3");
 		Action mouseHover1 = action.moveToElement(elementOpen3).build();
		mouseHover1.perform();
 		 		
		//EXPLICIT WAIT
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement elementOpen4;
		elementOpen4=wait.until(ExpectedConditions.visibilityOfElementLocated(By .xpath("//div[@class='J-N-Jz' and text()='Social']")));
		elementOpen4.click();
		
	        			
		////div[@id=':za']/div[text()='Promotions']
		//driver.findElement(By.xpath("//div[@class='J-N-Jz' and text()='Promotions']")).click();
		/*
		List<WebElement> a = driver.findElements(By.xpath("//div[@class='y6']/span"));
		
		System.out.println(a.size());
		
		 for(int i=0;i<a.size();i++)
		 {
             System.out.println(a.get(i).getText());
             if(a.get(i).getText().equals("Is manual testing dying?")){  // if u want to click on the specific mail then here u can pass it
                 a.get(i).click();
             }
         }
		
		*/
		//driver.findElement(By.xpath("//a[@class='gb_Ea gb_Wf gb_4f gb_Le gb_Jb']")).click();
		//WebElement guru99seleniumlink;
		//guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='gb_Ea gb_Wf gb_4f gb_Le gb_Jb']")));
		//guru99seleniumlink.click();
		
	}

}
