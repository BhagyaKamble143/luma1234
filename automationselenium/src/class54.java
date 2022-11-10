import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class54 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
						
		WebDriver driver = new ChromeDriver(); //Browser Launch
    driver.get("https://www.facebook.com/"); //URL Insert
    Thread.sleep(2000);
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@type='text'])")).sendKeys("anuja");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
    Thread.sleep(2000);
    //driver.findElement(By.xpath("//button[text()='Log In']")).click();
    Thread.sleep(2000);
    driver.close();
	}
}
