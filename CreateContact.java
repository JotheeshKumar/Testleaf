package test;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.managers.ChromiumDriverManager;

/*
 * //Pseudo Code
 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
 * 2. Enter UserName and Password Using Id Locator
 * 3. Click on Login Button using Class Locator
 * 4. Click on CRM/SFA Link
 * 5. Click on contacts Button
 * 6. Click on Create Contact
 * 7. Enter FirstName Field Using id Locator
 * 8. Enter LastName Field Using id Locator
 * 9. Enter FirstName(Local) Field Using id Locator
 * 10. Enter LastName(Local) Field Using id Locator
 * 11. Enter Department Field Using any Locator of Your Choice
 * 12. Enter Description Field Using any Locator of your choice 
 * 13. Enter your email in the E-mail address Field using the locator of your choice
 * 14. Select State/Province as NewYork Using Visible Text
 * 15. Click on Create Contact
 * 16. Click on edit button 
 * 17. Clear the Description Field using .clear
 * 18. Fill ImportantNote Field with Any text
 * 19. Click on update button using Xpath locator
 * 20. Get the Title of Resulting Page.
 */
public class CreateContact {

	public static void main(String[] args) {
		ChromiumDriverManager.chromiumdriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("DemoSalesManager");
		//driver.findElement(By.xpath("//input[@name='USERNAME']/following::p/input[@id='password']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/contactsMain']")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/createContactForm']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Jackson");
		driver.findElement(By.id("lastNameField")).sendKeys("Durai");
		driver.findElement(By.name("departmentName")).sendKeys("Moview");
		driver.findElement(By.id("createContactForm_description")).sendKeys("It is all about time.....");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("MovieBuff@gmail.com");
		WebElement generalSta = driver.findElement(By.name("generalStateProvinceGeoId")); 
		new Select(generalSta).selectByVisibleText("Alabama");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='Description']/following::textarea)[1]")).clear();
		driver.findElement(By.xpath("(//span[text()='Description']/following::textarea)[1]")).sendKeys("It is all about time so long.....");
		driver.findElement(By.xpath("//span[text()='Important Note']/following::textarea")).sendKeys("Select good movie");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
	
	}

}
