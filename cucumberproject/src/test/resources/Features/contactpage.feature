Feature: Contact Page Negative Test for name field

Background:
    Given Application url completely launched and user is on the contact page
 
    
Scenario: Name field on contact page should not accept numeric values 
When User enter a name with numbers in the name field 
And submit the contact form
Then after submitting contact form user should see an error message indicating that Please enter valid name

Scenario: Name field on contact page should not accept special characters 
When User enter a name with special characters in the name field 
And submit the contact form
Then after submitting contact form user should see an error message indicating that Please enter valid name


   
Scenario: email id field on contact page should not accept invalid  email id 
When User enter a email with invalid email id in the email field 
And submit the contact form 
Then after submitting contact form user should see an error message indicating that Please enter a valid email address.

Scenario: Submitting an empty contact form
When user click the "Submit" button without filling out the form
Then user should see an error message "Please fill out all the required fields."

Scenario: Filling out the Contact Form correctly
When user fill in the contact form information correctly
And submit the contact form
Then user should see a confirmation message



