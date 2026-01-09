package com.nttdata.tasks;

import com.nttdata.userinterfaces.LoginPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginPage implements Task {


    private final String user;
    private final String pass;

    public LoginPage(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public static LoginPage with(String user, String pass) {
        return instrumented(LoginPage.class, user, pass);
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Enter.theValue(user).into(LoginPageInterface.USERNAME),
                Enter.theValue(pass).into(LoginPageInterface.PASSWORD),
                Click.on(LoginPageInterface.LOGIN_BTN)
        );
    }
}
