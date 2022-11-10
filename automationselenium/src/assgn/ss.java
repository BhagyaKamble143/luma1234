package assgn;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ss {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/?affid=siteplug&affExtParam1=39c97eb7f327fd3079b085f4c66d0a48");

		Snapshot();

	}

	public static void Snapshot() throws IOException {

		Date Today = new Date();

		// System.out.println(Today);

		String filename = Today.toString().replace(' ', '_').replace(':', '-');

		File SS = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File Dest = new File("\\E:\\anuja\\" + filename + ".png");

		FileHandler.copy(SS, Dest);

}
}