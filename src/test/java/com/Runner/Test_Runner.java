package com.Runner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.BaseClass_1.Base_Of_Runner_1;
import com.sdp_1.Object_Manager_1;

import Properties_File.File_Reader_Manager;

public class Test_Runner extends Base_Of_Runner_1 {
	public static WebDriver a = getBrowser("chrome");
	public static Object_Manager_1 om = new Object_Manager_1(a);
	static Logger log = Logger.getLogger(Test_Runner.class);

	public static void main(String[] args) throws Throwable {
		PropertyConfigurator.configure("log4j.properties");
		String url = File_Reader_Manager.getinstanceFRM().getcr().getUrl();
		url(url);
		sleep(3000);
		log.info("Browser is Launched with given Url");
		String username =File_Reader_Manager.getinstanceFRM().getcr().getusername();
		inputValue(om.getLp().getUsername(), username);
		String password = File_Reader_Manager.getinstanceFRM().getcr().getpassword();
		inputValue(om.getLp().getPassword(), password);

		clickOnElement(om.getLp().getLogin());
		timeouts();

		log.info("Login button clicked successfully");

		dropdown("value", om.getBr().getLoction(), "Paris");

		dropdown("value", om.getBr().getHotels(), "Hotel Sunshine");

		dropdown("value", om.getBr().getRoom_type(), "Deluxe");

		dropdown("value", om.getBr().getNos_room(), "1");
		timeouts();

		clear(om.getBr().getCheck_in());
		String check_in = Data("C:\\Users\\GGG\\Documents\\Adactin Test Case.xlsx", 8, 5);
		inputValue(om.getBr().getCheck_in(), check_in);
		timeouts();

		clear(om.getBr().getCheck_out());
		String check_out = Data("C:\\Users\\GGG\\Documents\\Adactin Test Case.xlsx", 9, 5);
		inputValue(om.getBr().getCheck_out(), check_out);

		dropdown("Value", om.getBr().getAdult_in_room(), "1");
		clickOnElement(om.getBr().getSearch_button());
		timeouts();
		log.info("Search Hotel is Done");

		clickOnElement(om.getSr().getRadio_button());

		clickOnElement(om.getSr().getContinue_button());
		log.info("Hotel is Seleted");
		String firstname = Data("C:\\Users\\GGG\\Documents\\Adactin Test Case.xlsx", 14, 5);
		inputValue(om.getPi().getFirstname(), firstname);
		String lastname = Data("C:\\Users\\GGG\\Documents\\Adactin Test Case.xlsx", 15, 5);
		inputValue(om.getPi().getLastname(), lastname);
		String address = Data("C:\\Users\\GGG\\Documents\\Adactin Test Case.xlsx", 16, 5);
		inputValue(om.getPi().getAddress(), address);
		String CardNo = File_Reader_Manager.getinstanceFRM().getcr().getCardNo();
		inputValue(om.getPi().getCard_no(), CardNo);

		dropdown("index", om.getPi().getCard_type(), "3");

		dropdown("Value", om.getPi().getExp_month(), "6");

		dropdown("Value", om.getPi().getExp_year(), "2022");
		String CVV_No = Data("C:\\Users\\GGG\\Documents\\Adactin Test Case.xlsx", 19, 5);
		inputValue(om.getPi().getCvv_no(), CVV_No);
		timeouts();
		log.info("personal Information Filled Sucessfully");
		clickOnElement(om.getPi().getBook_now());
		sleep(3000);
		log.info("Booking Hotel is Completed");
		Scroll(om.getPi().getBook_now());
		screenshot();

		close(a);

	}

}