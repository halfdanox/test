package com.HepsiBurada.bdd.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
//import org.testng.Assert;

import pages.CheckoutPage;
import pages.HomePage;
import pages.Menu;
import pages.ProductPage;
import pages.Registration;
import pages.SearchResultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs {

	public static WebDriver driver;
	public static WebDriverWait  wait;


	public static HomePage homePage;
	public static ProductPage productPage;
	public static SearchResultPage searchResultPage;
	public static Menu menu;
	public static CheckoutPage  checkoutpage;
	public static Registration  registration;



	//String firstProductName;
	//String message = "Doğru";
	
	
	

	@Before
	public void beforeScenario(){
		//driver = new FirefoxDriver();
		
		 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		homePage = new HomePage(driver);
		productPage = new  ProductPage(driver); 
	    searchResultPage = new SearchResultPage(driver);
		menu  = new Menu(driver);
		registration  = new Registration(driver);

		checkoutpage = new 	CheckoutPage(driver);


		

	    
	}
	
	@After
	public void afterScenario(){
		driver.close();
	}
	
	
	
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		driver.manage().window().maximize();
		driver.get("http://www.hepsiburada.com/");
		
		// Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^User clicks on Giris Yap$")
	public void user_clicks_on_Giris_Yap() throws Throwable {
		System.out.println("buraya geldim");
		menu.Log_in();
		System.out.println("Log in oldum");
		registration.Signin();
		//throw new PendingException();
	}

	@Then("^There is a match on the page \"([^\"]*)\"$")
	public void there_is_a_match_on_the_page(String arg1) throws Throwable {
		Assert.assertEquals(homePage.getHesabim().toLowerCase(), arg1);
		//throw new PendingException();
	}

	@When("^User searchs  on \"([^\"]*)\"$")
	public void user_searchs_on(String arg1) throws Throwable {
		menu.searchText(arg1);
	   // throw new PendingException();
	}
	
	

	@Then("^There is a match on the search \"([^\"]*)\"$")
	public void there_is_a_match_on_the_search(String arg1) throws Throwable {
		Assert.assertEquals(searchResultPage.getSearchResult().toLowerCase(), arg1);
		//throw new PendingException();
	}

	
	@Given("^User is on Product  Page$")
	public void user_is_on_Product_Page() throws Throwable {
		 driver.get("http://www.hepsiburada.com/asus-zenfone-go-p-TELCEPASZENGO-K");
	    // throw new PendingException();
	}

	@When("^User increase product count  size  to two$")
	public void user_increase_product_count_size_to_two() throws Throwable {
		productPage.Increase();
	   // throw new PendingException();
	}


	@When("^User clicks on  sepete ekle$")
	public void user_clicks_on_addToCart() throws Throwable {
		productPage.addToCart();
	}
	   // throw new PendingException();

	
	@Then("^There should be \"([^\"]*)\" pieces of selected product$")
	public void there_should_be_pieces_of_selected_product(String arg1) throws Throwable {
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertEquals(checkoutpage.getProductQuantity(),arg1);

	}
	
	
}
