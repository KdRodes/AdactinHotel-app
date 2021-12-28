package com.pom_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
public WebDriver a;
	public Select_Hotel(WebDriver a2) {
		this.a=a2;
		PageFactory.initElements(a, this);
	}

	public WebElement getRadio_button() {
		return radio_button;
	}

	public WebElement getContinue_button() {
		return continue_button;
	}
	
	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement radio_button;
	
	@FindBy(id="continue")
	private WebElement continue_button;
	
	
	
	
	
}
