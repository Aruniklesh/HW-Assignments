package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://leafground.com/checkbox.xhtml");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			// - Click on the "Basic Checkbox.”
			WebElement click = driver.findElement(By.xpath("//h5[text() = 'Basic Checkbox']/following::div[3]"));
			click.click();
			
			// - Click on the "Notification Checkbox."
			WebElement notificationCheckbox = driver.findElement(By.xpath("//h5[text()='Notification']/following::div[3]"));
			notificationCheckbox.click();
			// - Verify that the expected message is displayed.
			Thread.sleep(2000);
			 WebElement message =driver.findElement(By.xpath("//div[@role='alert']"));
			 message.click();
			
			System.out.println("First alert" + message.getText());
			Thread.sleep(2000);
			
			// - Click on your favorite language (assuming it's related to checkboxes).
			WebElement favLang = driver.findElements(By.cssSelector(".ui-selectmanycheckbox.ui-widget td")).get(0);
			favLang.click();

			// - Click on the "Tri-State Checkbox." - Verify which tri-state option has been chosen.
			WebElement triState = driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following::div[3]"));
			triState.click();
			
			System.out.println("Tri  state button is clicked," + driver
					.findElement(By.cssSelector(".ui-growl.ui-widget[id*='id_container']>div [class='ui-growl-message']"))
					.getText());
			triState.click();
			Thread.sleep(1000);
			System.out.println("Tri  state button is clicked," + driver
					.findElement(By.cssSelector(".ui-growl.ui-widget[id*='id_container']>div [class='ui-growl-message']"))
					.getText());
			triState.click();
			Thread.sleep(1000);
			System.out.println("Tri  state button is clicked," + driver
					.findElement(By.cssSelector(".ui-growl.ui-widget[id*='id_container']>div [class='ui-growl-message']"))
					.getText());

			// - Click on the "Toggle Switch." - Verify that the expected message is displayed
			WebElement toggle = driver.findElement(By.cssSelector(".ui-toggleswitch.ui-widget"));
			toggle.click();
			Thread.sleep(1000);
			System.out.println(
					"Toggle clicked, Status is " + driver.findElement(By.xpath("//div[@class='ui-growl-message']")).getText());
			toggle.click();
			Thread.sleep(1000);
			System.out.println(
					"Toggle clicked again, status is " + driver.findElement(By.cssSelector(".ui-growl-message")).getText());

			// - Verify if the Checkbox is disabled. - Select multiple options on the page (details may be needed).
			WebElement disabledCheck = driver
					.findElement(By.xpath("//h5[text()='Verify if check box is disabled']/following::div/div/input[1]"));
			
			if (disabledCheck.getAttribute("aria-disabled").equals("true")) {
				System.out.println("Checkbox is disabled");
			} else {
				System.out.println("Checkbox is enabled");
			}
			
			driver.close();


			
	}

}
