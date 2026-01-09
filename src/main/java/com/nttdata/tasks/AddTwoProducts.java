package com.nttdata.tasks;

import com.nttdata.userinterfaces.ProductPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddTwoProducts implements Task {

    public static AddTwoProducts toCart() {
        return instrumented(AddTwoProducts.class);
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Click.on(ProductPageInterface.ADD_BACKPACK),
                Click.on(ProductPageInterface.ADD_BIKE_LIGHT)
        );
    }
}
