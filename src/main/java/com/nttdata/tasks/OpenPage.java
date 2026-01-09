package com.nttdata.tasks;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPage {
    public static Performable home() {
        return Task.where("{0} opens Saucedemo", Open.url("https://www.saucedemo.com/"));
    }
}
