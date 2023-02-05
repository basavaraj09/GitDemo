package FunctionalTesting;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebDriverWait w=new WebDriverWait(driver,5);

		// expected array
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(5000);
		addItems(driver, itemsNeeded);
		driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div/input[@class='promoCode']")));
		driver.findElement(By.xpath("//div/input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		//explicit wait 
		
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		
		
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();

			// check wheather name you extracted is present in array or not-
			// convert array into array list for easy search

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName)) {
				j++;
				// click on add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length) {
					break;

				}
			}

		}
	}

}
