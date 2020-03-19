package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/register");
		driver.findElement(By.id("FirstName")).sendKeys("Apurva");
		driver.findElement(By.id("LastName")).sendKeys("Reddy");
		driver.findElement(By.id("Email")).sendKeys("apurvareddy1234@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("apurvareddy");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("apurvareddy");
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("register-button")).click();
		
		driver.get("http://demowebshop.tricentis.com/registerresult/1");
		driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']")).click();
		
		

	}

}
