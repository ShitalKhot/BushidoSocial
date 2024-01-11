package BushSoc.testcases;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CompanyValue extends BaseClass{
	@Test (groups={"CompanyValue"})
	public void Click() throws InterruptedException
	{
		Thread.sleep(6000);
		By companyvalue=By.xpath("//*[text()='COMPANY VALUES']");
		driver.findElement(companyvalue).click();
		Reporter.log("**********Company Value page load***********",true);
	
	}

}
