package xpath123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class342 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
								
				WebDriver driver = new ChromeDriver(); //Browser Launch
		    driver.get("https://www.facebook.com/"); //URL Insert
		    Thread.sleep(2000);
		    driver.manage().window().maximize();//maximize the browser
		    driver.findElement(By.xpath("//input[@ type='text']")).sendKeys("abc");
		    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("345");
		    Thread.sleep(2000);
		    //driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
		    driver.findElement(By.xpath("//button[text()='Log In']")).click();//click on loginbutton by using xpath by text
		    //driver.findElement(By.xpath("//button[@ name='login']")).click();//click on button by using xpath by attributes
		    Thread.sleep(3000);
		    driver.close();
	}

}
