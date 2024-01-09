package BushSoc.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FAQS extends BaseClass
{
	@Test
	public void click (){
		By Faqs=By.xpath("//*[text()='FAQs']");
		driver.findElement(Faqs).click();
		
	}

}
