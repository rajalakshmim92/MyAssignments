package omega.blogspot;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		//maximize the window
		  driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//find element and enter username
			 driver.findElement(By.name("userid")).sendKeys("userid");	  //find element and enter password
			  driver.findElement(By.name("pswrd")).sendKeys("pswrd");
			  //find element and click login
			  driver.findElement(By.xpath("//input[@value='Login']")).click();
			  
				//handle the confirmation alert
				Alert alert4 = driver.switchTo().alert();
				System.out.println(alert4.getText());
				alert4.accept();
				
				//to clear the userid and password using cancel
				driver.findElement(By.xpath("//input[@value='Cancel']")).click();
				
				//enter correct username and password
				//get thetitle of open window
				System.out.println(driver.getTitle());

				driver.findElement(By.name("userid")).sendKeys("SeleniumByArun");	
				 driver.findElement(By.name("pswrd")).sendKeys("Test143$");
				 driver.findElement(By.xpath("//input[@value='Login']")).click();
				 Set<String> windowHandles = driver.getWindowHandles();	
				 //to check login successful opens the next window
					List<String>lstWindow =new ArrayList<String>(windowHandles);
				    driver.switchTo().window(lstWindow.get(1));
				    //get the size of window
				    System.out.println(windowHandles.size());
				    //print the title
				    System.out.println(driver.getTitle());
				    //close the current open window
				    driver.close();
				    //switch back to the window
				    driver.switchTo().window(lstWindow.get(0));
				    System.out.println(driver.getTitle());
				    driver.quit();
				    
					

				 
				 
				
				
				
			
	}

}
