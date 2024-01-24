package BushSoc.testcases;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Download extends BaseClass
{
	@Test(groups= {"Download"})
	public void downloadPDF ()
	{
		By download=By.xpath("//*[text()='DOWNLOAD ']");
		driver.findElement(download).click();
		By Investment_brochure= By.xpath("//*[text()='Investment brochure']");
		driver.findElement(Investment_brochure).click();
		//driver.getCurrentUrl("https://www.bushidosocialimpactcic.org/");
		By Getting_Started=By.xpath("//*[text()='Getting Started']");
		driver.findElement(Getting_Started).click();
		Reporter.log("********DOWNLOAD Session End********", true);
		
	}

}
