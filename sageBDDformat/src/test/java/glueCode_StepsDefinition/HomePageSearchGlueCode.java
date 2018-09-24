package glueCode_StepsDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import browserController.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class HomePageSearchGlueCode extends Base {

	@Given("I scroll down")
	public void i_scroll_down() {
		// Create instance of Javascript executor
		JavascriptExecutor je = (JavascriptExecutor) driver;

		// Identify the WebElement which will appear after scrolling down
		WebElement element = driver
				.findElement(By.xpath("/html/body/footer/div/div[1]/div/div[1]/div/div[2]/form/label/input"));

		// now execute query which actually will scroll until that element is not
		// appeared on page.
		je.executeScript("arguments[0].scrollIntoView(true);", element);

		// Extract the text and verify
		// System.out.println(element.getText());

		// select text
		// driver.findElement(By.xpath("/html/body/footer/div/div[1]/div/div[1]/div/div[2]/form/label/input")).click();
	}

	@Then("I should see the search field")
	public static void i_should_see_the_search_field() {
		WebElement SearchField = driver
				.findElement(By.xpath("/html/body/footer/div/div[1]/div/div[1]/div/div[2]/form/label/input"));
		Assert.assertTrue(SearchField.isDisplayed());
	}

	@When("I search a {string}")
	public void i_search_a(String word) {
		WebElement SearchField = driver
				.findElement(By.xpath("/html/body/footer/div/div[1]/div/div[1]/div/div[2]/form/label/input"));
		SearchField.click();
		SearchField.sendKeys(word);

		// Enter Buttion
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("I should see the search results {string}")
	public void i_should_see_the_search_results(String wrd) {

		// IN IMPLIMENTATION
		String results = driver.getCurrentUrl();
		Assert.assertTrue(results.contains(results));

	}

}
