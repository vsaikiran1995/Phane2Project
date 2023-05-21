package stepsdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AddToCartStepDef {
	
	public WebDriver driver=Hooks.driver;
	
	@When("I select the product and add to cart button")
	public void i_select_the_product_and_add_to_cart_button() {
	    driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']")).click();
	}

	@When("I click on cart symbol")
	public void i_click_on_cart_symbol() {
		driver.findElement(By.xpath("//*[@class='shopping_cart_link']")).click();
	    
	}

	@Then("validate the product is {string}")
	public void validate_the_product_is(String ExpectedProd) {
	    WebElement actual=driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
	    String actualProd = actual.getText();
	    Assert.assertEquals(actualProd, ExpectedProd);
	}

}
