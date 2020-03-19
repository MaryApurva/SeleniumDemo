package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class attribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		String attri=driver.findElement(By.id("Email")).getAttribute("type");
		System.out.println(attri);
		driver.findElement(By.id("Email")).sendKeys("apurvareddy1@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("apurvareddy");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Log out")).click();
	driver.close();
	
	}

}
