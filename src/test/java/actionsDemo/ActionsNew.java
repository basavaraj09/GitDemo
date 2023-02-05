package actionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class ActionsNew {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions act = new Actions(driver);
		WebElement move=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		act.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT)
		.sendKeys("ihone  14 pro max").doubleClick().build().perform();
		
		//move to specific element
		act.moveToElement(move).contextClick().build().perform();
		
		
		
		
		
		
		

	}

}
