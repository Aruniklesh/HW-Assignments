package week2.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		// implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement searchInput = driver
				.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']"));
		searchInput.sendKeys("bags");
		searchInput.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']"))
				.click();
		Thread.sleep(3000);
		String items = driver.findElement(By.xpath(
				"//div[@class=' filter-container']//strong")).getText();
			System.out.println("Items found: "+items);
		Thread.sleep(3000);
		
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
		for (WebElement brand : brands) {
			System.out.println("Brand of the Products: " + "|" + brand.getText()+"|");

		}
		List<WebElement> bags = driver.findElements(By.xpath("//div[@class='nameCls']"));
		for (WebElement names : bags) {
			System.out.println("Bag names: " + "|" + names.getText()+"|");

		}
	}

}
