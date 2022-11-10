package flipcartxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathtyprclass1 {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
							
			WebDriver driver = new ChromeDriver(); //Browser Launch
	    driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2F%3Frd%3D0%26link%3Dhome_account"); //URL Insert
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("anuja");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	  // Thread.sleep(2000);
	    //driver.findElement(By.xpath("//span[text()='Forgot?']")).click();
	    //Thread.sleep(2000);
	    //driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
	    Thread.sleep(2000);
	//driver.findElement(By.xpath("//a[text()='New to Flipkart? Create an account']")).click();
	    Thread.sleep(2000);
driver.close();
}
}