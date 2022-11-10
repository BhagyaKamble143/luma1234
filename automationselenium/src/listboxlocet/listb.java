package listboxlocet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listb {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
								
				WebDriver driver = new ChromeDriver(); //Browser Launch
				driver.get("https://www.facebook.com/signup");//insert url
				driver.manage().window().maximize();
				Thread.sleep(2000);
				WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
				Select s= new Select(day);
				Thread.sleep(2000);
				s.selectByIndex(21);//index 0=22
				//System.out.println(s.isMultiple());//RT boolean //flase
				Thread.sleep(2000);
				WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
				Select m= new Select(month);
				Thread.sleep(2000);
				    m.selectByValue("12");//value 
				Thread.sleep(2000);
				WebElement year =driver.findElement(By.xpath("//select[@id='year']"));
				Select y= new Select(year);
				Thread.sleep(2000);
				  y.selectByVisibleText("1991");//text value 
				Thread.sleep(2000);
				driver.close();
				
	}

}
