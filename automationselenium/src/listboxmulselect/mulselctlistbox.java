package listboxmulselect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mulselctlistbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Browser Launch
    driver.get("http://practice.cybertekschool.com/dropdown"); //URL Insert
    Thread.sleep(2000);
    driver.manage().window().maximize();
    WebElement lan =driver.findElement(By.xpath("//select[@name='Languages']"));
    Select S=new Select(lan);
    Thread.sleep(2000);
    S.selectByIndex(3);//select python//RT=void
    Thread.sleep(2000);
    S.selectByValue("c#");//select c#//RT=void
    Thread.sleep(2000);
    S.selectByVisibleText("JavaScript");//select javascript//RT=void
    Thread.sleep(2000);
   WebElement firstslect=S.getFirstSelectedOption();//return 1st selected option//RT=webelemnt
   Thread.sleep(2000);
   System.out.println(firstslect);//return Xpath=webelement//
   Thread.sleep(2000);
   System.out.println(firstslect.getText());//return text of wbelement//RT=String//JavaScript
   Thread.sleep(2000);
   System.out.println(S.getFirstSelectedOption().getText());//return text of wbelement//JavaScript
   Thread.sleep(2000);
   System.out.println(S.isMultiple());//RT boolean//Verify listbx is multi-selectable or not//True
   Thread.sleep(2000);
   
   List<WebElement>l=S.getAllSelectedOptions();//return all selected option //RT=list<wbelemnt>
  System.out.println(S.getAllSelectedOptions());//xpath
   System.out.println(l.size());//count of selected options//RT=int
   for(int i=0 ; i<l.size();i++) {
	   System.out.println(l.get(i).getText());//print text of selected options
	    }
   List<WebElement>l1=S.getOptions();//return all option of listbox
   System.out.println(l1.size());//int=RT
   for(int j=0;j<l1.size();j++) {
	   System.out.println(l1.get(j).getText());//RT of get mthd= wbemnt//RTof get text methd= String
   }                                           //print text of all options
   //S.deselectAll();
    S.deselectByValue("js");//javascrift deselect//RT=void
    Thread.sleep(2000);
    S.deselectByIndex(3);//patyon//RT=void
    Thread.sleep(2000);
    S.deselectByVisibleText("C#");//c#//RT=void
    Thread.sleep(2000);
    driver.close();
	}
}
