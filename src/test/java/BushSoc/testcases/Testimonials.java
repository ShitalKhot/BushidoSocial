package BushSoc.testcases;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testimonials extends BaseClass
{
	@Test(groups= {"Testimonials"})
	public void click()
	{
		By TESTIMONIALS = By.xpath("(//*[text()='Testimonials'])[1]");
		driver.findElement(TESTIMONIALS).click();
		Reporter.log("**********Testimonials page load***********",true);
		
	}

}
