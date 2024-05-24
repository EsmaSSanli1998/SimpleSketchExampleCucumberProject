package team12.hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import team12.utilities.ConfigReader;
import team12.utilities.Driver;

import java.time.Duration;

import static team12.base_url.ManagementSchoolUrl.setup;
import static team12.base_url.ManagementSchoolUrlDean.setup1;


public class Hooks {

    @Before
    public void beforeApi() {
        setup();
        setup1();
        Driver.getDriver().get(ConfigReader.getProperty("manage_Url"));
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Driver.getDriver().manage().window().maximize();
    }

   // @After
   // public void tearDown(Scenario scenario) throws Exception {
     //    if (scenario.isFailed()) {
       //      TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
         //    scenario.attach(ts.getScreenshotAs(OutputType.BYTES), "image/jpeg", "scenario_" + scenario.getName());
           //  Driver.closeDriver();
         //}
    //}



}
