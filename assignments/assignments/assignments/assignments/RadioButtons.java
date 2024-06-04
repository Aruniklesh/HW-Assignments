package week2.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		// implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement favBrowser= driver.findElement(By.xpath("//h5[text()='Your most favorite browser']/following::label[text()='Edge']"));
		favBrowser.click();
		Thread.sleep(1000);
		
		//-Identify the radio button that is initially selected by default. 
				System.out.println("Selected by Default: ");
				List<WebElement> defaultBrowser =driver.findElements(By.xpath("//div[@class='ui-helper-hidden-accessible']/input[not(@onchange)] [@checked]/following::label[1]"));
				for(int i=0;i<defaultBrowser.size();i++) {
					System.out.println(defaultBrowser.get(i).getText());

				}
		//Check and select the age group (21-40 Years) if not already selected.
				WebElement group = driver.findElement(By.xpath("//input[@value='21-40 Years']"));
				WebElement group2=driver.findElement(By.xpath("//input[@value='21-40 Years']/following::span[contains(@class,'bullet')]"));
				System.out.println(group.isSelected());
				System.out.println(group2.isSelected());
				
				if(group.isSelected()) 
				{System.out.println("age group (21-40 Years)is already selected");}
				else {
					group2.click();
					Thread.sleep(2000);
				    System.out.println("The radio button age group (21-40 Years)is "+group.isSelected());			
			}
				//close browser
				driver.close();
	}

}
