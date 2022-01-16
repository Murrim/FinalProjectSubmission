package com.osa.steps;

import org.openqa.selenium.WebDriver;

import com.osa.base.Browser;
import com.osa.pages.HomePage;
import com.osa.pages.ServicesPage;
import com.osa.pages.TrainingPage;
import com.osa.utility.Utils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionTwo {
	
	
	WebDriver dr;
	HomePage hp;
	TrainingPage tp;
	ServicesPage sp;
	
	
	@Given("I will open the browser")
	public void i_will_open_the_browser() {
		
		dr = Browser.openBrowser("chrome");
		dr.get("https://www.osaconsultingtech.com");
	
	}

	@And("I will click on osa homePage")
	public void i_will_click_on_osa_homePage() {
	   
		hp = new HomePage(dr);
		hp.clickHomePage();
		
	}

	@And("I will move to training page")
	public void i_will_move_to_training_page() {
	    tp = new TrainingPage(dr);
	    tp.clickTrainingPage();
	}
String actualTraining;
String expectedTraining = "OSA Consulting Tech - OSA has big team for supporting their students, clients";
	@And("I will varify the training page title")
	public void i_will_varify_the_training_page_title() {
	    actualTraining = dr.getTitle();
	    Utils.verifyTitle(actualTraining, expectedTraining);
	}

	@And("I will test elements under training page")
	public void i_will_test_elements_under_training_page() {
	    tp.typeFirstName();
	    tp.typeLastName();
	    tp.clickSelectGuide();
	    tp.typePhoneNumber();
	    tp.typeMessage();
	    tp.typeEmailAddr();
	    
	   
	}

	@And("I come back to homePage")
	public void i_come_back_to_homePage() {
	   hp.clickHomePage();
	}

	@When("I click on servives page")
	public void i_click_on_servives_page() {
		
		sp = new ServicesPage(dr);
	   sp.clickServicesPage();
	}
	
	@And("I test webelements under services page")
	public void i_test_webelements_under_services_page() {
	    
		sp.clickprofessionalTraining();
		sp.clickOutsourcingOption();
		sp.clickOsaCareer();
		sp.inputEmailAdd();
		
	}
	String actualServices;
	String expectedServices = "OSA Consulting Tech - The service for you.";
	@Then("I varifry the serices page title")
	public void i_varifry_the_serices_page_title() {
		actualServices = dr.getTitle();
		Utils.verifyTitle(actualServices, expectedServices);
	}

	@And("I will close the browser")
	public void i_will_close_the_browser() {
	    dr.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
