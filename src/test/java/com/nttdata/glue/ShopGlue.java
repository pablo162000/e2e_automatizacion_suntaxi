package com.nttdata.glue;

import com.nttdata.models.CheckoutData;
import com.nttdata.questions.OrderConfirmationText;
import com.nttdata.tasks.*;
import com.nttdata.utils.JsonLoader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.Matchers.equalTo;

public class ShopGlue {
    @Given("el usuario inicia sesion con usuario {string} y password {string}")
    public void login(String user, String pass) {
        theActorCalled("Pablo").attemptsTo(
                OpenPage.home(),
                LoginPage.with(user, pass)
        );
    }

    @When("agrega dos productos al carrito")
    public void addTwoProducts() {
        theActorCalled("Pablo").attemptsTo(AddTwoProducts.toCart());
    }

    @And("visualiza el carrito")
    public void viewCart() {
        theActorCalled("Pablo").attemptsTo(GoToCart.now());
    }

    @And("completa el formulario de compra con datos desde {string}")
    public void checkout(String path) {
        CheckoutData data = JsonLoader.fromClasspath(path, CheckoutData.class);
        theActorCalled("Pablo").attemptsTo(CompleteCheckout.with(data));
    }

    @Then("debe ver la confirmacion {string}")
    public void confirm(String expected) {
        theActorCalled("Pablo").should(
                seeThat(OrderConfirmationText.value(), equalTo(expected))
        );
    }
}
