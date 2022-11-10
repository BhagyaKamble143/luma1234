package automationselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1{
	
	
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", 
	"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//Browser launch
		driver.get("https://www.selenium.dev/downloads"); //URL Insert

		
	}

}
