package glueCode_StepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import browserController.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class SignInGlueCode extends Base {

	@Given("I click on the SignIn_button")
	public void i_click_on_the_SignIn_button() {
		driver.findElement(By.xpath("/html/body/header/nav/div/ul[1]/li[9]/a")).click();
	}

	@Then("I should see the SignIn_page")
	public void i_should_see_the_SignIn_page() {
		driver.findElement(By.xpath("/html/body/header/nav/div/ul[1]/li[9]/div/div/div/div/div/div")).isDisplayed();

	}

	@Then("I click on mysage")
	public void i_click_on_mysage() {
		driver.findElement(By.xpath("/html/body/header/nav/div/ul[1]/li[9]/div/div/div/div/div/div/ul/li[1]/a"))
				.click();
	}

	@Then("I shoud be on the sign in page")
	public void i_shoud_be_on_the_sign_in_page() {
		driver.findElement(By.xpath("/html/body/div[1]/div")).isDisplayed();
	}

}
