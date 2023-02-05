
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// December 14th
		// JavascriptExecutor js = (JavascriptExecutor) driver;

		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 30);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);

		// date selecct
		WebElement date = driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']"));
		// ((JavascriptExecutor)
		// driver).executeScript("arguments[0].scrollIntoView(true);",date);
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/input[@id='form-field-travel_comp_date']")));
		// wait.until(ExpectedConditions.visibilityOf(By.xpath("//div/input[@id='form-field-travel_comp_date']")));
		// jse.executeScript("arguments[0].click();", date);
		date.click();

		// Month select

	/*	WebElement month = driver.findElement(By.xpath("//span[@class='cur-month']"));

		for (int i = 0; i < 1; i++) {
			jse.executeScript("arguments[0].scrollTop += 20;", month);
			month.getText().contains("December");

		}*/

		List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));

		int count = driver.findElements(By.className("flatpickr-day")).size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
			if (text.equalsIgnoreCase("9")) {
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				break;

			}
		}
	}

}
