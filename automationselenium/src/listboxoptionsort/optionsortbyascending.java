package listboxoptionsort;




import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class optionsortbyascending {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
						
		WebDriver driver = new ChromeDriver(); //Browser Launch
    driver.get("https://www.facebook.com/signup");//URL Insert
    driver.manage().window().maximize();
    Thread.sleep(2000);
    WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
        Select S=new Select(month);
    List<WebElement> l1 = S.getOptions();//all option fetch//rt.=list<webelement>
    Thread.sleep(2000);
    ArrayList<String> al = new ArrayList<String>();//
     for(WebElement w : l1) {  //for edge 
     System.out.println(w.getText());//wbelement method 
    	 String data=w.getText();//return text
    	 al.add(data);//arraylist method  add
     }
     Collections.sort(al);//sort by ascending
     
     System.out.println("******");
     
     for(String S1:al) {           //
    	 System.out.println(S1); //data of list box by ascending order
     }
  
    System.out.println("*********");
    for(int i=al.size()-1;i>=0;i--) {
    	System.out.println(al.get(i));//data by descending order by alphabet
    	
    
    	
    	//for(int i=l1.size()-1;i>0;i--){
    	//System.out.println(l1.get(i).getText());//descending order by month
    	//}
    	
    }
    
    driver.close();

	} 
}
