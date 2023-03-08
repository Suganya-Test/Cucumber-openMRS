package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage2 {
public static WebDriver driver;

	@FindBy(xpath="(//div[@class='col-11 col-lg-10'])[1]")
	private WebElement StartVisit;
	
	@FindBy(xpath="(//button[@class='confirm right'])[6]")
	private WebElement confirm;
	
	@FindBy(xpath="//a[@id='attachments.attachments.visitActions.default']")
	private WebElement attachment;
	//div[@class='visit-actions active-visit']/child::a[5])")
	
	@FindBy(xpath="//div[text()='Click or drop a file here.']")
	private WebElement file;
	
	@FindBy(xpath="//textarea[@placeholder='Enter a caption']")
	private WebElement caption;
	
	@FindBy(xpath="//button[text()='Upload file']")
	private WebElement upload;
	
	@FindBy(xpath="//p[text()='The attachment was uploaded successfully.']")
	private WebElement success;
	
	@FindBy(xpath="//h1[@class='mt-0 mb-2 name']")
	private WebElement patientDetails;
	
	@FindBy(xpath="//a[@class='ng-binding']")
	private WebElement recentVisits;
	
	@FindBy(xpath="(//div[@class='col-11 col-lg-10'])[6]")
	private WebElement endVisit;
	
	@FindBy(xpath="(//button[text()='Yes'])[2]")
	private WebElement yesEnd;
	
	@FindBy(xpath="(//div[@class='col-11 col-lg-10'])[8]")
	private WebElement deletePatient;
	
	@FindBy(xpath="(//input[@type='text'])[6]")
	private WebElement reason;
	
	@FindBy(xpath="(//button[text()='Confirm'])[4]")
	private WebElement confirmDelete;
	
	@FindBy(xpath="//p[text()='The attachment was uploaded successfully.']")
	private WebElement deleteMessage;
	
	@FindBy(xpath="//input[@id='patient-search']")
	private WebElement searchPatient;

	public PomPage2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getStartVisit() {
		return StartVisit;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getAttachment() {
		return attachment;
	}

	public WebElement getFile() {
		return file;
	}

	public WebElement getCaption() {
		return caption;
	}

	public WebElement getUpload() {
		return upload;
	}

	public WebElement getSuccess() {
		return success;
	}

	public WebElement getPatientDetails() {
		return patientDetails;
	}

	public WebElement getRecentVisits() {
		return recentVisits;
	}

	public WebElement getEndVisit() {
		return endVisit;
	}

	public WebElement getYesEnd() {
		return yesEnd;
	}

	public WebElement getDeletePatient() {
		return deletePatient;
	}

	public WebElement getReason() {
		return reason;
	}

	public WebElement getConfirmDelete() {
		return confirmDelete;
	}

	public WebElement getDeleteMessage() {
		return deleteMessage;
	}

	public WebElement getSearchPatient() {
		return searchPatient;
	}
	
}
