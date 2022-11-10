package assignment1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
						
		WebDriver driver = new ChromeDriver(); //Browser Launch
    driver.get("https://www.google.com//");//URL Insert
       String Url=driver.getCurrentUrl();
       System.out.println(Url);
       if(Url.equals("https://www.google.com//")) {
    	   System.out.println("Google WebPage is open");
       }   else {
    	   System.out.println("Google WebPage is close");
       }
   Thread.sleep(2000);//wait 2 sec
       Options op = driver.manage();
       Window w = op.window();
       w.maximize();
  //driver.manage().window().maximize();//maximize the browser
      // Dimension d1 = new Dimension(200,400);
     //  driver.manage().window().setSize(d1);//change browser size 
   Thread.sleep(2000);//wait 2 sec
        Point p1 = new Point(500,100);
        driver.manage().window().setPosition(p1);//change browser position
    Thread.sleep(2000);
        driver.close();//close browser current tab
      
    
    

	}

}
