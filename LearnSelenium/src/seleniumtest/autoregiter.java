package seleniumtest;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class autoregiter {
	
		public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver", "E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://demo.automationtesting.in/Register.html");
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Apurva");
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Reddy");
			driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("H.No: 8-98/A, Reddy's street, Electronic city, Bangaluru,Karnataka");
			driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']")).sendKeys("apurvareddy@gmail.com");
			driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']")).sendKeys("9876543211");
			
			//driver.findElement(By.xpath("//label[2]//input[1]")).click();
			driver.findElement(By.xpath("//*[@name='radiooptions' and @value='FeMale']")).click();
			//driver.findElement(By.xpath("//input[@name='radiooptions' and @value='FeMale']")).click();
			
		//	driver.findElement(By.id("checkbox2")).click();    to print only particular checkbox
			
			List<WebElement>cd=driver.findElements(By.xpath("//input[@type='checkbox']"));
			for(int i=0;i<cd.size();i++)
			{
				cd.get(i).click();
			}
			driver.findElement(By.id("msdd")).click();
			driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Hindi')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Arabic')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Greek')]")).click();

			//driver.findElement(By.id("Skills")).sendKeys("Adobe Photoshop");
			
			//driver.findElement(By.linkText("English")).click();
			
			//Select scroll = new Select(driver.findElement(By.id("msdd")));  
			//scroll.selectByVisibleText("English"); 
			
			Select dropdown = new Select(driver.findElement(By.id("Skills")));  
			dropdown.selectByVisibleText("Adobe Photoshop");  
			Select dropdownn = new Select(driver.findElement(By.id("countries")));  
			dropdownn.selectByVisibleText("India");
			//Select dropdownnn = new Select(driver.findElement(By.id("Select country:")));  
			//dropdownnn.selectByVisibleText("Australia");
			
			
//			driver.findElement(By.xpath("//option[contains(text(),'1998')]")).click();
//			driver.findElement(By.xpath("//option[contains(text(),'February')]")).click();
//			driver.findElement(By.xpath("//select[@id='daybox']//option[contains(text(),'19')]")).click();

			driver.findElement(By.id("firstpassword")).sendKeys("Mary@5");
			driver.findElement(By.id("secondpassword")).sendKeys("Mary@5");
			
			WebElement year=driver.findElement(By.xpath("//select[@placeholder='Year']"));
			Select sel1=new Select(year);
			sel1.selectByValue("1998");
			
			List<WebElement> yearcount=sel1.getOptions();
			System.out.println(yearcount.size());
			for(int i=0;i<yearcount.size();i++)
			{
				System.out.println(yearcount.get(i).getText());
			}
			
			WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
			Select sel2=new Select(month);
			sel2.selectByVisibleText("May");
			
			List<WebElement> monthcount=sel2.getOptions();
			System.out.println(monthcount.size());
			for(int i=0;i<monthcount.size();i++)
			{
				System.out.println(monthcount.get(i).getText());
			}
			
			WebElement day=driver.findElement(By.xpath("//select[@id='daybox']"));
			Select sel=new Select(day);
			sel.selectByValue("19");
			
			List<WebElement> daycount=sel.getOptions();
			System.out.println(daycount.size());
			for(int i=0;i<daycount.size();i++)
			{
				System.out.println(daycount.get(i).getText());
			}
			
//			WebElement logo = driver.findElement(By.cssSelector(".forum-logo"));
//		     String logoSRC = logo.getAttribute("src");
//		     
//		     URL imageURL = new URL(logoSRC);
//		     BufferedImage saveImage = ImageIO.read(imageURL);
//		     
//		     ImageIO.write(saveImage, "png", new File("C:\\Users\\IBM\\Downloads\\images.jfif"));
//		     
			
			//driver.findElement(By.id("imagesrc")).;

			
			
			//driver.findElement(By.id("submitbtn")).click();

			
			driver.close(); //will close current active window opened by selenium
			//driver.quit(); will close multiple windows opened by selenium,when we click on different links.
			

	}

}
