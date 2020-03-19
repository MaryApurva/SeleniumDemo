package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class useoffirefox {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver", "E:\\Jar files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		boolean checkpresence=driver.findElement(By.id("Email")).isDisplayed();
		System.out.println(checkpresence);
		
		boolean checkenable=driver.findElement(By.id("Email")).isEnabled();
		System.out.println(checkenable);
		
		if(checkpresence==true && checkenable==true)
		{
			driver.findElement(By.id("Email")).sendKeys("gademaryapurva@gmail.com");
			
		}
	}

}
