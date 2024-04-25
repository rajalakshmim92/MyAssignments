package omega.blogspot;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		//maximize the window
		  driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//locate the table
		WebElement table = driver.findElement(By.id("table1"));
		//get the row count using list
		List<WebElement> rowCount = table.findElements(By.tagName("tr"));
	
		//print the row size
		System.out.println(rowCount.size());
		
		//get the column count using list
		List<WebElement> columnCount = table.findElements(By.tagName("th"));
		
		//print column size
		System.out.println(columnCount.size());
		
		//print the particular value
		String text = driver.findElement(By.xpath("//table//tr[2]//td[3]")).getText();
		System.out.println(text);
		driver.close();
		

	}

}
