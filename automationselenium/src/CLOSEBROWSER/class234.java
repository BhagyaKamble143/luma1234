package CLOSEBROWSER;



import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class class234 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
								
				WebDriver driver = new ChromeDriver(); //Browser Launch
		    driver.get("https://www.w3schools.com/js/default.asp");//insert url
		   Thread.sleep(2000);
		    driver.manage().window().maximize();//browser maximize
		    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_myfirst']")).click();
	    //driver.findElement(By.xpath("//button [text()='Submit Answer »']")).click();
		Thread.sleep(2000);
		String main = driver.getWindowHandle();//return ID main windows
		String exptResult="https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst ";
		//String ExpId="";
		Set<String>str=driver.getWindowHandles();//return Id main+child browser 
		
		for(String S: str) {
			System.out.println(S);
			Thread.sleep(2000);
			driver.switchTo().window(S);
			Thread.sleep(2000);
			String ActualUrl=driver.getCurrentUrl();
			Thread.sleep(2000);
			if(exptResult.equals(ActualUrl)) {
				System.out.println("correct Window");
				//String ExtId=S;//stored ID after Switch in correct window
				break;//
				
			}else {
				System.out.println("incorrect Window");
			}
		}
		Thread.sleep(2000);
		//driver.switchTo().window(ExpId);//Switch to excepted window byID
		//driver.switchTo().window(exptResult);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Save code']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		//driver.findElement(By.xpath("//a[text()='Not Sure Where To Begin?']"));
		Thread.sleep(2000);
		driver.quit();
	}
}