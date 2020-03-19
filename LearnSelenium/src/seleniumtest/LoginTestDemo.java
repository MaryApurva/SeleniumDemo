package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("gademaryapurva@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("MaryApurva");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		String expectedresult= "Demo Web Shop"; //change to WebShop or something to get incorrect result
		String actualresult=driver.getTitle();
		System.out.println(actualresult);
		
		if(expectedresult.equals(actualresult))
		{
			System.out.println("correct page");
		}
		else
		{
			System.out.println("incorrect page");
		}
		driver.findElement(By.className("ico-logout")).click();
		driver.close();

	}

}
