package automationselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class class2 {
        public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
  "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //Browser Launch
		driver.get("https://www.selenium.dev/downloads"); //URL Insert
		//driver.navigate().to("https://www.selenium.dev/downloads");
		String url=driver.getCurrentUrl();//return current URL of browser
		System.out.println(url);
		System.out.println(driver.getTitle());//return the Title of tab
		
		Navigation  nv=driver.navigate();
		nv.back();//backward
		
		nv.forward();//click on forward button
		Thread.sleep(5000);//wait 5 sec
		
		nv.refresh();// browser reload
		Thread.sleep(5000);//delay 5 sec
		
		//driver.quit();//All tab of browser close
		driver.close();//current tab of browser close
		
		
	}

}
