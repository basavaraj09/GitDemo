

import javax.swing.text.html.Option;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import okio.Options;

public class Chrmoption {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
	//	options.addExtensions("")
		Proxy proxy=new Proxy();
		proxy.setHttpProxy("ipaddress:46254545");
		options.setCapability("proxy",proxy);
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
	}

}
