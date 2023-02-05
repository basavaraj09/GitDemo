import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		//December 14th
		driver.findElement(By.className("")).click();
		Thread.sleep(5000);
		List<WebElement> dates=driver.findElements(By.className("flatpickr-day "));
		
		
		int count=driver.findElements(By.className("flatpickr-day ")).size();
		
		
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("flatpickr-day ")).get(i).getText();
			if(text.equalsIgnoreCase("14")) 
			{
				driver.findElements(By.className("flatpickr-day ")).get(i).click();
				break;
				
			}
		}
	}

}
