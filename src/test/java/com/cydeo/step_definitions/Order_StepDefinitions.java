package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.OrderPage;
import com.cydeo.pages.ViewAllOrdersPage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Order_StepDefinitions {
    WebTableLoginPage webTableLoginPage=new WebTableLoginPage();
    BasePage basePage=new BasePage();
    OrderPage orderPage=new OrderPage();
    ViewAllOrdersPage viewAllOrdersPage=new ViewAllOrdersPage();


    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));
        webTableLoginPage.login();
       basePage.order.click();

    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {
        Select select=new Select(orderPage.productDropdown);
        select.selectByVisibleText(string);

    }
    //@When("user enters quantity {string}")
    //public void user_enters_quantity(String string) {

    //}

    @And("user enters quantity {int}")
    public void userEntersQuantity(int quantity) {
        orderPage.inputQuantity.sendKeys(quantity+"");
        orderPage.inputQuantity.sendKeys(String.valueOf(quantity));

        String str=quantity+"";

    }


    @When("user enters customer name {string}")
    public void user_enters_costumer_name(String string) {
        orderPage.inputName.sendKeys(string);

    }
    @When("user enters street {string}")
    public void user_enters_street(String string) {
        orderPage.inputStreet.sendKeys(string);


    }
    @When("user enters city {string}")
    public void user_enters_city(String string) {
        orderPage.inputCity.sendKeys(string);

    }
    @When("user enters state {string}")
    public void user_enters_state(String string) {
        orderPage.inputState.sendKeys(string);


    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
        orderPage.inputZip.sendKeys(string);

    }

    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String expectedCardType) {
        BrowserUtils.clickRadioButton(orderPage.cardType,expectedCardType);

    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
        orderPage.cardNoInput.sendKeys(string);


    }
    @When("user enter expiry date {string}")
    public void user_enter_expiry_date(String string) {
        orderPage.cardExpInput.sendKeys(string);

    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
        orderPage.processOrderBtn.click();

    }
    @Then("user should be see {string} in first row of the web table")
    public void user_should_be_see_in_first_row_of_the_web_table(String expectedName) {
        String actualName=viewAllOrdersPage.newCustomerCell.getText();
        Assert.assertEquals(expectedName,actualName);


    }




    @And("user enters expiry date {string}")
    public void userEntersExpiryDate(String arg0) {

    }

    @Then("user should see {string} in first row of the web table")
    public void userShouldSeeInFirstRowOfTheWebTable(String arg0) {

    }
}
