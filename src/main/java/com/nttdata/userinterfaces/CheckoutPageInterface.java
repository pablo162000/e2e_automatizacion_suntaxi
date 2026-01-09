package com.nttdata.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPageInterface {
    public static final Target FIRST_NAME = Target.the("first name").locatedBy("#first-name");
    public static final Target LAST_NAME = Target.the("last name").locatedBy("#last-name");
    public static final Target POSTAL_CODE = Target.the("postal code").locatedBy("#postal-code");
    public static final Target CONTINUE_BTN = Target.the("continue").locatedBy("#continue");
    public static final Target FINISH_BTN = Target.the("finish").locatedBy("#finish");
    public static final Target CONFIRMATION = Target.the("confirmation").locatedBy(".complete-header");
}
