package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage1 {
	
public static WebDriver driver;

	@FindBy(xpath="//input[@name='username']")
	private WebElement uerName;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='loginButton']")
	private WebElement logIn;
	
	@FindBy(xpath="//a[@id='referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension']")
	private WebElement registerPatient;
	
	@FindBy(xpath="//input[@name='givenName']")
	private WebElement givenName;
	
	@FindBy(xpath="//input[@name='familyName']")
	private WebElement familyName;
	
	@FindBy(xpath="//button[@id='next-button']")
	private WebElement nextButton;
	
	@FindBy(xpath="//option[text()='Female']")
	private WebElement gender;
	
	@FindBy(xpath="//input[@name='birthdateDay']")
	private WebElement day;
	
	@FindBy(xpath="//select[@name='birthdateMonth']")
	private WebElement month;
	
	@FindBy(xpath="//input[@name='birthdateYear']")
	private WebElement year;
	
	@FindBy(xpath="//input[@name='address1']")
	private WebElement address1;
	
	@FindBy(xpath="//input[@name='address2']")
	private WebElement address2;
	
	@FindBy(xpath="//input[@name='cityVillage']")
	private WebElement city;
	
	@FindBy(xpath="//input[@name='stateProvince']")
	private WebElement state;
	
	@FindBy(xpath="//input[@name='country']")
	private WebElement country;
	
	@FindBy(xpath="//input[@name='postalCode']")
	private WebElement postalcode;
	
	@FindBy(xpath="//input[@name='phoneNumber']")
	private WebElement phoneNumber;
	
	@FindBy(xpath="//select[@id='relationship_type']")
	private WebElement relation;
	
	@FindBy(xpath="//input[@placeholder='Person Name']")
	private WebElement personName;
	
	@FindBy(xpath="//p[text()='Suganya, Sugan']")
	private WebElement nameSuganya;
	
	@FindBy(xpath="//p[text()='Female']")
	private WebElement female;
	
	@FindBy(xpath="//p[text()='20, February, 2020']")
	private WebElement birthDate;
	
	@FindBy(xpath="//p[text()='Public office road, 1st main street, Chennai, TamilNadu, India, 600001']")
	private WebElement add;
	
	@FindBy(xpath="//p[text()='9900990099']")
	private WebElement phNo;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement confirm;

	public PomPage1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUerName() {
		return uerName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogIn() {
		return logIn;
	}

	public WebElement getRegisterPatient() {
		return registerPatient;
	}

	public WebElement getGivenName() {
		return givenName;
	}

	public WebElement getFamilyName() {
		return familyName;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getPostalcode() {
		return postalcode;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getRelation() {
		return relation;
	}

	public WebElement getPersonName() {
		return personName;
	}

	public WebElement getNameSuganya() {
		return nameSuganya;
	}

	public WebElement getFemale() {
		return female;
	}

	public WebElement getBirthDate() {
		return birthDate;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getPhNo() {
		return phNo;
	}

	public WebElement getConfirm() {
		return confirm;
	}
	
	
	
	
}
