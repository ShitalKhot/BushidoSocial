package BushSoc.testcases;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Membership_Benefits extends BaseClass
{
	@Test(groups= {"Membership_Benefits"})
	public void click()
	{
		By MEMBERSHIPBENEFITS=By.xpath("//*[text()='Membership Benefits']");
		driver.findElement(MEMBERSHIPBENEFITS).click();
		Reporter.log("**********Membership Benefits Offer page load***********",true);
	}
	
}
