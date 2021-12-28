package com.pom_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Personal_Information {
	public WebDriver a;
	
@FindBy(id = "first_name")
private WebElement firstname;

@FindBy(id ="last_name" )
private WebElement lastname;

@FindBy(id = "address")
private WebElement address;

@FindBy(id = "cc_num")
private WebElement card_no;

@FindBy(id = "cc_type")
private WebElement card_type;

@FindBy(id = "cc_exp_month")
private WebElement exp_month;

@FindBy(id = "cc_exp_year")
private WebElement  exp_year;

@FindBy(id = "cc_cvv")
private WebElement cvv_no;

@FindBy(id = "book_now")
private WebElement book_now;

@FindBy(id = "logout")
private WebElement logout;

public WebElement getLogout() {
	return logout;
}

public Personal_Information(WebDriver a2) {
this.a=a2;
PageFactory.initElements(a, this);
}

public WebElement getFirstname() {
	return firstname;
}

public WebElement getLastname() {
	return lastname;
}

public WebElement getAddress() {
	return address;
}

public WebElement getCard_no() {
	return card_no;
}

public WebElement getCard_type() {
	return card_type;
}

public WebElement getExp_month() {
	return exp_month;
}

public WebElement getExp_year() {
	return exp_year;
}

public WebElement getCvv_no() {
	return cvv_no;
}

public WebElement getBook_now() {
	return book_now;
}
}
