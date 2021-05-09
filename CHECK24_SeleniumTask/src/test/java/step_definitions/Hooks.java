package step_definitions;


import io.restassured.RestAssured;
import utilities.ConfigurationReader;
import utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before("@wip")
    public void setUp(){
        Driver.get().manage().window().maximize();
        Driver.get().manage().deleteAllCookies();
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @After("@wip")
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }

        Driver.closeDriver();
    }

    @Before("@api")
    public void ApiConnection(){
        RestAssured.baseURI = ConfigurationReader.get("CHECK24_api_url");
    }


}
