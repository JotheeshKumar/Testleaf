package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * //Pseudo Code
 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
 * 2. Enter UserName and Password Using Xpath Locator
 * 3. Click on Login Button using Xpath Locator
 * 4. Click on CRM/SFA Link
 * 5. Click on Oppurtunites Button
 * 6. Click on Find Oppurtunites using Xpath Locator
 * 7. Get the List of Oppurtunites available in Oppurtunity id usinf Xpath Locator
 * 8. Get the Title of the Page and verify it.
 */
public class FindOppurtunites {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Opportunities")).click();
		driver.findElement(By.linkText("Find Opportunities")).click();
		List<WebElement> RowCount = driver.findElements(By.xpath("//tr[@class='x-grid3-row-body-tr']"));
		System.out.println("Oppurtunites" + RowCount.size());
		System.out.println(driver.getTitle());
		driver.close();

	}

}
