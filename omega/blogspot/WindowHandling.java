package omega.blogspot;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		//maximize the window
		  driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//locate the element
			driver.findElement(By.linkText("SeleniumTutorial")).click();
			System.out.println(driver.getTitle());
			//current window open
			String windowHandle = driver.getWindowHandle();
			System.out.println(windowHandle);
			//multiple window
		Set<String> windowHandles = driver.getWindowHandles();
		//Create list and Convert set into list
		List<String>lstwindow=new ArrayList<String>(windowHandles);
		//Handle the next window switch control
		driver.switchTo().window(lstwindow.get(1));
		System.out.println(driver.getTitle());
		//close the current window
		driver.close();
		//switch back to window
		driver.switchTo().window(lstwindow.get(0));
		System.out.println(driver.getTitle());
			
	}

}
