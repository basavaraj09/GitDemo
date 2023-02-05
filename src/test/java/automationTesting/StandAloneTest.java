package automationTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class StandAloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/client/");

		driver.findElement(By.id("userEmail")).sendKeys("basavarajshirur918@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Basavaraj@093");
		driver.findElement(By.id("login")).click();

	}

}
