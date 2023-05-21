package stepsdefs;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;




public class LoginStepDef {
	
	WebDriver driver = Hooks.driver;
	
	@Given("I have launched the application from browser")
	public void i_have_launched_the_application_from_browser() {
		driver.get("https://www.saucedemo.com/");

	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String UserName) {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(UserName);

	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String Password) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);

	}

	@When("I have click on login button")
	public void i_have_click_on_login_button() {
		 driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}

	@SuppressWarnings("deprecation")
	@Then("I should land on home page")
	public void i_should_land_on_home_page() {
		WebElement item = driver.findElement(By.xpath("//*[text()='Products']"));
		String expProd = item.getText();
		String actual = "Products";
		Assert.assertEquals(expProd, actual);
	}

	@SuppressWarnings("deprecation")
	@Then("I should get the error message as {string}")
	public void i_should_get_the_error_message_as(String ActualError) {
		WebElement error=driver.findElement(By.xpath("//h3[@data-test='error']"));	
		String expError = error.getText();
		Assert.assertEquals(expError, ActualError);
	    
	}

	
	

}
