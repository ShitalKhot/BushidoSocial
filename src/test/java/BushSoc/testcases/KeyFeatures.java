package BushSoc.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeyFeatures extends BaseClass
{
	@Test(groups= {"KeyFeatures"})
	public void click() throws InterruptedException
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(80));
		
		By keyfeatursbutton =By.xpath("//*[text()='KEY FEATURES']");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(keyfeatursbutton));
		driver.findElement(keyfeatursbutton).click();
		Reporter.log("**********Key Features page load***********",true);
		
	}
	
}
