package BushSoc.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Members_Investment_Offer extends BaseClass
{
	@Test(groups= {"Members_Investment_Offer"})
	@Parameters({"FirstName","MiddleName","LastName","Email","Address","Postcode"})
	
	public void Form(@Optional ("Shital")String FirstName, @Optional ("Jaywant") String MiddleName, @Optional("Khot")String LastName, @Optional("shital.khot@geeconsystems.com") String Email,@Optional("Andheri")String Address,@Optional("400093")String Postcode) throws InterruptedException
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(80));
		
		By HOME=By.xpath("//*[text()='Home']");
		By OneYear=By.xpath("(//*[text()='Members Investment Offer'])[1]");
			
		/*By GENDER=By.xpath("//*[text()='Mr/Ms/Other']");
		WebElement genderDropdown = driver.findElement(GENDER);
		Select selectGender = new Select(genderDropdown);
		selectGender.selectByVisibleText("Ms");
		*/
		By FIRST_NAME=By.id("first_name");
		By MIDDLE_NAME=By.id("middle_name");
		By LAST_NAME=By.id("last_name");
		By EMAIL =By.id("email");
		By ADDRESS=By.id("address");
		By POST_CODE=By.id("postcode");
		By PAYMENT=By.id("electronic_transfer");
		
		driver.findElement(HOME).click();
		driver.findElement(OneYear).click();
		//driver.findElement(GENDER).click();
		driver.findElement(FIRST_NAME).sendKeys(FirstName);

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MIDDLE_NAME));
		driver.findElement(MIDDLE_NAME).sendKeys(MiddleName);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(LAST_NAME));
		driver.findElement(LAST_NAME).sendKeys(LastName);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(EMAIL));
		driver.findElement(EMAIL).sendKeys(Email);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ADDRESS));		
		driver.findElement(ADDRESS).sendKeys(Address);

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(POST_CODE));		
		driver.findElement(POST_CODE).sendKeys(Postcode);

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(PAYMENT));		
		driver.findElement(PAYMENT).click();

		
		
		
	}

}
