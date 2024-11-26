package Java2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class property_file {

	public static void main(String[] args) throws IOException {
		WebDriver driver = null;
		FileInputStream inputStream = new FileInputStream("config.properties");
		Properties properties = new Properties();
		properties.load(inputStream);
		String browser = properties.getProperty("browser");
		String driver_location = properties.getProperty("driver_location");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driver_location);
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.gecko.driver", driver_location);
			driver = new EdgeDriver();
		}
          driver.get("https://www.google.com/");
	}

}
