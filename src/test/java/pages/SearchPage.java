package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {

@FindBy(xpath="//input[@id='small-searchterms']")
static WebElement Tricentis_searchbox;

@FindBy(xpath="//input[@value='Search']")
static WebElement Tricentis_searchbutton;


	
	public void entersearchitem(String s)
	{
		Tricentis_searchbox.sendKeys(s);
	}
	public void clicksearchitem()
	{
		 Tricentis_searchbutton.click();
	}
	


}
 