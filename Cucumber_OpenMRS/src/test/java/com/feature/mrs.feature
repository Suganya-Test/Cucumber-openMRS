Feature: Online appointment register in laboratory

Scenario: Login page
Given User launch the Url
When User click the username and send "Admin"
And User click the password and send "Admin123"
And User select Laboratory
And User click the login button
And User check the dashboard
And User click Register a Patient
And User click the Given name and send "Suganya"
And User click the family name and send "Sugan"
And User click the gender and select "F"
And User click the day and send "20"
And User click the month and send "2"
And User click the year and send "2020"
And User click the address1 and send "Public office road"
And user click the address and send "1st main street"
And User click the city and send "Chennai"
And User click the state and send "TamilNadu"
And User click the country and send "India"
And User click the postalcode and send "600001"
And User click the phone number and send "9900990099"
And User click the relationship and select "8d91a210-c2cc-11de-8d13-0010c6dffd0f-B"
And User click the person name and send "Sasvi"
And user verify the patient details
And User click the confirm button

Scenario: Start visit

When User click the start visit
And User click confirm
And User click attachment
And User click the file and upload
And User click the caption and send "Image"
And User click the upload
And User verify the toaster message
And User click the patient details
And User verify the recen visits
And User click the end visit
And User click the yes button
And User click the delete patient
And User click the reason and send "Testing"
And User click the confirm button
And User verify the toaster deleted message
And User redirect to the Find Patient Record menu and verify the deleted patient should not be listed in the table
