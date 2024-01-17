package BushSoc.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Footer_SocialMediaIcons extends BaseClass
{
	@Test(groups= {"Footer_SocialMediaIcons"})
	public void click() throws InterruptedException
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(80));
		By Facebook=By.xpath("//*[text()='Facebook']");
		By Instagram=By.xpath("//*[text()='Instagram']");
		By Linkedin=By.xpath("//*[text()='Linkedin']");
		By YouTube=By.xpath("//*[text()='YouTube']");
		By Twitter=By.xpath("//*[text()='Twitter']");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Facebook));
		driver.findElement(Facebook).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Instagram));
		driver.findElement(Instagram).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Linkedin));
		driver.findElement(Linkedin).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(YouTube));
		driver.findElement(YouTube).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Twitter));
		driver.findElement(Twitter).click();
		
	}
}
