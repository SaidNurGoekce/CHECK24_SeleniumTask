package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TaskPage {

    public TaskPage(){PageFactory.initElements(Driver.get(), this);}

    @FindBy (xpath="//a[@class='c24-cookie-consent-button']")
    public WebElement akzeptieren;

    @FindBy(xpath = "//*[@id=\"200007\"]//a")
    public WebElement barclayCardVisa;

    @FindBy(xpath = "//input[@id=\"cl_login\"]")
    public WebElement emailInput;

    @FindBy(xpath = "//*[@id=\"c24-uli-login-btn\"]")
    public WebElement formWeiter;

    @FindBy(xpath = "//*[@id=\"c24-uli-register-btn\"]")
    public WebElement weiterToRegisterPage;

    @FindBy(xpath = "//a[@target=\"_self\"]")
    public WebElement weiterOnRegisterPage;

    @FindBy(xpath = "//div[text()='Ich möchte als Gast fortfahren']")
    public WebElement gastFortfahren;

    @FindBy(xpath = "//label[@for=\"GENDER_MALE\"]")
    public WebElement genderMale;

    @FindBy(xpath = "//label[@for=\"GENDER_FEMALE\"]")
    public WebElement genderFemale;

    @FindBy(id = "GIVEN_NAME")
    public WebElement givenNameInput;

    @FindBy(id = "LAST_NAME")
    public WebElement lastNameInput;

    @FindBy(id = "DATE_OF_BIRTH")
    public WebElement birthdayInput;

    @FindBy(id = "PLACE_OF_BIRTH")
    public WebElement birthplaceInput;

    @FindBy(id = "MARITAL_STATUS")
    public WebElement maritialStatusDropDown;

    @FindBy(id = "NATIONALITY")
    public WebElement nationalityDropDown;

    @FindBy(id = "POSTAL_CODE")
    public WebElement postalCodeInput;

    @FindBy(xpath = "//*[@name=\"STREET\"]")
    public WebElement streetInput;

    @FindBy(id = "HOUSE_NUMBER")
    public WebElement houseNumberInput;

    @FindBy(id = "HOUSING_SITUATION")
    public WebElement housingStationDropDown;

    @FindBy(id = "PHONENUMBER_MOBILE")
    public WebElement phoneNumberInput;

    @FindBy(xpath = "//label[@class=\"styles__Message-sc-10pthkh-2 ibnmqN\"]")
    public List<WebElement> errorMessages;

    @FindBy(xpath = "//span[contains(text(), \"Sie haben es fast geschafft!\")]")
    public WebElement bestanden;




}
