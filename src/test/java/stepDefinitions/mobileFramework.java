/*To test functional scenarios using selenium*/
package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.Utils;

public class mobileFramework extends Utils  {
	
	@Given("a User launch browser and type google.com")
	public void a_user_launch_browser_and_type_google_com() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		driver = getMobileDriver();
		driver.get(getGlobalValue("desktopUrl"));
	}
	@When("a user search for apple and press enter")
    public void a_user_search_for_apple_and_press_enter() throws IOException{
		driver.findElement(By.xpath(getLocator("google_search_xpath"))).sendKeys("apple");
		driver.findElement(By.xpath(getLocator("google_search_xpath"))).sendKeys(Keys.ENTER);;		
        
    }

    @Then("a search results opens")
    public void a_search_results_opens() throws Throwable {
    	
        Assert.assertEquals(driver.findElement(By.xpath(getLocator("google_search_xpath"))).getText(), "apple");
    }

    @And("a Apple is present on that")
    public void a_apple_is_present_on_that() throws Throwable {
    	driver.findElement(By.xpath(getLocator("search_text_xpath"))).isDisplayed();
        
    }

}
