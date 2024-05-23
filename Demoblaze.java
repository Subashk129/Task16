package Task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze {
	
	
	WebDriver driver = new ChromeDriver();
	
	public Demoblaze() {
	// set path for the Chrome driver
	System.setProperty("webdriver.ChromeDriver.driver", "C:\\Users\\Admin\\Documents");
	}

	public void launchDemoblaze() {
		
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
		//Get Title
		String title = driver.getTitle();
		if(title.equals("STORE")) {
			System.out.println("Page landed on correct website");	
		}else {
			System.out.println("Page not landed on correct website");		
	}
	}	
	
	public static void main(String[] args) {
		
		Demoblaze dmb = new Demoblaze();
		
		dmb.launchDemoblaze();
		
	}

}
