package BushSoc.testcases;


import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MemberOffers extends BaseClass
{
	@Test(groups= {"MemberOffers"})
	public void Offers() 
	{
		
		By memberoffers=By.xpath("//*[text()='MEMBER OFFERS ']");
		driver.findElement(memberoffers).click();
		driver.findElement(By.xpath("(//*[text()='One Year'])[1]")).click();
		driver.findElement(By.xpath("(//*[text()='THREE YEARS'])[1]")).click();
		driver.findElement(By.xpath("//*[text()='FIVE YEARS']")).click();
		Reporter.log("********Member Offers Session End********", true);
		
		
	}

}
