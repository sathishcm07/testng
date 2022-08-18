package paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecutionTest {
	
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String browser)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\\\SeleniumDownloads\\\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "D:\\\\SeleniumDownloads\\\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
	}
	
	@Test
	public void navigatetest() throws InterruptedException
	{
		
		
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		WebElement searchbox= driver.findElement(By.name("q"));
		searchbox.sendKeys("Vcentry Technologies");
		searchbox.sendKeys(Keys.ENTER);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
	}

}
