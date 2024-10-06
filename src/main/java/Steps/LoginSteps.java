package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver;
	@Given("User at the login page")
	public void user_at_the_login_page() {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		
	}

	@When("User enter the username")
	public void user_enter_the_username() {
	driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
	
	}

	@When("User enter the password")
	public void user_enter_the_password() {
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("User landing on home page")
	public void user_landing_on_home_page() throws InterruptedException {
		Thread.sleep(3000);
		String actual = driver.getCurrentUrl();
		String expected = "https://magnus.jalatechnologies.com/Home/Index";
		Assert.assertEquals(actual, expected);
		Reporter.log("matched", true);
		
//		if(expected.equals(actual)) {
//			System.out.println("matched...!");
//		}else {
//			System.out.println("Not matched...");
//		}
	}

	

	@When("User enter invalid the password")
	public void user_enter_invalid_the_password() {
		driver.findElement(By.id("Password")).sendKeys("jobprogram123");
	}

	@When("User enter Invalid the username")
	public void user_enter_invalid_the_username() {
		driver.findElement(By.id("UserName")).sendKeys("training@123jalaacademy.com");;
	}

	
}
