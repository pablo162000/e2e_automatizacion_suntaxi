package com.nttdata.tasks;

import com.nttdata.models.CheckoutData;
import com.nttdata.userinterfaces.CartPageInterface;
import com.nttdata.userinterfaces.CheckoutPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompleteCheckout implements Task {

    private final CheckoutData data;

    public CompleteCheckout(CheckoutData data) {
        this.data = data;
    }

    public static CompleteCheckout with(CheckoutData data) {
        return instrumented(CompleteCheckout.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Click.on(CartPageInterface.CHECKOUT_BTN),
                Enter.theValue(data.firstName).into(CheckoutPageInterface.FIRST_NAME),
                Enter.theValue(data.lastName).into(CheckoutPageInterface.LAST_NAME),
                Enter.theValue(data.postalCode).into(CheckoutPageInterface.POSTAL_CODE),
                Click.on(CheckoutPageInterface.CONTINUE_BTN),
                Click.on(CheckoutPageInterface.FINISH_BTN)
        );
    }
}
