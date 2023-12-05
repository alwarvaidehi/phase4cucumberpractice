package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.Loginpage;

public class LoginStepDefination {
	 WebDriver driver;
	 Loginpage l;
	
	@Given("user enter the  Tricentis home page")
	public void user_enter_the_tricentis_home_page() throws InterruptedException {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		l=PageFactory.initElements(driver, Loginpage.class);
		driver.get("http://demowebshop.tricentis.com");
	    String title=driver.getTitle();	
	    System.out.println(title); 
	    Thread.sleep(1500);  
	}

	@Given("Then click on login link")
	public void then_click_on_login_link() {
		
	  l.clickloglink();
		//driver.findElement(By.linkText("Log in")).click();
	}

	@When("then user enter the email and password")
	public void then_user_enter_the_email_and_password() {
		l.enterloginDetails("vaidehi.a2000@gmail.com","Harrystyles_01&" );
	   // driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vaidehi.a2000@gmail.com");
	    //driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Harrystyles_01&");
	  
	   
	
	}
	@When("user click on login button")
	public void user_click_on_login_button() {
		 // driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		 System.out.println("click on logoutbutton");

}}
