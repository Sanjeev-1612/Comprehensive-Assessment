package stepDef;

import org.openqa.selenium.WebDriver;

import com.PageObject.Bedroom_NewArrivals;
import com.PageObject.CollectionPage;
import com.PageObject.FooterPage;
import com.PageObject.GiftCardPage;
import com.PageObject.KidsRoomPage;
import com.PageObject.LivingPage;
import com.PageObject.SearchPage;
import com.PageObject.StudyPage;
import com.PageObject.TvUnitsPage;
import com.PageObject.Verify_sofa_TextPage;
import com.Utility.BaseClass;
import com.Utility.BrowserFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps {

public static WebDriver driver;
	
@Given("^open Chrome and start browser$")
public void open_Chrome_and_start_browser() throws Throwable {
	
	BaseClass bc=new BaseClass();
	  driver= bc.setup();

}

@Then("^Click on the bedroom page$")
public void click_on_the_bedroom_page() throws Throwable {
   
	Bedroom_NewArrivals bed=new Bedroom_NewArrivals(driver);
	bed.newArrival();
}

@Then("^click on All new Arrivals$")
public void click_on_All_new_Arrivals() throws Throwable {
    
	BrowserFactory.quitBrowser(driver);
}
	
	//nextpage
	
	@Given("^launch Chrome and start browser$")
	public void launch_Chrome_and_start_browser() throws Throwable {
	    
		BaseClass bc=new BaseClass();
		  driver= bc.setup();

	}

	@Then("^Click on gift page$")
	public void click_on_gift_page() throws Throwable {
		
		GiftCardPage gp=new GiftCardPage(driver);
		gp.gift();
	}

	@Then("^Check for the START AT text$")
	public void check_for_the_START_AT_text() throws Throwable {
	   
		BrowserFactory.quitBrowser(driver);
	}
	
	//nextpage
	
	@Given("^Open Chrome and start browsers$")
	public void open_Chrome_and_start_browsers() throws Throwable {
	    
		BaseClass bc=new BaseClass();
		  driver= bc.setup();
	}

	@Then("^Click on Ul Exclusive$")
	public void click_on_Ul_Exclusive() throws Throwable {
	    
		CollectionPage cp=new CollectionPage(driver);
		cp.collection();
	}

	@Then("^Check for the UL picks text$")
	public void check_for_the_UL_picks_text() throws Throwable {
	   
		BrowserFactory.quitBrowser(driver);
	}
	
	//nextpage
	
	@Given("^Open Chrome and run browser$")
	public void open_Chrome_and_run_browser() throws Throwable {
	    
		BaseClass bc=new BaseClass();
		  driver= bc.setup();
	}

	@Then("^scroll down to the footer page$")
	public void scroll_down_to_the_footer_page() throws Throwable {
	    
		FooterPage f=new FooterPage(driver);
		f.footer();
	}

	@Then("^verify the We Accept text$")
	public void verify_the_We_Accept_text() throws Throwable {
	    
		BrowserFactory.quitBrowser(driver);
	}
	
	//nextpage
	
	@Given("^open the chrome and launch the browser$")
	public void open_the_chrome_and_launch_the_browser() throws Throwable {
	   
		BaseClass bc=new BaseClass();
		  driver= bc.setup();
	}

	@Then("^Click on the KidsRoom page$")
	public void click_on_the_KidsRoom_page() throws Throwable {
	
		KidsRoomPage kp=new KidsRoomPage(driver);
		kp.kid();
	}

	@Then("^click on Kids play table link$")
	public void click_on_Kids_play_table_link() throws Throwable {
	  
		BrowserFactory.quitBrowser(driver);
	}
	
	//nextpage
	
	@Given("^Start the browser$")
	public void start_the_browser() throws Throwable {
	    
		BaseClass bc=new BaseClass();
		  driver= bc.setup();
	}

	@Then("^Click on the living page and tables link$")
	public void click_on_the_living_page_and_tables_link() throws Throwable {
	    
		LivingPage lp=new LivingPage(driver);
		lp.room();
	}

	@Then("^quit the browser after verification$")
	public void quit_the_browser_after_verification() throws Throwable {
	    
		BrowserFactory.quitBrowser(driver);
	}

	//nextpage
	
	@Given("^launch the Chrome$")
	public void launch_the_Chrome() throws Throwable {
	    
		BaseClass bc=new BaseClass();
		  driver= bc.setup();
	}

	@Then("^Enter the input in the search box and search$")
	public void enter_the_input_in_the_search_box_and_search() throws Throwable {
		
	    SearchPage sp=new SearchPage(driver);
	    sp.search();
	}

	@Then("^Stop the browser$")
	public void stop_the_browser() throws Throwable {
	    
		BrowserFactory.quitBrowser(driver);
	}
	
	//nextpage
	
	@Given("^launch the browser$")
	public void launch_the_browser() throws Throwable {
		
		BaseClass bc=new BaseClass();
		  driver= bc.setup();
	}

	@Then("^Select the Topsale and click on sofa beds and verify text$")
	public void select_the_Topsale_and_click_on_sofa_beds_and_verify_text() throws Throwable {
	    
		Verify_sofa_TextPage vp=new Verify_sofa_TextPage(driver);
		vp.sofa();
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	   
		BrowserFactory.quitBrowser(driver);
	}

	//nextpage
	
	@Given("^launch the Chrome browser$")
	public void launch_the_Chrome_browser() throws Throwable {
	    
		BaseClass bc=new BaseClass();
		  driver= bc.setup();
	}

	@Then("^select study menu and click on lamp and make brand to orange tree and verify text$")
	public void select_study_menu_and_click_on_lamp_and_make_brand_to_orange_tree_and_verify_text() throws Throwable {
	   
		StudyPage stud=new StudyPage(driver);
		stud.study();
	}

	@Then("^quit the chrome browser$")
	public void quit_the_chrome_browser() throws Throwable {
	    
		BrowserFactory.quitBrowser(driver);
	}

	//nextpage
	
	@Given("^launch the browser and chrome$")
	public void launch_the_browser_and_chrome() throws Throwable {
	    
		BaseClass bc=new BaseClass();
		  driver= bc.setup();
	}

	@Then("^Read the input from excel and enter to search box and verify the text present or not$")
	public void read_the_input_from_excel_and_enter_to_search_box_and_verify_the_text_present_or_not() throws Throwable {
		
		TvUnitsPage tp=new TvUnitsPage(driver);
		tp.tvUnits();
	}

	@Then("^close the chrome browser$")
	public void close_the_chrome_browser() throws Throwable {
	    
		BrowserFactory.quitBrowser(driver);
	}



}
