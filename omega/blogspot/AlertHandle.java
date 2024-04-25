package omega.blogspot;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;




public class AlertHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://omayo.blogspot.com/");
				//maximize the window
				  driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
					//find the element
					driver.findElement(By.id("alert1")).click();
					//Handle the  simple alert
					Alert alert = driver.switchTo().alert();
					System.out.println(alert.getText());
					alert.accept();
					driver.findElement(By.id("prompt")).click();
					//handle the prompt alert
					Alert alert2 = driver.switchTo().alert();
					System.out.println(alert2.getText());
					alert2.sendKeys("Raji");
					alert2.accept();
					//locate the confirmation alert
					driver.findElement(By.id("confirm")).click();
					//handle the confirmation alert
					Alert alert3 = driver.switchTo().alert();
					System.out.println(alert3.getText());
					alert3.dismiss();
									
					
					
					

	}

}
