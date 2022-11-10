package AppleSite;
import  ScroollupDwn.amzonSign ;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ScroollupDwn.amzonSign;

public class classApple extends amzonSign  {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
					
	WebDriver driver = new ChromeDriver(); //Browser Launch
driver.get("https://www.apple.com/in/");
Thread.sleep(2000);
driver.manage().window().maximize();
Thread.sleep(4000);
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,200)");//
Thread.sleep(1000);
js.executeScript("window.scrollBy(0,200)");//
Thread.sleep(1000);
js.executeScript("window.scrollBy(0,200)");//
Thread.sleep(1000);
js.executeScript("window.scrollBy(0,300)");//
Thread.sleep(1000);
js.executeScript("window.scrollBy(0,400)");//
Thread.sleep(1000);
js.executeScript("window.scrollBy(0,100)");//
Thread.sleep(1000);
js.executeScript("window.scrollBy(0,100)");//
Thread.sleep(1000);
js.executeScript("window.scrollBy(0,100)");//
WebElement watch=driver.findElement(By.xpath("//a[text()='Order now']"));
watch.click();
Thread.sleep(1000);
js.executeScript("window.scrollBy(0,200)");//
Thread.sleep(1000);
js.executeScript("window.scrollBy(0,200)");//
Thread.sleep(1000);
js.executeScript("window.scrollBy(0,200)");//
Thread.sleep(1000);
js.executeScript("window.scrollBy(0,200)");//
Thread.sleep(1000);
WebElement whiteWatch=driver.findElement(By.xpath("//span[text()='Titanium Case with Starlight Alpine Loop']"));
Thread.sleep(1000);
whiteWatch.click();
Thread.sleep(1000);
js.executeScript("window.scrollBy(0,200)");//
Thread.sleep(1000);
js.executeScript("window.scrollBy(0,200)");//
Thread.sleep(1000);
WebElement greenWatch=driver.findElement(By.xpath("(//img[@class='colornav-swatch'])[2]"));
Thread.sleep(1000);
greenWatch.click();
//amzonSign.scolldwn();
}
}	
