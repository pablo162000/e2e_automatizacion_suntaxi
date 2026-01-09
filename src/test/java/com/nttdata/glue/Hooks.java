package com.nttdata.glue;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hooks {

    @Before
    public void setTheStage() {
        WebDriverManager.chromedriver().clearDriverCache().setup(); // <- fuerza descarga correcta

        OnStage.setTheStage(new OnlineCast());
    }
}
