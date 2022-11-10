package ScroollupDwn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
							
			WebDriver driver = new ChromeDriver(); //Browser Launch
	    driver.get("http://www.zlti.com");//insert url
	   Thread.sleep(2000);
	    driver.manage().window().maximize();//browser maximize
	    Thread.sleep(3000);
	// WebElement es=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
	  //Thread.sleep(3000);
	     JavascriptExecutor js=(JavascriptExecutor)driver;
	     //js.executeScript("arguments[0].scrollIntoView(true)",es);
	     Thread.sleep(3000);
	     //js.executeScript("window.scrollBy(0,2000)");//
	     Thread.sleep(3000);
	     //js.executeScript("window.scrollBy(0,-4000)");//
	     //Thread.sleep(3000);
	     js.executeScript("window.scrollBy(2000,1000)");//
	     Thread.sleep(3000);
	     js.executeScript("window.scrollBy(-3000,-3000)");//
	     Thread.sleep(3000);

}
}