package orange_hrm.pageobject;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/")
public class HRMLoginObjects extends PageObject {
    public static Target USERNAME_FIELD = Target.the("username field")
            .locatedBy("#txtUsername");
    public static Target PASSWORD_FIELD = Target.the("password field")
            .locatedBy("#txtPassword");
    public static Target LOGIN_BUTTON = Target.the("login button")
            .locatedBy("#btnLogin");

}
