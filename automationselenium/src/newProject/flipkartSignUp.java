package newProject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import ScroollupDwn.amzonSign;

public class flipkartSignUp {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
						
		WebDriver driver = new ChromeDriver(); //Browser Launch
    driver.get("https://www.flipkart.com/account/login?ret=/account/login%3Fsignup%3Dtrue");//URL Insert
          Thread.sleep(2000);
    driver.manage().window().maximize();
         Thread.sleep(2000);
    driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("8329937502");
         Thread.sleep(2000);
  driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("priyanka100%");
         Thread.sleep(3000);
  driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
         Thread.sleep(20000);
  WebElement beauty=driver.findElement(By.xpath("//div[text()='Beauty']"));
        Actions at =new Actions( driver);
           at.click(beauty).perform();
         Thread.sleep(7000);
  WebElement beautycaRe=driver.findElement(By.xpath("//a[text()='Beauty & Personal Care']"));
           at.click(beautycaRe).perform();
         Thread.sleep(2000);
   driver.findElement(By.xpath("//a[text()='Makeup']")).click();
          Thread.sleep(2000);
   driver.findElement(By.xpath("//a[text()='Lips']")).click();
            Thread.sleep(2000);
   driver.findElement(By.xpath("(//a[text()='Lipstick'])[1]")).click();
            Thread.sleep(2000);
       JavascriptExecutor js=(JavascriptExecutor)driver;
         js.executeScript("window.scrollBy(0,700)");
            Thread.sleep(2000);
   driver.findElement(By.xpath("//div[text()='Color']")).click();
            Thread.sleep(2000);
   driver.findElement(By.xpath("//span[text()='16 MORE']")).click();
            Thread.sleep(2000);
   driver.findElement(By.xpath("//div[text()='Red']")).click();
             Thread.sleep(2000);
          js.executeScript("window.scrollBy(0,1000)");
             Thread.sleep(2000);
   driver.findElement(By.xpath("(//a[text()='Lakmé Cushion Matte Lipstick'])[1]")).click();
             Thread.sleep(2000);
        ArrayList<String> Al=new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(Al.get(1));
             Thread.sleep(2000);
             Date dt=new Date();
	String S1=dt.toString().replace(' ', '_').replace(':', '-');
       File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       File Dest=new File ("C:\\Users\\hp\\Desktop\\Anuja"+S1+".jpg");
       FileHandler.copy(Source, Dest);
               Thread.sleep(2000);
   driver.findElement(By.xpath("//button[text()='GO TO CART']")).click();
            Thread.sleep(2000);
           
         Thread.sleep(2000);
        driver.close();
     
        
	}
}