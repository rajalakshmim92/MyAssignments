package omega.blogspot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		//maximize the window
		  driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  //Locate the dropdown
		  WebElement doc = driver.findElement(By.className("combobox"));
		  Select drop=new Select(doc);
		  drop.selectByIndex(2);
		  
		  Thread.sleep(1000);
		  driver.close();
		 
	}

}
