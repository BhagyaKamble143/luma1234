package xpathpractisesProGream;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class omayo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
								
				WebDriver driver = new ChromeDriver(); //Browser Launch
		    driver.get("https://omayo.blogspot.com/"); //URL Insert
		    Thread.sleep(2000);
		    driver.manage().window().maximize();
 WebElement lan=driver.findElement(By.xpath("//select[@id='multiselect1']"));
    Thread.sleep(2000);
   Select S =new Select(lan);
   Thread.sleep(2000);
   S.selectByIndex(1);//
   Thread.sleep(2000);
   S.selectByValue("audix");//
   Thread.sleep(2000);
   S.selectByVisibleText("Hyundai");//
   Thread.sleep(2000);
   WebElement firstselect=S.getFirstSelectedOption();
   System.out.println(S.getFirstSelectedOption().getText());
   
  List <WebElement> l= S.getAllSelectedOptions();
  System.out.println(l.size());
   for(int i=0;i<l.size();i++) {
	   System.out.println(l.get(i).getText());
	   }
  List <WebElement> l2 =S.getOptions();
      System.out.println(l2.size());
   for(int j=0;j<l2.size();j++) {
	 System.out.println(l2.get(j).getText());
       }
  S.deselectByIndex(1);
  Thread.sleep(2000);
  S.deselectByValue("audix");
  Thread.sleep(2000);
  S.deselectByVisibleText("Hyundai");
  Thread.sleep(2000);
  driver.close();
		    
		    
	}

}
