package xpathpractisesProGream;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class onlytest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
								
				WebDriver driver = new ChromeDriver(); //Browser Launch
		    driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html"); //URL Insert
		    Thread.sleep(2000);
		    driver.manage().window().maximize();//maximize the browser
		    Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@id='text1']")).sendKeys("Bhagyashri");
            Thread.sleep(4000);
            WebElement day=driver.findElement(By.xpath("//select[@id='Carlist']"));
			Select s= new Select(day);
			Thread.sleep(2000);
			s.selectByIndex(1);
            WebElement wb=driver.findElement(By.xpath("//select[@name=\"FromLB\"]"));
			Select S= new Select(wb);
			Thread.sleep(2000);
			S.selectByValue("USA");
			Thread.sleep(2000);
			S.selectByIndex(5);
			Thread.sleep(2000);
			S.selectByVisibleText("Italy");
			Thread.sleep(2000);
			WebElement con =S.getFirstSelectedOption();
			System.out.println(S.getFirstSelectedOption().getText());
			Thread.sleep(2000);
			System.out.println(S.isMultiple());
			Thread.sleep(2000);
			List <WebElement> l =S.getAllSelectedOptions();
			System.out.println(l.size());
			for(int i= 0;i<l.size();i++) {
				System.out.println(l.get(i).getText());
			}
			Thread.sleep(2000);
			List<WebElement> l1=S.getOptions();
			System.out.println(l1.size());
			for(int a=0;a<l1.size();a++) {
			System.out.println(l1.get(a).getText());
			}
			Thread.sleep(2000);
			S.deselectAll();
			Thread.sleep(2000);
			driver.close();
			
	}

}
