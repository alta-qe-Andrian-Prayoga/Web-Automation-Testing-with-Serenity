package fb.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;



@DefaultUrl("https://www.facebook.com/login")
public class LoginPageObject extends PageObject {

    public static Target EMAIL_FIELD = Target.the("email field").locatedBy("#email");
    public static Target PASSWORD_FIELD = Target.the("password field").locatedBy("#pass");
    public static Target LOGIN_BUTTON = Target.the("log in button").locatedBy("#loginbutton");
}
