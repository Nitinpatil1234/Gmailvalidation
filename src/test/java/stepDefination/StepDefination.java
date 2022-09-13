package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.Login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination {
	public String title;
	public WebDriver driver;
	public Login loginDriver;
	String act;

	@Given("User is able to launch chrome browser")
	public void user_is_able_to_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		loginDriver = new Login(driver);
	}

	@When("User is able to open  URL with {string}")
	public void user_is_able_to_open_url_with(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("User enters username as {string}")
	public void user_enters_username_as_and_password_as(String username) throws InterruptedException {
		loginDriver.getUsername(username);
	}

	@When("Click On Next button")
	public void click_on_next_button() throws InterruptedException {
		loginDriver.navigateNext();
	}

	@When("user entrs password As {string}")
	public void user_entrs_password_as(String Password) throws InterruptedException {
		loginDriver.getPassword(Password);
	}

	@When("Click On another Next button")
	public void click_on_another_next_button() throws InterruptedException {
		loginDriver.navigateNextButton();
	}
	
	@When("Click on Compose Button")
	public void click_on_compose_button() throws InterruptedException {
		loginDriver.getComposeMail();
	}

	@When("Add receipent As {string}")
	public void add_receipent_as(String recepient) throws InterruptedException {
		loginDriver.GetRecepient(recepient);
	}

	@When("write subject As {string}")
	public void write_subject_as(String subject) throws InterruptedException {
		loginDriver.getSubject(subject);
	}

	@When("write body As {string}")
	public void write_body_as(String body) throws InterruptedException {
		loginDriver.getBody(body);
	}

	@Then("Sent the mail")
	public void mail_should_be_sent() throws InterruptedException {
		loginDriver.navigateToSendButton();
	}

}
