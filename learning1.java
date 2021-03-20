package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class learning1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Jotheesh");
		driver.findElement(By.name("parentPartyId")).sendKeys("democlass1");
		driver.findElement(By.id("groupNameLocal")).sendKeys("Joe");
		driver.findElement(By.id("officeSiteName")).sendKeys("tellme");
		driver.findElement(By.id("annualRevenue")).sendKeys("500000");
		WebElement PreferredCurrency = driver.findElement(By.id("currencyUomId"));
		Select dd1 = new Select(PreferredCurrency);
		dd1.selectByVisibleText("INR - Indian Rupee");
		WebElement Industry = driver.findElement(By.name("industryEnumId"));
		Select dd2 = new Select(Industry);
		dd2.selectByVisibleText("Computer Software");
		driver.findElement(By.id("numberEmployees")).sendKeys("13");
		WebElement Ownership = driver.findElement(By.name("ownershipEnumId"));
		Select dd3 = new Select(Ownership);
		dd3.selectByValue("OWN_CCORP");
		driver.findElement(By.id("sicCode")).sendKeys("dc123");
		driver.findElement(By.id("tickerSymbol")).sendKeys("marvel");
		WebElement Source = driver.findElement(By.id("dataSourceId"));
		Select dd4 = new Select(Source);
		dd4.selectByValue("LEAD_EMPLOYEE");
		WebElement MarketingCampaign = driver.findElement(By.id("marketingCampaignId"));
		Select dd5 = new Select(MarketingCampaign);
		dd5.selectByValue("CATRQ_AUTOMOBILE");
		WebElement InitialTeam = driver.findElement(By.id("initialTeamPartyId"));
		Select dd8 = new Select(InitialTeam);
		dd8.selectByValue("DemoSalesTeam1");
		driver.findElement(By.name("description")).sendKeys("testing the code with selinium");
		driver.findElement(By.name("importantNote")).sendKeys("woring for 2 days");
		driver.findElement(By.id("primaryPhoneCountryCode")).sendKeys("01");
		driver.findElement(By.id("primaryPhoneAreaCode")).sendKeys("624619");
		driver.findElement(By.id("primaryPhoneNumber")).sendKeys("9944456076");
		driver.findElement(By.id("primaryPhoneExtension")).sendKeys("+91");
		driver.findElement(By.id("primaryPhoneAskForName")).sendKeys("IronMan");
		driver.findElement(By.id("primaryEmail")).sendKeys("tellme@gmail.com");
		driver.findElement(By.id("primaryWebUrl")).sendKeys("http://tellme.com");
		driver.findElement(By.id("generalToName")).sendKeys("captain Jack");
		driver.findElement(By.id("generalAttnName")).sendKeys("mike");
		driver.findElement(By.id("generalAddress1")).sendKeys("No 13 athipatti street");
		driver.findElement(By.id("generalAddress2")).sendKeys("deccan foil,german");
		driver.findElement(By.id("generalCity")).sendKeys("someCity");
		WebElement Country = driver.findElement(By.id("generalCountryGeoId"));
		Select dd6 = new Select(Country);
		dd6.selectByValue("IND");
		driver.findElement(By.id("generalPostalCode")).sendKeys("624619");
		WebElement State = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dd7 = new Select(State);
		dd7.selectByVisibleText("TAMILNADU");
		driver.findElement(By.id("generalPostalCodeExt")).sendKeys("991");
		driver.findElement(By.className("smallSubmit")).click();
		String exptcd = "Create Account | opentaps CRM";
		String title1 = driver.getTitle();
		System.out.println(title);
		if (title1.equals(exptcd)) {
			System.out.println("Title verified and macthes the expected title");
		}

	}
}
