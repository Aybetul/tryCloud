package com.tryCloud.step_definitions;


import com.tryCloud.utulities.Driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
 public void setup(){    // this runs for any ways
     System.out.println("Test setup");
     Driver.getDriver().manage().window().maximize();

 }



    @After
   public void tearDown (Scenario scenario){
        if(scenario.isFailed()){
            TakesScreenshot takesScreenshot= (TakesScreenshot) Driver.getDriver();
            byte[] image=takesScreenshot.getScreenshotAs(OutputType.BYTES);
            // attach the screenshots to the report
            scenario.embed(image,"image/png",scenario.getName());
        }
       System.out.println("test clean up");
        Driver.closeDriver();
   }




}
