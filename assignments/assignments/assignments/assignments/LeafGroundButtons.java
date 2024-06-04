package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButtons {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement confirm =driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']/following :: button[1]"));
		//Click on the button with the text ‘Click and Confirm title.’ 
		confirm.click();
		//- Verify that the title of the page is ‘dashboard.’ 
		if(driver.getTitle().equals("Dashboard")) {
			
			System.out.println("Title of the page is Dashboard");
			
		}
		//Navigating back to Button page
		driver.navigate().back();
		
		//- Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
		WebElement disabledButton= driver.findElement(By.xpath("//button[contains(@class,'ui-state-disabled')]"));
		boolean status = disabledButton.isEnabled();
		if(status == true) {
			System.out.println("This button is enabled");
		}
		else {
			System.out.println("This button is disabled");
		}
		 //- Find and print the position of the button with the text ‘Submit.’	
		WebElement submitButton=driver.findElement(By.xpath("//h5[text()='Find the position of the Submit button']/following :: button[1]"));
		Thread.sleep(2000);
		System.out.println("Location is"+submitButton.getLocation());
		
		//- Find and print the background color of the button with the text ‘Find the Save button color.’
		WebElement save= driver.findElement(By.xpath("//h5[text()='Find the Save button color']/following :: button[1]"));
		System.out.println("Button color: "+save.getCssValue("background-color"));
		//- Find and print the height and width of the button with the text ‘Find the height and width of this button.’ 
		WebElement heiwid=driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']/following :: button[1]"));
		Dimension height= heiwid.getSize();
		System.out.println("The height and width is " +height);
		//- Close the browser window. 
			driver.close();


		
	}

}
