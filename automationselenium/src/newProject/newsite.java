package newProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class newsite {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
						
		WebDriver driver = new ChromeDriver(); //Browser Launch
    driver.get("http://automationpractice.com//index.php?id_product=7&controller=product");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    WebElement dress=driver.findElement(By.xpath("(//a [@title='Dresses'])[3]"));
    dress.click();
    Thread.sleep(2000);
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,1000)");
    Thread.sleep(2000);
    WebElement sortproduct =driver.findElement(By.xpath("//select[@id='selectProductSort']"));
   Select s =new Select(sortproduct );
   Thread.sleep(2000);
   s.isMultiple();
   s.selectByVisibleText("Product Name: A to Z");
   Thread.sleep(2000);
   js.executeScript("window.scrollBy(0,500)");
   Thread.sleep(2000);
   Actions act=new Actions(driver);
   WebElement Bdress=driver.findElement(By.xpath("(//img[@title=\"Printed Dress\"])[2]"));
   act.click(Bdress).perform();
   Thread.sleep(2000);
   //WebElement dressBlk=driver.findElement(By.xpath("(//a [@title='Dresses'])[3]"));
   driver.switchTo().frame(0);
   Thread.sleep(2000);
   WebElement size =driver.findElement(By.xpath("//select[@id='group_1']"));
   Select s1 =new Select(size);
   Thread.sleep(2000);
   s1.isMultiple();
   s1.selectByVisibleText("M");
   Thread.sleep(2002);
   WebElement Addtocart=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	Addtocart.click();
	 Thread.sleep(2000);
	 driver.switchTo().defaultContent();//
	 Thread.sleep(2000);
WebElement cart=driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
    act.click(cart).perform();
  Thread.sleep(2000);
   // cart.click();
    Thread.sleep(2000);
 WebElement checkout=driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
    checkout.click();
    Thread.sleep(2000);
	}//select[@id="group_1"]
}
