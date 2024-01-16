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
//import org.testng.annotations.Test;
import org.testng.Assert;

import BushSoc.Utilities.Utilities;
import BushSoc.config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;

public class BaseClass 
{
public static WebDriver driver;
public static WebDriverWait wait;

@Parameters({"env","username","password"})
@BeforeClass(groups={"All", "Contact_Us","Members_Investment_Offer","FAQS","KeyFeatures","Dashboard","Testimonials","CompanyValue","MemberOffers","Donate_for_Bushido","Membership_Benefits","Footer_SocialMediaIcons","About_Us","Download"})
public static void setup(@Optional("live")String env,@Optional ("prachi.gurav1@geeconsystems.com") String username, @Optional ("Abc@123") String password)
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
			Utilities.hardWait(3);
			driver.get(Devurl);
		}
		
	}catch(Exception e) {
		
		e.getStackTrace();
	}


	try {
		Reporter.log("**********Land On login page***********", true);
		By byloginnowbutton = By.xpath("//a[1]/i[@class='fa fa-sign-in']");
		By byusername = By.xpath("//div[@class='col-md-6 boshidoBgColor']/div[1]/form[@name='login_form']/div[1]/input[@placeholder='User Name']");
		By bypassword = By.name("user_pass");
		By submitbutton = By.xpath("//form[@name='login_form']/div[4]/div[1]/button[@name='submit_login']");
		
		Utilities.hardWait(5);
		driver.findElement(byloginnowbutton).click();
		Reporter.log("**********click button***********", true);

		driver.findElement(byusername).sendKeys(username);
		driver.findElement(bypassword).sendKeys(password);
		Utilities.hardWait(2);
		driver.findElement(submitbutton).click();
         }
		catch (Exception ex) 
		{
		ex.printStackTrace();
	}

}

@AfterClass (groups={"All", "Contact_Us","Members_Investment_Offer","FAQS","KeyFeatures","Dashboard","Testimonials","CompanyValue","MemberOffers","Donate_for_Bushido","Membership_Benefits","Footer_SocialMediaIcons","About_Us","Download"})
public void close() throws InterruptedException
{

	driver.findElement(By.xpath("//div[@id=\"top_navigation\"]/ul[2]/li[2]/a")).click();
	By successtext=By.xpath("//*[text()='You have successfully logged out!']");
	By Closepopup=By.xpath("(//*[text()='Close'])[1]");
	
	try {
		Utilities.hardWait(2);
        String actualtext=driver.findElement(successtext).getText();
        String expectedtext="You have successfully logged out!";
        Assert.assertEquals(expectedtext,actualtext);
        System.out.println(actualtext);
		Utilities.hardWait(2);
        driver.findElement(Closepopup).click();		
        System.out.println("Test Case Has Passed");
		 
		 }
		 catch(Exception e)
		 
		 {
            String Actualtext=driver.findElement(successtext).getText();
			Utilities.hardWait(3);
            System.out.println(Actualtext);
			 System.out.println("Test case has failed");
		 }
	
	Utilities.hardWait(2);
	driver.quit();
	
	Reporter.log("********Browser Session End********", true);
}

}


