package step_definitions;


import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import pages.TaskPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class TaskStepDefs {


    @Given("the user is on the check24 Kreditkarten-Vergleich page")
    public void the_user_is_on_the_check24_Kreditkarten_Vergleich_page() {
        new TaskPage().akzeptieren.click();
    }
    @When("the user should see the cookie {string} is set in response headers")
    public void the_user_should_see_the_cookie_is_set_in_response_headers(String string) {
        System.out.println("Task is not clear");
    }
    @When("the user clicks on the first listed product")
    public void the_user_clicks_on_the_first_listed_product() {
        new TaskPage().barclayCardVisa.click();
    }
    @When("the user fills in {string} as email")
    public void the_user_fills_in_as_email(String email) {
        //Driver.get().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        new TaskPage().emailInput.sendKeys(email);
    }
    @When("the user clicks on weiter button")
    public void the_user_clicks_on_weiter_button() {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", new TaskPage().formWeiter);
    }
    @When("the user clicks on als Gast fortfahren radio-button")
    public void the_user_clicks_on_als_Gast_fortfahren_radio_button() throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].click()", new TaskPage().gastFortfahren);
    }
    @Then("error messages are displayed")
    public void error_messages_are_displayed() {
        Assert.assertTrue(new TaskPage().errorMessages.size()==13);
        List<String> expectedMessages = new ArrayList<>();
        expectedMessages.add("Bitte wählen Sie Ihre Anrede aus.");
        expectedMessages.add("Bitte geben Sie Ihren Vornamen an.");
        expectedMessages.add("Bitte geben Sie Ihren Nachnamen an.");
        expectedMessages.add("Bitte geben Sie Ihr Geburtsdatum an.");
        expectedMessages.add("Bitte geben Sie Ihren Geburtsort an.");
        expectedMessages.add("Bitte wählen Sie Ihren Familienstand aus.");
        expectedMessages.add("Bitte wählen Sie Ihre Staatsangehörigkeit aus.");
        expectedMessages.add("Bitte geben Sie Ihre Postleitzahl an.");
        expectedMessages.add("Bitte überprüfen Sie Ihren Wohnort.");
        expectedMessages.add("Bitte geben Sie Ihre Meldeadresse an.");
        expectedMessages.add("Bitte geben Sie die Hausnummer Ihrer Meldeadresse an.");
        expectedMessages.add("Bitte wählen Sie Ihre aktuelle Wohnsituation aus.");
        expectedMessages.add("Für eventuelle Rückfragen benötigen wir Ihre deutsche Mobilnummer.");

        for (int i = 0; i < expectedMessages.size(); i++) {
             Assert.assertEquals(expectedMessages.get(i),new TaskPage().errorMessages.get(i).getText());

        }

    }

    @Then("registration success message is displayed")
    public void registration_success_message_is_displayed() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(new TaskPage().bestanden.getText().contains("Sie haben es fast geschafft!"));
    }

    @Then("the user fills in all fields with valid values")
    public void the_user_fills_in_all_fields_with_valid_values(Map<String,String> userInfo) {
        new TaskPage().genderMale.click();
        new TaskPage().givenNameInput.sendKeys(userInfo.get("Vorname"));
        new TaskPage().lastNameInput.sendKeys(userInfo.get("Nachname"));
        new TaskPage().birthdayInput.sendKeys(userInfo.get("Geburtsdatum"));
        new TaskPage().birthplaceInput.sendKeys(userInfo.get("Geburtsort"));

        Select maritialSelect = new Select(new TaskPage().maritialStatusDropDown);
        maritialSelect.selectByVisibleText(userInfo.get("Familienstand"));

        Select nationalitySelect = new Select(new TaskPage().nationalityDropDown);
        nationalitySelect.selectByVisibleText(userInfo.get("Staatsangehorigkeit"));

        new TaskPage().postalCodeInput.sendKeys(userInfo.get("Postleitzahl"));
        new TaskPage().streetInput.sendKeys(userInfo.get("Strasse"));
        new TaskPage().houseNumberInput.sendKeys(userInfo.get("Hausnummer"));

        Select housingSelect = new Select(new TaskPage().housingStationDropDown);
        housingSelect.selectByVisibleText(userInfo.get("Wohnsituation"));

        new TaskPage().phoneNumberInput.sendKeys(userInfo.get("Mobilnummer"));
    }
    @And("the user clicks to weiter button below")
    public void theUserClicksToWeiterButtonBelow() {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", new TaskPage().weiterToRegisterPage);
    }

    @And("the user clicks on weiter button on registration page")
    public void theUserClicksOnWeiterButtonOnRegistrationPage() throws InterruptedException {
        Thread.sleep(2000);
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", new TaskPage().weiterOnRegisterPage);

    }
}
