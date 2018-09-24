package browserController;

import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BrowserProperties extends Base {

	@Before
	public void openBrowser() {
		if (driverType.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "../sageBDDformat/src/test/java/resources/geckodriver.exe");
			driver = new FirefoxDriver();

		}
	}
	// //chrome
	// else if(browserType.equalsIgnoreCase("Chrome"))
	// System.setProperty("webdriver.chrome.driver",
	// "../BDD_Framework/src/test/java/Resources/chromedriver.exe");
	// browser = new ChromeDriver();
	// {
	// }

	@After
	public void closeBroswer() {
		driver.close();
	}

}
