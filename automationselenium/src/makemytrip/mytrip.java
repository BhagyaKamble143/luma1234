package makemytrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mytrip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
								
				WebDriver driver = new ChromeDriver(); //Browser Launch
				driver.get("https://www.makemytrip.com/railways/irctc-create-account.html");//insert url
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				
	}
}
