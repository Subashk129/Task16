package Task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class GoogleTask {

		
		WebDriver driver = new FirefoxDriver();
		
		public GoogleTask() {
			////Set the path of browser driver 
			System.setProperty("webdriver.geckodriver.driver", "C:\\Users\\Admin\\Documents");
		}

		
		public void launchGoogle() throws InterruptedException {
			//Launch the Url
			driver.get("http://www.google.com/");
			driver.manage().window().maximize();
			
			// Getting URL
			String title = driver.getTitle();
			String currentUrl = driver.getCurrentUrl();
			System.out.println("The currentUrl is: "+currentUrl);
			
			//Reload Page
			driver.navigate().refresh();
			Thread.sleep(3000);
			
			//close the browser
			driver.close();
			
			
		}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			GoogleTask google  = new GoogleTask();
			
			google.launchGoogle();
		}
	}


