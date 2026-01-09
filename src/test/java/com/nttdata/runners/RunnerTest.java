package com.nttdata.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "classpath:features/shop.feature",
        glue = "com.nttdata.glue",
        tags = "@happypath",
        plugin = {
                "pretty",
                "json:build/cucumber-report/cucumber.json"
        }
)
public class RunnerTest {
}
