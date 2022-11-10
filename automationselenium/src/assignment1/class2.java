package assignment1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class class2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
						
		WebDriver driver = new ChromeDriver(); //Browser Launch
	driver.get("http://www.google.com//"); //url insert
	driver.manage().window().maximize();//maximize browser
		 Options op = driver.manage();
		    Window w = op.window();
		    w.maximize();
		  System.out.println(driver.getTitle());//display title
		  System.out.println(driver.getCurrentUrl());//url of wbpg as an o/p
	driver.navigate().to("https://www.facebook.com/login/");//url insert
		 Thread.sleep(2000);//wait for 2 sec
		 Navigation  nv=driver.navigate();
			nv.back();//backward to google page
			String url=driver.getCurrentUrl();
			if(url.equals("https://www.google.com/?gws_rd=ssl")) {
				System.out.println("google webpage is open");
			}else {
				System.out.println("google webpage is close");
			}
	     Thread.sleep(3000);//wait for 3 sec
		  Dimension d1 = new Dimension(200,400);
	driver.manage().window().setSize(d1);//change browser size
		 Thread.sleep(2000);//wait for 2 sec
			    Point p1 = new Point(100,500);
    driver.manage().window().setPosition(p1);//change browser position
		 Thread.sleep(2000);//wait for 2 sec
			    Options op1 = driver.manage();
			    Window w1 = op1.window();
			    w1.maximize();// maximize browser
         Thread.sleep(2000);//wait for 2 sec
			    Navigation  nv1=driver.navigate();
				nv1.forward();//forward to fb page
				String URL=driver.getCurrentUrl();
				if(URL.equals("https://www.facebook.com/login/")) {
					System.out.println("facebook page is open");
				}else {
					System.out.println("facebook page is close");
				}
		
				nv1.refresh();// browser reload
	      Thread.sleep(2000);
				driver.close();
	}

}
