package seleniumtest;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jdemo {

	public static void main(String[] args) {
		
		Logger log=Logger.getLogger(Log4jdemo.class);
		System.setProperty("webdriver.chrome.driver", "E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		log.info("URL Launched");
		
		
		String title=driver.getTitle();
		System.out.println("Title is: "+title);
		log.warn("Check Title");
		
		
		if(title.equals("Google"))
		{
			System.out.println("correct Title");
			log.info("The URL is correct");
		}
		else
		{
			System.out.println("incorrect Title");
			log.error("The URL is not correct");
		}
		driver.close();
		
		

	}

}
