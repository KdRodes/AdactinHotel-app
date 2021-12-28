package com.pom_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public Search_Hotel(WebDriver a2) {
	this.a=a2;
	PageFactory.initElements(a, this);
	}

	public WebElement getLoction() {
		return loction;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getNos_room() {
		return nos_room;
	}

	public WebElement getCheck_in() {
		return check_in;
	}

	public WebElement getCheck_out() {
		return check_out;
	}

	public WebElement getAdult_in_room() {
		return adult_in_room;
	}

	public WebElement getSearch_button() {
		return search_button;
	}

	public WebDriver a;
	
	@FindBy(id = "location")
	private WebElement loction;

	@FindBy(id = "hotels")
	private WebElement hotels;
	
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement room_type;
	
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement nos_room;
	
	@FindBy(id = "datepick_in")
	private WebElement check_in;
	
	@FindBy(id = "datepick_out")
	private WebElement check_out;
	
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adult_in_room;
	
	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement search_button;

	
	
	
	
	

}
