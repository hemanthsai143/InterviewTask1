package stepdefinitions;

import java.io.IOException;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


import com.pages.GooglePage;
import com.utils.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Stepdefinitions extends Base{
	public static Logger log=LogManager.getLogger(Stepdefinitions.class.getName());
	public static WebDriver driver;
	public static  Properties p;
	
	GooglePage googlePage;
	
	@Before
	public void initServices() throws IOException
	{
		driver=initlializeDriver();
		log.info("***Chrome driver initiliazed***");
	      p= loadProperties();
	      googlePage=new GooglePage(driver);
	}
	
	 
	@Given("user launches the browser with base url")
	  public void launchBrowser() {
		  driver.get(p.getProperty("url"));
		  log.info("**Launches the base url**");
	      driver.manage().window().maximize();
	  }

	  @When("user search with {string}")
	  public void googleSearch(String keyword) {
		  googlePage.enterText().sendKeys(keyword+Keys.ENTER);
		  log.info("Entered" + " "+ keyword +" "+"in google search box");
	  }

	  @Then("verify {string} displayed as the first search result")
	  public void verifySearchResult(String information) {
		  String actualResult=googlePage.getSearchResults().getText();
		    Assert.assertTrue("Actual result is not equal to expected result",actualResult.equalsIgnoreCase(information));	
		    log.info("Verified whether" + " " +information + " "+"is displaying as first search result");
	  }

	     
	 @After
	    public void closeBrowser()
	    {
	    	driver.close();
	    	log.info("Browser closed");
	    }
	 
	


}
