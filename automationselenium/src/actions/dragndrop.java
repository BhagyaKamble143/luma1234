package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
						
		WebDriver driver = new ChromeDriver(); //Browser Launch
    driver.get("https://demo.guru99.com/test/drag_drop.html");//URL Insert
    driver.manage().window().maximize();
    Thread.sleep(2000);
    WebElement source=driver.findElement(By.xpath("(//a[@class='button button-orange'])[1]"));
    WebElement dest=driver.findElement(By.xpath("//ol[@align='center']")); 
    Actions act =new Actions(driver);
    //act.moveToElement(fresh).click().perform();
    //act.doubleClick(fresh).build().perform();
    //act.clickAndHold(source).perform();
    //act.release(dest).perform();
    
    //.contextClick(butt).perform();
    act.dragAndDrop(source, dest).perform();
    
}
}