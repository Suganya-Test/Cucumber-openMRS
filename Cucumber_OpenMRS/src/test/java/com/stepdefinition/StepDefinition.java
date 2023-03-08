package com.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.baseclass.BaseClass;
import com.pom.Pom_Object_Manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition<JavaScriptExecuter> extends BaseClass {

	Pom_Object_Manager p = new Pom_Object_Manager(driver);

	@Given("User launch the Url")
	public void user_launch_the_url() {

		getUrl("https://qa-refapp.openmrs.org/openmrs/login.htm");
	}

	@When("User click the username and send {string}")
	public void user_click_the_username_and_send(String string) {
		p.getPomPage1().getUerName().sendKeys(string);
	}

	@When("User click the password and send {string}")
	public void user_click_the_password_and_send(String string) {
		p.getPomPage1().getPassword().sendKeys(string);
	}

	@When("User select Laboratory")
	public void user_select_laboratory() throws AWTException, InterruptedException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
		p.getPomPage1().getLogIn().click();
	}

	@When("User check the dashboard")
	public void user_check_the_dashboard() {
		System.out.println("Logged in as Super User (admin) at Laboratory.");
	}

	@When("User click Register a Patient")
	public void user_click_register_a_patient() {
		p.getPomPage1().getRegisterPatient().click();
	}

	@When("User click the Given name and send {string}")
	public void user_click_the_given_name_and_send(String string) {
		p.getPomPage1().getGivenName().sendKeys(string);
	}

	@When("User click the family name and send {string}")
	public void user_click_the_family_name_and_send(String string) throws InterruptedException {
		p.getPomPage1().getFamilyName().sendKeys(string);
		p.getPomPage1().getNextButton().click();
		Thread.sleep(3000);
	}

	@When("User click the gender and select {string}")
	public void user_click_the_gender_and_select(String string) {
		p.getPomPage1().getGender().click();
		p.getPomPage1().getNextButton().click();
	}

	@When("User click the day and send {string}")
	public void user_click_the_day_and_send(String string) {
		p.getPomPage1().getDay().sendKeys(string);
	}

	@When("User click the month and send {string}")
	public void user_click_the_month_and_send(String string) {
		selection(p.getPomPage1().getMonth(), "byValue", string);
	}

	@When("User click the year and send {string}")
	public void user_click_the_year_and_send(String string) {
		p.getPomPage1().getYear().sendKeys(string);
		p.getPomPage1().getNextButton().click();
	}

	@When("User click the address1 and send {string}")
	public void user_click_the_address1_and_send(String string) {
		p.getPomPage1().getAddress1().sendKeys(string);
	}

	@When("user click the address and send {string}")
	public void user_click_the_address_and_send(String string) {
		p.getPomPage1().getAddress2().sendKeys(string);
	}

	@When("User click the city and send {string}")
	public void user_click_the_city_and_send(String string) {
		p.getPomPage1().getCity().sendKeys(string);
	}

	@When("User click the state and send {string}")
	public void user_click_the_state_and_send(String string) {
		p.getPomPage1().getState().sendKeys(string);
	}

	@When("User click the country and send {string}")
	public void user_click_the_country_and_send(String string) {
		p.getPomPage1().getCountry().sendKeys(string);
	}

	@When("User click the postalcode and send {string}")
	public void user_click_the_postalcode_and_send(String string) {
		p.getPomPage1().getPostalcode().sendKeys(string);
		p.getPomPage1().getNextButton().click();
	}

	@When("User click the phone number and send {string}")
	public void user_click_the_phone_number_and_send(String string) {
		p.getPomPage1().getPhoneNumber().sendKeys(string);
		p.getPomPage1().getNextButton().click();
	}

	@When("User click the relationship and select {string}")
	public void user_click_the_relationship_and_select(String string) {
		selection(p.getPomPage1().getRelation(), "byValue", string);
	}

	@When("User click the person name and send {string}")
	public void user_click_the_person_name_and_send(String string) {
		p.getPomPage1().getPersonName().sendKeys(string);
		p.getPomPage1().getNextButton().click();
	}

	@When("user verify the patient details")
	public void user_verify_the_patient_details() throws InterruptedException {
		String nameA = p.getPomPage1().getNameSuganya().getText();
		System.out.println(nameA);
		String nameB = "Name: Suganya, Sugan";
		Actions ac = new Actions(driver);
		ac.doubleClick(p.getPomPage1().getNameSuganya()).perform();
		Assert.assertEquals(nameB, nameA);
		Thread.sleep(1000);
		String genderA = p.getPomPage1().getFemale().getText();
		System.out.println(genderA);
		String genderB = "Gender: Female";
		ac.doubleClick(p.getPomPage1().getFemale()).perform();
		Assert.assertEquals(genderB, genderA);
		Thread.sleep(1000);
		String birthA = p.getPomPage1().getBirthDate().getText();
		System.out.println(birthA);
		String birthB = "Birthdate: 20, February, 2020";
		ac.doubleClick(p.getPomPage1().getBirthDate()).perform();
		Assert.assertEquals(birthB, birthA);
		Thread.sleep(1000);
		String addressA = p.getPomPage1().getAdd().getText();
		System.out.println(addressA);
		String addressB = "Address: Public office road, 1st main street, Chennai, TamilNadu, India, 600001";
		ac.doubleClick(p.getPomPage1().getAdd()).perform();
		Assert.assertEquals(addressB, addressA);
		Thread.sleep(1000);
		String phoneA = p.getPomPage1().getPhNo().getText();
		System.out.println(phoneA);
		String phoneB = "Phone Number: 9900990099";
		ac.doubleClick(p.getPomPage1().getPhNo()).perform();
		Assert.assertEquals(phoneA, phoneB);
		Thread.sleep(1000);
	}

	@When("User click the confirm button")
	public void user_click_the_confirm_button() {
		p.getPomPage1().getConfirm().click();

	}

	@When("User click the start visit")
	public void user_click_the_start_visit() throws InterruptedException {
		Thread.sleep(3000);
		p.getPomPage2().getStartVisit().click();
	}

	@When("User click confirm")
	public void user_click_confirm() {
		p.getPomPage2().getConfirm().click();
	}

	@When("User click attachment")
	public void user_click_attachment() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", p.getPomPage2().getAttachment());

	}

	@When("User click the file and upload")
	public void user_click_the_file_and_upload() throws AWTException, InterruptedException {
		Thread.sleep(3000);
		p.getPomPage2().getFile().click();

		// copying File path to Clipboard
		StringSelection str = new StringSelection("C:\\Users\\HP\\Downloads\\QR.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		Robot r = new Robot();
		// press Control+V for pasting
		r.keyPress(KeyEvent.VK_CONTROL);
	     r.keyPress(KeyEvent.VK_V);

		// release Control+V for pasting
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		// for pressing and releasing Enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("User click the caption and send {string}")
	public void user_click_the_caption_and_send(String string) throws InterruptedException {
		Thread.sleep(3000);
		p.getPomPage2().getCaption().sendKeys(string);
	}

	@When("User click the upload")
	public void user_click_the_upload() throws InterruptedException {
		Thread.sleep(3000);
		p.getPomPage2().getUpload().click();
	}

	@When("User verify the toaster message")
	public void user_verify_the_toaster_message() {
		String success = p.getPomPage2().getSuccess().getText();
		System.out.println(success);
	}

	@When("User click the patient details")
	public void user_click_the_patient_details() {
		p.getPomPage2().getPatientDetails().click();
	}

	@When("User verify the recen visits")
	public void user_verify_the_recen_visits() {
		String recent = p.getPomPage2().getRecentVisits().getText();
		System.out.println(recent);
	}

	@When("User click the end visit")
	public void user_click_the_end_visit() {
		p.getPomPage2().getEndVisit().click();
	}

	@When("User click the yes button")
	public void user_click_the_yes_button() {
		p.getPomPage2().getEndVisit().click();
	}

	@When("User click the delete patient")
	public void user_click_the_delete_patient() {
		p.getPomPage2().getDeletePatient().click();
	}

	@When("User click the reason and send {string}")
	public void user_click_the_reason_and_send(String string) {
		p.getPomPage2().getReason().sendKeys(string);
		p.getPomPage2().getConfirmDelete().click();
	}

	@When("User verify the toaster deleted message")
	public void user_verify_the_toaster_deleted_message() {
		String message = p.getPomPage2().getDeleteMessage().getText();
		System.out.println(message);
	}

	@When("User redirect to the Find Patient Record menu and verify the deleted patient should not be listed in the table")
	public void user_redirect_to_the_find_patient_record_menu_and_verify_the_deleted_patient_should_not_be_listed_in_the_table() {
		p.getPomPage2().getSearchPatient().sendKeys("100HM1");

	}

}
