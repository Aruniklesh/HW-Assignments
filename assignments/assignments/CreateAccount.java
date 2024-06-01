package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.partialLinkText("CRM/SFA")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("Create Account")).click();
		 driver.findElement(By.id("accountName")).sendKeys("Arun");
		 driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		 
		 Select industry = new Select(driver.findElement(By.name("industryEnumId")));
		 industry.selectByVisibleText("Computer Software");
		 Thread.sleep(2000);
		 Select ownership = new Select(driver.findElement(By.name("ownershipEnumId")));
		 ownership.selectByVisibleText("S-Corporation");
		 Thread.sleep(2000);
		 
		 Select source = new Select(driver.findElement(By.name("dataSourceId")));
		 source.selectByValue("LEAD_EMPLOYEE");
		 
		 Thread.sleep(2000);
		 Select marketingcampaign = new Select(driver.findElement(By.id("marketingCampaignId")));
		 marketingcampaign.selectByIndex(5);
		 Thread.sleep(2000);
		 Select state = new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
		 state.selectByValue("TX");
		 Thread.sleep(2000);
		 //Click the "Create Account" button
		 driver.findElement(By.linkText("Create Account")).click();
		 Thread.sleep(3000);
		 //close
		 driver.close();

		/* Select "S-Corporation" as ownership using SelectByVisibleText.
		 - Select "Employee" as the source using SelectByValue.
		 - Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
		 - Select "Texas" as the state/province using SelectByValue.
*/

	}

}
