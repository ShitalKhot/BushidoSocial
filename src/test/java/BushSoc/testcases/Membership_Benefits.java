package BushSoc.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Membership_Benefits extends BaseClass
{
	@Test
	public void click()
	{
		By MEMBERSHIPBENEFITS=By.xpath("//*[text()='Membership Benefits']");
		driver.findElement(MEMBERSHIPBENEFITS).click();
	}
	
}
