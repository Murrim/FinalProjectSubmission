package com.osa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.osa.utility.Utils;

public class ServicesPage {
private static Logger log=Utils.getLog(ServicesPage.class);
	
WebDriver dr;
	
	public ServicesPage(WebDriver dr) {
		this.dr = dr;
		
		PageFactory.initElements(dr, this);
		
	}
	
@FindBy(xpath="//*[@id=\"ftco-nav\"]/ul/li[4]/a")
WebElement serviceButton;

@FindBy(xpath="//a[@href='#services-2']")
WebElement trainingHelp;

@FindBy(xpath="//a[@href='#services-3']")
WebElement outsourcing;

@FindBy(xpath="//a[@href='#services-4']")
WebElement career;

@FindBy(xpath="//input[@placeholder='Enter email address']")
WebElement enterEmail;


public void clickServicesPage() {
	log.info("+++++++User is clicking the services button+++++++");
       serviceButton.click();
}

public void clickprofessionalTraining() {
	log.info("+++++++User is clicking the professional training  option+++++++");
    trainingHelp.click();
}

public void clickOutsourcingOption() {
	log.info("+++++++User is clicking the outsourcing option+++++++");
    outsourcing.click();
}

public void clickOsaCareer() {
	log.info("+++++++User is clicking the osa career option+++++++");
    career.click();
}

public void inputEmailAdd() {
	log.info("+++++++User is typing the Email Address+++++++");
    enterEmail.sendKeys("iop8@gmail.com");
}





}
