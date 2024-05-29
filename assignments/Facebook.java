package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://en-gb.facebook.com/");
		 
		 driver.findElement(By.linkText("Create new account")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.name("firstname")).sendKeys("Arun");
		 driver.findElement(By.name("lastname")).sendKeys("RS");
		 driver.findElement(By.name("reg_email__")).sendKeys("abcd@gmail.com");
		 driver.findElement(By.id("password_step_input")).sendKeys("abcd1234");
		 //day
		 Select objSelect = new Select(driver.findElement(By.id("day")));
		 objSelect.selectByValue("14");

		 //month
		 Select monthSelect = new Select(driver.findElement(By.id("month")));
		 monthSelect.selectByVisibleText("Dec");
		 
		 //year
		 Select yearSelect = new Select(driver.findElement(By.id("year")));
		 yearSelect.selectByVisibleText("2023");
		 driver.findElement(By.className("//span[@class='_5k_2 _5dba'])[2]")).click();

		 

	//	 Select WebElement = driver.findElement(By.id("day")).click();
		 
		 
		 
		 
		 
		 
	}

}
