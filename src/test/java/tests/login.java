package tests;


//import java.time.Duration;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;



public class login {
	
//	@Before
//	public void setup() {
//		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.instagram.com/");
//	}
	
//	@After
//	public void tearDoown() {
//		WebDriver driver = new ChromeDriver();
//		driver.quit();
//	
//	}
	
	@Given("User has navigates to Login Page")
	 public void User_has_navigates_to_Login_Page() {
		System.out.println("Testing");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
	}
//	@When("User enters valid email address {string} into email field")
//	public void user_enters_valid_email_address_into_email_field(String invalidEmailText) {
//	   
//	}
//	@And("User has entered valid password {string} into password field")
//	public void user_has_entered_valid_password_into_password_field(String invalidPasswordText) {
//	   
//	}
//
//	@And("User Clicks on Login button")
//	public void user_clicks_on_login_button() {
//	    
//	}
//
//	@Then("User should get successfully logged in")
//	public void user_should_get_successfully_logged_in() {
//	    
//	}
//
//	@Given("User has navigated to Login Page")
//	public void user_has_navigated_to_login_page() {
//	    
//	}
//
//	@When("User enters invalid email address {string} intoo email field")
//	public void user_enters_invalid_email_address_intoo_email_field(String invalidEmailText) {
//	  
//	}
//
//	@And("User enters invalid password {string} into password field")
//	public void user_enters_invalid_password_into_password_field(String invalidPasswordText) {
//	    
//	}
//
//	@And("Clicks on Login button")
//	public void clicks_on_login_button() {
//	   
//	}
//
//	@Then("User should get a proper warning message about credentials mismatch")
//	public void user_should_get_a_proper_warning_message_about_credentials_mismatch() {
//	  
//	}
//
//	@And("User Enters invalid password {string} intoo password field")
//	public void user_enters_invalid_password_intoo_password_field(String invalidPasswordText) {
//	  
//	}
//
//	@Then("User should get proper warning message aboout credentials mismatch")
//	public void user_should_get_proper_warning_message_aboout_credentials_mismatch() {
//	   
//	}
//
//	@When("User enters valid email address {string} intoo email field")
//	public void user_enters_valid_email_address_intoo_email_field(String invalidEmailText) {
//	  
//	}
//
//	@And("User Enters valid password {string} into password field")
//	public void user_enters_valid_password_into_password_field(String invalidPasswordText) {
//	    
//	}
//
//	@And("User don't enter email address into email field")
//	public void user_don_t_enter_email_address_into_email_field() {
//	  
//	}
//
//	@And("User don't enter password into password field")
//	public void user_don_t_enter_password_into_password_field() {
//	   
//	}
}