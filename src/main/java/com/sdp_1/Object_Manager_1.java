package com.sdp_1;

import org.openqa.selenium.WebDriver;

import com.pom_1.Adactin_login_page;
import com.pom_1.Personal_Information;
import com.pom_1.Search_Hotel;
import com.pom_1.Select_Hotel;

public class Object_Manager_1 {
	public WebDriver a;
	
	private Adactin_login_page lp;
	
	private Search_Hotel br;
	
	private Select_Hotel sr;
	
	private Personal_Information pi;

	public Object_Manager_1(WebDriver a2) {
		this.a=a2;
		
	}

	public Adactin_login_page getLp() {
	if (lp==null) {
		lp=new Adactin_login_page(a);
	}
		return lp;
	}

	public Search_Hotel getBr() {
		if (br==null) {
			br=new Search_Hotel(a);
		}
		return br;
	}

	public Select_Hotel getSr() {
		if (sr==null) {
			sr=new Select_Hotel(a);
		}
		return sr;
	}

	public Personal_Information getPi() {
	if (pi==null) {
		pi=new Personal_Information(a);	
	}
		return pi;
	}
	
	
		
	
	

}
