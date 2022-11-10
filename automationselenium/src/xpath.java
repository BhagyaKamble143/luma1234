import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
							
			WebDriver driver = new ChromeDriver(); //Browser Launch
	    driver.get("https://www.facebook.com/"); //URL Insert
	    //Thread.sleep(2000);
	    driver.manage().window().maximize();//maximize the browser
	    Thread.sleep(2000);
	  //enter value in email tab by using Xpath by attributes
	    driver.findElement(By.xpath("//input[@ type='text']")).sendKeys("123");
	   Thread.sleep(2000);
	    
	   driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("345");//enter password by using xpath by attributes
	    Thread.sleep(3000);
	    
	   //driver.findElement(By.xpath("//button[@type='submit']")).click();//click on button by using xpath by attributes
	    
	   //driver.findElement(By.xpath("//button[text()='Log In']")).click();//click on loginbutton by using xpath by text
	    
 //driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();//click on forgottenpass link by using xpath by text
	   
	  driver.findElement(By.xpath("//a[text()='Create New Account'] ")).click();//click on Create New Account link by using xpath by text
	 
      //driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();////click on Create New Account link by using xpath by attributes
	    
	   Thread.sleep(5000);
	    driver.close();//close the current browser
	    
	    
}
}

