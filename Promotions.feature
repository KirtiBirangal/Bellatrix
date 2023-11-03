Feature: I am testing the Promotions Page.

Background: 
 Given Application Url is launched and Clicked on Promotions Bar


 Scenario: Verify the alert get after clicking on the Do you want % off on your BD ?
    When Clicked on the question alert should be displayed,Click on the Ok button

 Scenario: Navigating to Big Rocket Page
  Given Clicking on the Big Rocket Page
  And Sorting the product

  Scenario: Adding the sorted product to cart
   Then Adding proton rocket to cart
   And Clicking On the view cart

 # Scenario: Coupon code applying to avail the discount
#    Given Getting discount after applying coupon code
