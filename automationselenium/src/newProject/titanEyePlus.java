package newProject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class titanEyePlus {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.titaneyeplus.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		        String title=driver.getTitle();
		System.out.println(title);
		WebElement log=driver.findElement(By.xpath("(//li[@data-label='or'])[1]"));
		log.click();
		Thread.sleep(2000);
		WebElement user=driver.findElement(By.xpath("(//input[@class='input-text'])[3]"));
		user.click();
		user.sendKeys("anujakamble37@gmail.com");
		Thread.sleep(2000);
		WebElement pass=driver.findElement(By.xpath("(//input[@name='login[password]'])[1]"));
		pass.click();
		pass.sendKeys("Anuja123");
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.xpath("//button[@id='customerloginsubmit']"));
		login.click();
		Thread.sleep(2000);
		WebElement glass=driver.findElement(By.xpath("//span[text()='Eyeglasses']"));
		Actions eye=new Actions(driver);
		eye.moveToElement(glass).perform();
		WebElement women=driver.findElement(By.xpath("(//a[@href='https://www.titaneyeplus.com/eyeglasses-women.html'])[1]"));
		women.click();
		Thread.sleep(2000);
		WebElement position=driver.findElement(By.xpath("(//select[@id='sorter'])[1]"));
		Select s=new Select(position);
		s.selectByIndex(1);
		Thread.sleep(2000);
		WebElement blue=driver.findElement(By.xpath("(//img[@alt='Black Cateye Women Eyeglasses (FT1397WFP3MBKV|50)'])[1]"));
		blue.click();
		Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,2000)");
		  Thread.sleep(2000);
		  js.executeScript("window.scrollBy(2000,0)");
		  Thread.sleep(2000);
		  js.executeScript("window.scrollBy(1000,0)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-3000,0)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(1000,2000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-3000,0)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(1000,-2000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-3000,-3000)");
		Thread.sleep(2000);
		  File l= (( TakesScreenshot )driver).getScreenshotAs(OutputType.FILE);
		  File d=new File("C:\\Users\\hp\\Desktop\\Anuja.jpg");
		  FileHandler.copy(l, d);
		        Thread.sleep(4000);
		ArrayList<String> al=new ArrayList<String>(driver.getWindowHandles());
		        driver.switchTo().window(al.get(0));
		Thread.sleep(2000);
		        WebElement logout=driver.findElement(By.xpath("(//a[@href='https://www.titaneyeplus.com/customer/account/logout/'])[2]"));
		         logout.click();
		         Thread.sleep(2000);
		         driver.quit();

		}
		}



