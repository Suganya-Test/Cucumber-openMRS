package com.pom;

import org.openqa.selenium.WebDriver;

public class Pom_Object_Manager {

	public static WebDriver driver;
	
	private PomPage1 p1;
	
	private PomPage2 p2;
	
	public Pom_Object_Manager(WebDriver driver) {
		this.driver=driver;
	}

	public PomPage1 getPomPage1() {
		p1 = new PomPage1(driver);
		
		return p1;
	}
	
	public PomPage2 getPomPage2() {
		p2 = new PomPage2(driver);
		
		return p2;
	}
}
