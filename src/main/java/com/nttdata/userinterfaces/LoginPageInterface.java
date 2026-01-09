package com.nttdata.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;


public class LoginPageInterface {
    public static final Target USERNAME = Target.the("username").locatedBy("#user-name");
    public static final Target PASSWORD = Target.the("password").locatedBy("#password");
    public static final Target LOGIN_BTN = Target.the("login button").locatedBy("#login-button");
}
