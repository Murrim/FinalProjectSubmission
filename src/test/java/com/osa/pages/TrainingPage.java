package com.osa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.osa.utility.Utils;

public class TrainingPage {
	private static Logger log=Utils.getLog(TrainingPage.class);
WebDriver dr;
	
	public TrainingPage(WebDriver dr) {
		this.dr = dr;
		
		PageFactory.initElements(dr, this);
		
	}
	
@FindBy(xpath="//*[@id=\"ftco-nav\"]/ul/li[3]/a")
WebElement trainButton;
@FindBy(xpath="//input[@placeholder='First Name']")
WebElement inputFirstName;
@FindBy(xpath="//input[@placeholder='Last Name']")
WebElement inputLastName;
@FindBy(xpath="//select[@name]")
WebElement selectGuide;
@FindBy(xpath="//input[@placeholder='Phone']")
WebElement inputPhone;
@FindBy(xpath="//textarea[@placeholder='Message']")
WebElement inputMessage;
@FindBy(xpath="//input[@placeholder='Enter email address']")
WebElement inputEmail;



public void clickTrainingPage() {
	log.info("+++++++User is clicking the training button+++++++");
	trainButton.click();
}

public void typeFirstName() {
	log.info("+++++++User is typing the first name+++++++");
	inputFirstName.sendKeys("Hjkk");
	
}

public void typeLastName() {
	log.info("+++++++User is typing the last name+++++++");
    inputLastName.sendKeys("kuij");
	
}

public void clickSelectGuide() {
	log.info("+++++++User is clicking the select guide option+++++++");
	 selectGuide.click();
	
}

public void typePhoneNumber() {
	log.info("+++++++User is typing the phone number+++++++");
	 inputPhone.sendKeys("1723");
	
}
public void typeMessage() {
	log.info("+++++++User is typing the message+++++++");
	 inputMessage.sendKeys("ythhr");
	
}

public void typeEmailAddr() {
	log.info("+++++++User is typing the email address+++++++");
	 inputEmail.sendKeys("ju2@gmail.com");
	
}


}
