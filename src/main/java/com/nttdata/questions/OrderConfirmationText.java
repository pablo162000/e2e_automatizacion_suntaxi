package com.nttdata.questions;

import com.nttdata.userinterfaces.CheckoutPageInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class OrderConfirmationText {

    public static Question<String> value() {
        return actor -> Text.of(CheckoutPageInterface.CONFIRMATION).answeredBy(actor).trim();
    }
}
