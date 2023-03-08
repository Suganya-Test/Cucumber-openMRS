package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\HP\\Documents\\Java\\Cucumber_OpenMRS\\src\\test\\java\\com\\feature\\mrs.feature",
glue="com.stepdefinition")

public class Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		driver = BaseClass.browser("Chrome");
	}
}			