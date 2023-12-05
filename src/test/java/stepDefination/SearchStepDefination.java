package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class SearchStepDefination {
      SearchPage s;
      WebDriver driver;

		@Given("user in Homepage")
		public void user_in_homepage() throws InterruptedException {
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			s=PageFactory.initElements(driver, SearchPage.class);
			driver.get("http://demowebshop.tricentis.com");
		    String title=driver.getTitle();	
		    System.out.println(title);
		    Thread.sleep(1500);  
		}

		@Given("User search book in search box")
		public void user_search_book_in_search_box() {
		   s.entersearchitem("books");
		}

		@When("User click on search button")
		public void user_click_on_search_button() {
		   s.clicksearchitem();
		}

		 
	}


