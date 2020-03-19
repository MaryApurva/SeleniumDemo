package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demotask {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		
		String title=driver.getTitle();
		int PageLength=title.length();
		System.out.println(title);
		System.out.println("Page Length is " +PageLength);
		System.out.println("Page URL is " + driver.getCurrentUrl());
		
		String exppage= "http://demowebshop.tricentis.com/login"; 
		String actpage=driver.getCurrentUrl();
		System.out.println(actpage);
		
		if(exppage.equals(actpage))
		{
			System.out.println("correct URL");
		}
		else
		{
			System.out.println("incorrect URL");
		}
		
		
		String s=driver.getPageSource();
		System.out.println(s);
		System.out.println("The length is :" +s.length());
		
	}

	
	
}
