package BushSoc.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BushSoc.Utilities.Utilities;

public class About_Us extends BaseClass 
{
	@Test (groups={"About_Us"})
	
	public void click() throws InterruptedException 
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(100));
		
		
		By ABOUT_US=By.xpath("//*[text()='About Us ']");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ABOUT_US));
		driver.findElement(ABOUT_US).click();
		
		By DD_CSR=By.xpath("//*[text()='CSR']");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(DD_CSR));
		driver.findElement(DD_CSR).click();
		
		driver.findElement(ABOUT_US).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ABOUT_US));
		
		driver.findElement(By.xpath("//*[text()='OUR MISSION']")).click();
		driver.findElement(ABOUT_US).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ABOUT_US));
		
		driver.findElement(By.xpath("//*[text()='CORE VALUES']")).click();
		driver.findElement(ABOUT_US).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ABOUT_US));
		
		driver.findElement(By.xpath("//*[text()='INTRODUCTION']")).click();
		driver.findElement(ABOUT_US).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ABOUT_US));
		
		driver.findElement(By.xpath("//*[text()='CORE VALUES']")).click();
		driver.findElement(ABOUT_US).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ABOUT_US));
		
		driver.findElement(By.xpath("//*[text()='BUSHIDO']")).click();
		driver.findElement(ABOUT_US).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ABOUT_US));
		
		driver.findElement(By.xpath("//*[text()='One Pager']")).click();
		driver.findElement(ABOUT_US).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ABOUT_US));
		
		driver.findElement(By.xpath("//*[text()='Bushido Abbreviated Brochure']")).click();
		driver.findElement(ABOUT_US).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ABOUT_US));
		
		driver.findElement(By.xpath("//*[text()='Terms & Conditions']")).click();
		driver.findElement(ABOUT_US).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ABOUT_US));
		
		driver.findElement(By.xpath("//*[text()='Privacy Policy']")).click();
		driver.findElement(ABOUT_US).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ABOUT_US));
		
		driver.findElement(By.xpath("//*[text()='bushido gpdr policy']")).click();
		Utilities.hardWait(5);
		
	}
	
}
