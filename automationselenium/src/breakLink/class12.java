package breakLink;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
								
	WebDriver driver = new ChromeDriver(); //Browser Launch
    driver.get("http://www.zlti.com");//insert url
   Thread.sleep(2000);
    driver.manage().window().maximize();//browser maximize
    Thread.sleep(2000);

	   driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]")).click();
	   Thread.sleep(2000);
	   ArrayList<String> ar=new ArrayList<String>(driver.getWindowHandles());
	      driver.switchTo().window(ar.get(1));//
	    driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
	    Thread.sleep(2000);
	    WebElement es=driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
	    driver.switchTo().frame(es);
	    Thread.sleep(2000);
	   // driver.switchTo().parentFrame();
	    driver.switchTo().defaultContent();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]")).click();

}

}