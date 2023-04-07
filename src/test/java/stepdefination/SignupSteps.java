package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SignupSteps {

	WebDriver driver;

	@Given("I am opening facebook.com")
	public void i_am_opening_facebook_com() {
		System.setProperty("webdriver.chrome.driver", "/Users/bhumidobariya/Downloads/chromedriver");
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@Then("I click on the creaate account link")
	public void i_click_on_the_creaate_account_link() throws InterruptedException {

		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);

	}

	@Then("I enter lastname mobile number password")
	public void i_enter_lastname_mobile_number_password() throws InterruptedException {
		driver.findElement(By.name("lastname")).sendKeys("dobariya");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("6263782030");
		Thread.sleep(2000);
		driver.findElement(By.id("password_step_input")).sendKeys("bhumi20$");
	}

	@Then("I enter my birth date")
	public void i_enter_my_birth_date() throws InterruptedException {
		
		WebElement monthlistElement = driver.findElement(By.id("month"));
		Select s = new Select(monthlistElement);
		s.selectByIndex(6);

		Thread.sleep(2000);

		WebElement daylistElement = driver.findElement(By.id("day"));
		Select d = new Select(daylistElement);
		d.selectByValue("20");

		Thread.sleep(2000);

		WebElement yearElement = driver.findElement(By.id("year"));
		Select y = new Select(yearElement);
		y.selectByVisibleText("2001");
	}

	@Then("I click on signup button")
	public void i_click_on_signup_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
	}

	@Then("I verify the error message {string}")
	public void i_verify_the_error_message(String string) {
		String actualString = "What’s your name?";
		String expectedString = driver.findElement(By.xpath("//div[@class='_5633 _5634 _53ij']")).getText();
		Assert.assertEquals(expectedString, actualString);
		
		driver.close();
	}

}
