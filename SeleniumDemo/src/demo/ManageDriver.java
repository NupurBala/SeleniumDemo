package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class ManageDriver {

		public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			WebElement usernm =driver.findElement(By.id("email"));
			usernm.sendKeys("nupurbala@gmail.com");
			
			driver.findElement(By.name("pass")).sendKeys("test");
			
			driver.findElement(By.id("loginbutton")).click();
			}
	} 


