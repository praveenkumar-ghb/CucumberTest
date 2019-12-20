package sepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;
	@Given("User launch URL")
	public void user_launch_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\a08019dirp_c2c.04.02\\Desktop\\chromedriver_win32\\New folder\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
	}
	@When("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String user, String pass) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
	}

	@When("click on login button")
	public void click_on_login_button() throws Throwable {
		driver.findElement(By.name("login")).click();
	}

	@Then("verify Title")
	public void verify_Title() throws Throwable {
		String title = driver.getTitle();
		if (title.contains("Flight")) {
			System.out.println("Valid Login");
		} else {
			System.out.println("InValid Login");
		}
		driver.close();
		}
}
