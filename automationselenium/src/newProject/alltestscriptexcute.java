package newProject;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import ScroollupDwn.amzonSign;

public class alltestscriptexcute {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
						
		WebDriver driver = new ChromeDriver(); //Browser Launch
    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");//URL Insert
    Thread.sleep(2000);
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("bhagyashrischoudhari@gmail.com");
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//span[@class='a-button-inner'])[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("priyanka100%");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath( "(//span[text()='All'])[2]")).click();
     Thread.sleep(5000);
    
     driver.findElement(By.xpath( "//a[@data-menu-id='10']")).click();
    Thread.sleep(3000);
    
     driver.findElement(By.xpath("//a[text()='T-shirts & Polos']")).click();
    Thread.sleep(10000);
    
    //Thread.sleep(7000);
   driver.findElement(By.xpath("//span[text()='Hooded Neck']")).click();
   Thread.sleep(7000);
   driver.findElement(By.xpath("(//img[@class='s-image'])[2]")).click();
   Thread.sleep(7000);
 ArrayList<String> aL= new ArrayList<String>(driver.getWindowHandles());
 driver.switchTo().window(aL.get(1));
 Thread.sleep(7000);
 WebElement Stv= driver.findElement(By.xpath("//select[@name=\"dropdown_selected_size_name\"]"));
 Thread.sleep(7000);
 Select S1=new Select(Stv);
 S1.selectByVisibleText("M");
 //Thread.sleep(3000);
// amzonSign.scolldwn(); 
 
 //Thread.sleep(2000);
 Actions Wc = new Actions(driver);
 //Thread.sleep(3000);
 WebElement addToCart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
 //Thread.sleep(3000);
 Wc.click(addToCart).perform();
 WebElement cl =driver.findElement(By.xpath("//div[@id='nav-cart-count-container']"));
 Wc.click(cl).perform();
 driver.findElement(By.xpath("//span[@id='sc-buy-box-ptc-button']")).click();
driver.close();
}
}
