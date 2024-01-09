package BushSoc.testcases;
/*
package BushSoc.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BushSoc.config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
public static WebDriver driver;
public static WebDriverWait wait;

@Parameters({"env"})
@BeforeClass(groups={"All"})
public static void setup(@Optional("live")String env)
{
	try {
		Reporter.log("**********Browser Session Started***********", true);
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver (options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
	
		if(env.equalsIgnoreCase("live")) {
			String Liveurl = PropertiesFile.liveurl();
			driver.get(Liveurl);
		}else if (env.equalsIgnoreCase("dev"))
		{
			String Devurl = PropertiesFile.devurl();
			Thread.sleep(3000);
			driver.get(Devurl);
		}
		
	}catch(Exception e) {
		
		e.getStackTrace();
	}
}

@Parameters({"username","password"})
@Test
public void login(@Optional ("prachi.gurav1@geeconsystems.com") String username, @Optional ("Abc@123") String password)
{
	try {
		Reporter.log("**********Land On login page***********", true);
		By byloginnowbutton = By.xpath("//a[1]/i[@class='fa fa-sign-in']");
		By byusername = By.xpath("//div[@class='col-md-6 boshidoBgColor']/div[1]/form[@name='login_form']/div[1]/input[@placeholder='User Name']");
		By bypassword = By.name("user_pass");
		By submitbutton = By.xpath("//form[@name='login_form']/div[4]/div[1]/button[@name='submit_login']");
		
		Thread.sleep(3000);
		driver.findElement(byloginnowbutton).click();
		Reporter.log("**********click button***********", true);

		driver.findElement(byusername).sendKeys(username);
		driver.findElement(bypassword).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(submitbutton).click();
         }
		catch (Exception ex) 
		{
		ex.printStackTrace();
	}
}


@AfterClass


driver.get("https://www.bushidosocialimpactcic.org//img/one_year_plan.pdf?v=1702619079");
		Set<String> allWindowHandles = driver.getWindowHandles();
		// Check if there are multiple windows
		if (allWindowHandles.size() > 1) {
		    // Iterate through handles and switch to each window
		    for (String handle : allWindowHandles) {
		        driver.switchTo().window(handle);
		        // Perform actions on each window
		        System.out.println("Title of the window: " + driver.getTitle());
		        // You can perform other actions here
		    }
		} else {
		    System.out.println("Only one window is open.");
		}*/
/*
public void close() throws InterruptedException
{
	Thread.sleep(3000);
	driver.quit();
	
	Reporter.log("********Browser Session End********", true);
}

}
*/

