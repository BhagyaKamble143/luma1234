package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDDrop2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
						
		WebDriver driver = new ChromeDriver(); //Browser Launch
    driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");//URL Insert
    driver.manage().window().maximize();
    Thread.sleep(2000);
   WebElement  Unitedstates=driver.findElement(By.xpath("//div[text()='United States']"));
   WebElement Captial =driver.findElement(By.xpath("(//div[text()='Washington'])[2]")); 
      Actions act =new Actions(driver);
        act.clickAndHold(Captial).perform();
        act.release(Unitedstates).perform();
   WebElement Italy=driver.findElement(By.xpath("//div[text()='Italy']")); 
   WebElement Rome =driver.findElement(By.xpath(" (//div[text()='Rome'])[2]")); 
        act.clickAndHold(Rome).perform();
        act.release(Italy).perform();
   WebElement Oslo=driver.findElement(By.xpath("(//div[text()='Oslo'])[2]")); 
   WebElement Norway =driver.findElement(By.xpath("//div[text()='Norway']")); 
        act.clickAndHold(Oslo).perform();
        act.release(Norway).perform();
   WebElement Copenhagen=driver.findElement(By.xpath("(//div[text()='Copenhagen'])[2]")); 
   WebElement Denmark =driver.findElement(By.xpath("//div[text()='Denmark']")); 
        act.clickAndHold(Copenhagen).perform();
        act.release(Denmark).perform();
   WebElement Madrid=driver.findElement(By.xpath("(//div[text()='Madrid'])[2]")); 
   WebElement Spain =driver.findElement(By.xpath("//div[text()='Spain']")); 
         act.clickAndHold(Madrid).perform();
         act.release(Spain).perform();
   WebElement Stockholm=driver.findElement(By.xpath("(//div[text()='Stockholm'])[2]"));
   WebElement Sweden =driver.findElement(By.xpath("//div[text()='Sweden']")); 
               act.clickAndHold(Stockholm).perform();
               act.release(Sweden).perform();    
   WebElement Seoul=driver.findElement(By.xpath("(//div[text()='Seoul'])[2]"));
   WebElement SouthKorea =driver.findElement(By.xpath("//div[text()='South Korea']")); 
                           act.click(Seoul).perform();
                           act.release(SouthKorea).perform();    
}
}
