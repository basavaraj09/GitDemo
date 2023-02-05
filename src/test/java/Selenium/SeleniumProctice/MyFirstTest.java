package Selenium.SeleniumProctice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {

	public static void main(String[] args) {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=iphone%2013&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");
		System.out.println(driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Starlight, 128 GB)']/../div[@class='fMghEO']/ul/li[@class='rgWa7D'][1]")).getText());
		driver.close();
		
		

	}

}
