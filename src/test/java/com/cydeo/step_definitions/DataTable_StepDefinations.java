package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownsPage;
import com.cydeo.pages.DropdownsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DataTable_StepDefinations {
    @Then("user should see fruits I like")
    public void user_should_see_fruits_ı_like(List<String>fruits) {
        System.out.println(fruits);
        System.out.println(fruits.get(1));
    }
    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }

    DropdownsPage dropdownsPage=new DropdownsPage();

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String>expectedMonth) {
        System.out.println("expectedMonth = " + expectedMonth);

        List<String>actualMonths=BrowserUtils.dropdownOptionsAsString(dropdownsPage.monthDropdown);
        Assert.assertEquals(expectedMonth,actualMonths);

    }


}
