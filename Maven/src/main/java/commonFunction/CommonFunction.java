package commonFunction;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunction {
	public static WebDriver driver = null;
	public static Properties properties=null;

	public Properties loadProperties() throws IOException {
		FileInputStream stream = new FileInputStream("Config.properties");
		properties = new Properties();
		properties.load(stream);
		return properties;
	}
	@BeforeSuite
	public void launchBrowser() throws IOException {
		loadProperties();
		String driverLocation = properties.getProperty("driverLocation");
		String url = properties.getProperty("url");
		String browser = properties.getProperty("browser");
		
		if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",driverLocation );
			driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",driverLocation );
			driver = new ChromeDriver();
			
		}
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@AfterSuite
	public void closeBrowser(){
		//driver.quit();
	}
}
