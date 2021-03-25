package test;

import java.util.List;

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
 * 6. Click on Find Contacts
 * 7. Click on the Email Field using Xpath Locator
 * 8. Enter the email using any locator
 * 9. Click on Find Contacts using Xpath Locator
 * 10. Click on the First Resulting Contact
 * 11. Get the Text of First Name 
 * 12. Click on the Edit Button
 * 13. Select New Marketing Campaign as eCommerce Site Internal Campaign by using SelectByValue
 * 14. Click on the add button
 * 15. Enter Department Value as Selenium Automation Testing
 * 16. Click on the Update Button
 * 17. Get the text of Marketing campaign and Verify it
 * 18. verify Title of the Current page
 */
public class FindContact {

	public static void main(String[] args) throws Throwable {
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
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findContacts']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='id']/following::input[@name='emailAddress']")).clear();
		driver.findElement(By.xpath("//input[@name='id']/following::input[@name='emailAddress']")).sendKeys("MovieBuff@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		String FirstName = driver.findElement(By.xpath("//span[@id='viewContact_firstName_sp']"  )).getText();
		System.out.println(FirstName);
		driver.findElement(By.linkText("Edit")).click();
		WebElement marketingCampaignId = driver.findElement(By.id("addMarketingCampaignForm_marketingCampaignId")); 
		new Select(marketingCampaignId).selectByVisibleText("Demo Marketing Campaign"); 
		driver.findElement(By.xpath("(//input[@name='submitButton'])[2]")).click();
		WebElement Depart = driver.findElement(By.id("updateContactForm_departmentName"));
		Depart.clear();
		Depart.sendKeys("Selenium Automation Testing");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String Actual = driver.findElement(By.xpath("//span[text()='Marketing Campaigns']//following::span")).getText();
		System.out.println(Actual);
		String Excepted="Demo Marketing Campaign";
		if (Actual.equalsIgnoreCase(Excepted)) {
			System.out.println("Actual Page: "+Actual+"\nExcepted page: "+Excepted );
			
		} else {
			System.out.println("Something went wrong........" );

		}
		System.out.println(driver.getTitle());

	}



}
