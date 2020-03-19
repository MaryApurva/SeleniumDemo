package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.navigate().to("http://demowebshop.tricentis.com");
		driver.navigate().to("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("No of links : " +links.size());
		
		for(int i=0;i<links.size();i++)
		{
			System.out.println("link names are: " +links.get(i).getText());
		}
		driver.close();
	}

}
