package com.pom_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_login_page {
public  WebDriver a;
	
	@FindBy(id = "username")
	private  WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
		
	@FindBy(id = "login")
	private WebElement login;

	public Adactin_login_page(WebDriver a2) {
		this.a = a2;
		PageFactory.initElements(a, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	}
