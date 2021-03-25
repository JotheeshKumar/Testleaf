package test;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("(//input[@name='vital'])[1]")).click();
		List<WebElement> TableRows = driver.findElements(By.xpath("//table[@id='table_id']//tr"));
		List<WebElement> TableCols = driver.findElements(By.xpath("//table[@id='table_id']//tr/th"));
		List<WebElement> TableRowsEle = driver.findElements(By.xpath("//table[@id='table_id']//tr/td[1]"));
		List<WebElement> TableRowsEle2 = driver.findElements(By.xpath("//table[@id='table_id']//tr/td[2]"));
		int rSize = TableRows.size();
		int cSize = TableCols.size();
		System.out.println("Rows : " + rSize);
		System.out.println("Cols : " + cSize);
		String check = "Learn XPath";
		String text1;
		String text2;
		int min = Integer.parseInt(TableRowsEle2.get(0).getText().replace("%", ""));
		int minPos = 0;
		for (int i = 0; i < rSize - 1; i++) {
			if (check.equalsIgnoreCase(TableRowsEle.get(i).getText())) {
				text1 = TableRowsEle.get(i).getText();
				text2 = TableRowsEle2.get(i).getText();
				System.out.println(text1 + " = " + text2);
			}
			if (Integer.parseInt(TableRowsEle2.get(i).getText().replace("%", "")) < min) {
				min = Integer.parseInt(TableRowsEle2.get(i).getText().replace("%", ""));
				minPos = i;
			}
		}
		text1 = TableRowsEle.get(minPos).getText();
		text2 = TableRowsEle2.get(minPos).getText();
		System.out.println("miminum : " + text1 + " = " + text2);
		driver.findElement(By.xpath("(//input[@name='vital'])["+(minPos+1)+"]")).click();
		//driver.close();
	}

}
/*
 * URL - http://www.leafground.com/pages/table.html 1) Set the property for
 * chromedriver and initialize the driver 2) launch the url 3) Get the table and
 * store it as a webelement 4) Find the number of rows based on its tag name and
 * store it in a list 5) Find the number of cols based on its tag name and store
 * it in a list 6) Print the size of the rows 7) Print the size of the cols 8)
 * Get the progress value of 'Learn to interact with Elements' and store it in a
 * variable 9) Print the text of the variable 10) Find the vital task for the
 * least completed progress and check the box
 */