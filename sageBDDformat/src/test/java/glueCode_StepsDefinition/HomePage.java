package glueCode_StepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import browserController.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class HomePage extends Base {

	@Given("I am on the home page")
	public void i_am_on_the_home_page() {
		driver.get(baseUrl);
	}

	@Given("the page title is {string}")
	public void the_page_title_is(String expTitle) {
		Assert.assertEquals(expTitle, driver.getTitle());

	}

	@Given("I click on {string} tab")
	public void i_click_on_tab(String locator) {
		driver.findElement(By.xpath(locator)).click();
	}

	@Then("I verify {string} is visible")
	public void i_verify_is_visible(String expWord) {
		WebElement expword1 = driver.findElement(By.xpath(expWord));
		Assert.assertTrue(expword1.isDisplayed());
	}

}
