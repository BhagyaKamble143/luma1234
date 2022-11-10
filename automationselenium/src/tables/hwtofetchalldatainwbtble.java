package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hwtofetchalldatainwbtble {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
							
			WebDriver driver = new ChromeDriver(); //Browser Launch
	    driver.get("https://www.w3schools.com/html/html_tables.asp");//insert url
	   Thread.sleep(2000);
	    driver.manage().window().maximize();//browser maximize
	    Thread.sleep(3000);
	    //relative Xpath we use tr use for rows tagname
	    
	    List <WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']//tr"));
	    System.out.println(rows.size());//return count of all rows present in table
	  //realative aswell as absolute xpath use and th is header cell  tagname
	    
      List <WebElement> Headercell =driver.findElements(By.xpath("//table[@id='customers']//tr/th"));
      List <WebElement> Remainingcell =driver.findElements(By.xpath("//table[@id='customers']//tr/td"));
	    System.out.println(Headercell.size()+Remainingcell.size());//return count of allcell present in table
	    
	    for(int i=1;i<=rows.size();i++) {
	    	List <WebElement> rowcells;
	    	
	    	if (i==1) {
	    		rowcells=driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]/th"));
	    		//System.out.print(rows.get(i).getText());
	    	}else {
	    		rowcells=driver.findElements(By.xpath("(//table[@id='customers'])//tr["+i+"]//td"));
	    		
			}
	    	for(int j=0;j<rowcells.size();j++) {
	    		System.out.print(rowcells.get(j).getText()+" ");
	    	}
	    	System.out.println();
	    }
	    
	    Thread.sleep(3000);
	    driver.close();
}

}
