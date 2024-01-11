package BushSoc.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Contact_Us extends BaseClass

{
	/*
	@Test
	public void click() throws InterruptedException
	{
		By CONTACT_US=By.xpath("//*[text()='Contact Us']");
		driver.findElement(CONTACT_US).click();
		By First_name=By.id("first_name");
		By Last_Name=By.id("last_name");
		By Business_Name=By.id("business");
		//By Email=By.id("email");
		By Mobile=By.id("mobile");
		By Telephone=By.id("telephone");
		By Reason_For_Contact=By.xpath("//textarea[@name='reason_for_contact']");
		By Contact_Us=By.xpath("//*[text()='CONTACT US']");
		By successtext= By.xpath("//*[text()='Your details saved successfully will connect you shortly !!!!!']");
		By CloseButton=By.xpath("(//*[text()='Close'])[1]");
		
		driver.findElement(First_name).sendKeys("Shital1");
		driver.findElement(Last_Name).sendKeys("Khot1");
		driver.findElement(Business_Name).sendKeys("Testing1");
		//driver.findElement(Email).sendKeys("shital.khot1@geeconsystems.com");
		driver.findElement(Mobile).sendKeys("99999999991");
		driver.findElement(Telephone).sendKeys("8888888881");
		driver.findElement(Reason_For_Contact).sendKeys("Testing1");
		Thread.sleep(6000);
		driver.findElement(Contact_Us).click();	
		Thread.sleep(3000);
		driver.findElement(CloseButton).click();
	
	
		try
		{
			 Thread.sleep(3000);
             String actualtext = driver.findElement(successtext).getText();
             String expectedtext = "";
             Assert.assertEquals(expectedtext, actualtext);
             System.out.println(actualtext);
			 Thread.sleep(2000);
             driver.findElement(CloseButton).click();		
             System.out.println("Test Case Has Passed");
			 
			 }
			 catch(Exception e)
			 
			 {
	             String Actualtext=driver.findElement(successtext).getText();
				 Thread.sleep(1000);
	             System.out.println(Actualtext);
				 System.out.println("Test case has failed");
			 }
	}*/
	
	@Parameters({"firstName","lastName","businessName","email","mobile","telephone","reason"})
	@Test
	public void Form(@Optional("Shital") String firstName,@Optional("Khot")String lastName,@Optional("AbcXyz") String businessName,@Optional ("prachig@ymail.com") String email,@Optional ("9999999999") String mobile,@Optional ("0222658245")String telephone,@Optional ("Testing") String reason) throws InterruptedException
	{
		
			wait=new WebDriverWait(driver,Duration.ofSeconds(80));
			 By contactUsbutton = By.xpath("//*[text()='Contact Us']");
			 By FirstName = By.id("first_name");
			 By LastName = By.id("last_name");
			 By BusinessName = By.id("business");
			 By Email = By.xpath("//div[5]/input[@name='email']");
			 By Mobile = By.id("mobile");
			 By Telephone = By.id("telephone");
			 By Reason = By.id("reason_for_contact");
			 By Submitbutton = By.id("submit_new");
		     By successtext = By.xpath("//*[text()='Your details saved successfully will connect you shortly !!!!!']");
			 By closebutton = By.xpath("(//*[text()='Close'])[1]");
			
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(contactUsbutton));
			 driver.findElement(contactUsbutton).click();
			
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(FirstName));
			 driver.findElement(FirstName).sendKeys(firstName);
			 
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(LastName));
			 driver.findElement(LastName).sendKeys(lastName);
			
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(BusinessName));
			 driver.findElement(BusinessName).sendKeys(businessName);
			
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Email));
			 driver.findElement(Email).sendKeys(email);
			
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Mobile));
			 driver.findElement(Mobile).sendKeys(mobile);
			
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Telephone));
			 driver.findElement(Telephone).sendKeys(telephone);
			
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Reason));
			 driver.findElement(Reason).sendKeys(reason);
			 
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Submitbutton));
			 driver.findElement(Submitbutton).click();
			 
			 try {
				 Thread.sleep(3000);
             String actualtext=driver.findElement(successtext).getText();
             String expectedtext="Your details saved successfully will connect you shortly !!!!!";
             Assert.assertEquals(expectedtext,actualtext);
             System.out.println(actualtext);
			 Thread.sleep(3000);
             driver.findElement(closebutton).click();		
             System.out.println("Contact Us Test Case Has Passed");
			 
			 }
			 catch(Exception e)
			 
			 {
	             String Actualtext=driver.findElement(successtext).getText();
				 Thread.sleep(1000);
	             System.out.println(Actualtext);
				 System.out.println("Contact Us Test case has failed");
			 }
	}
	

}
