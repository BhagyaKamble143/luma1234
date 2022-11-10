import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselect {
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
    S.selectByIndex(3);//select python
    Thread.sleep(2000);
    S.selectByValue("c#");//select c#
    Thread.sleep(2000);
    S.selectByVisibleText("JavaScript");//select javascript
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
   //S.deselectAll();
    S.deselectByValue("js");//javascrift deselect
    Thread.sleep(2000);
    S.deselectByIndex(3);//patyon
    Thread.sleep(2000);
    S.deselectByVisibleText("C#");//c#
    Thread.sleep(2000);
    driver.close();
	}
}
