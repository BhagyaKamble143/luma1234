package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseactions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
						
		WebDriver driver = new ChromeDriver(); //Browser Launch
    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");//URL Insert
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("bhagyashrischoudhari@gmail.com");
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//span[@class='a-button-inner'])[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("priyanka100%");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
    WebElement fresh=driver.findElement(By.xpath("//a[text()='Fresh']"));
    Actions act =new Actions(driver);
    //act.moveToElement(fresh).click().perform();
    //act.doubleClick(fresh).build().perform();
    act.contextClick(fresh).perform();
    

}
}