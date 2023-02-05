import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//1.Give me the count of links on the page.
		// a
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
//2.count of footer section
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
//3.count of column section
		WebElement columDriver = footerDriver.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));

		System.out.println(columDriver.findElements(By.tagName("a")).size());

//click on each link in the column and check if the pages are opening-
		for (int i = 1; i < columDriver.findElements(By.tagName("a")).size(); i++) {

			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			columDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000);
		}
			Set<String> abc = driver.getWindowHandles();
			Iterator<String> it = abc.iterator();
			
		
			while (it.hasNext()) {
				
				
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		

	}
	

}
