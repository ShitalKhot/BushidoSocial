package BushSoc.testcases;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FAQS extends BaseClass
{
	@Test(groups= {"FAQS"})
	public void click (){
		By Faqs=By.xpath("//*[text()='FAQs']");
		driver.findElement(Faqs).click();
		Reporter.log("********FAQs Session End********", true);
		
	}

}
