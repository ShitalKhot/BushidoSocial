package BushSoc.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class Donate_for_Bushido extends BaseClass
{
	@Test(groups= {"DonateForBushido"})
	public void click()
	{
		By Donate_Button=By.xpath("(//*[text()='DONATE FOR BUSHIDO'])[1]");
		driver.findElement(Donate_Button).click();
	}

}
