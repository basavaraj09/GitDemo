package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EndToEndT {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='IXJ']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='SXR']"))
				.click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("its disabled");
			Assert.assertTrue(true);

		} else {

			Assert.assertTrue(false);
		}

		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());// 5adault
		driver.findElement(By.cssSelector("input[value='Search']")).click();

	}

}
