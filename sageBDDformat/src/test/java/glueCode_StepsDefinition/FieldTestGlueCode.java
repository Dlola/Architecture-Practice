package glueCode_StepsDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import browserController.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")

public class FieldTestGlueCode extends Base {
	// USE TO TAB
	Robot robot;

	@Given("I am on the SignIn_page")
	public void i_am_on_the_SignIn_page() {
		driver.get(signinUrl);
	}

	@Given("I type my {string}")
	public void i_type_my(String emailID) {
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement email = driver.findElement(By.xpath("//*[@id=\"sso_Email\"]"));
		email.sendKeys(emailID);
	}

	@Then("I TAB")
	public void i_TAB() {
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("I type my account {string}")
	public void i_type_my_account(String password) {
		WebElement password1 = driver.findElement(By.xpath("//*[@id=\"sso_Password\"]"));
		password1.sendKeys(password);
	}

	@When("I click on the Sign_in button")
	public void i_click_on_the_Sign_in_button() {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/p[5]/input")).click();
	}

	@Then("I should get an error message")
	public void i_should_get_an_error_message() {
		WebElement errorMsg = driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div"));
		Assert.assertTrue(errorMsg.isDisplayed());
	}
}
