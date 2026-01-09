package com.nttdata.tasks;

import com.nttdata.userinterfaces.ProductPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToCart implements Task {

    public static GoToCart now() {
        return instrumented(GoToCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(Click.on(ProductPageInterface.CART));

    }
}
