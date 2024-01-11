package BushSoc.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dashboard extends BaseClass {
	
	@Test(groups={"Dashboard"})
	public void click() throws InterruptedException
	{
		By DASHBOARD=By.xpath("//*[text()='Dashboard']");
		driver.findElement(DASHBOARD).click();
		By Manage_My_Profile=By.xpath("//*[text()='Manage Profile']");
		driver.findElement(Manage_My_Profile).click();
	
		By Username=By.xpath("(//*[@id=\"login\"])[2]");
		driver.findElement(Username).clear();
		Thread.sleep(1000);
		driver.findElement(Username).sendKeys("Shital");//change name in expected text & success text also 
		
		By SUBMIT=By.xpath("//*[text()='Submit']");
		driver.findElement(SUBMIT).click();
		By successtext=By.xpath("//*[text()='Shital updated in My Security Details']");//****
		By Close_Button=By.xpath("(//*[text()='Close'])[1]");
		
		try {
			String actualtext=driver.findElement(successtext).getText();
			String expectedtext="Shital updated in My Security Details";//****
			Assert.assertEquals(expectedtext,actualtext);
			System.out.println(actualtext);
			Thread.sleep(3000);
			driver.findElement(Close_Button).click();
			System.out.println("Manage Profile Test Case Passed");
			
			
		}
		catch (Exception e)
		{
			String ActualText=driver.findElement(successtext).getText();
			Thread.sleep(1000);
			System.out.println(ActualText);
			System.out.println("Manage Profile Test Case Failed");
			
		}
	}

}
