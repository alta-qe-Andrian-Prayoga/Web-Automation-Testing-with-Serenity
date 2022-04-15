package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import fb.pageObjects.LoginPageObject;
import orange_hrm.pageobject.HRMLoginObjects;
import orange_hrm.pageobject.HRMPIMPageObjects;

public class NavigateTo {
    public static Performable theURL(String urlType) throws Exception{
        Class url;

        switch (urlType){
            case "FB Login":
                url = LoginPageObject.class;
                break;
            case "HRM Login":
                url = HRMLoginObjects.class;
                break;
            case "HRM Employee List":
                url = HRMPIMPageObjects.class;
                break;
            default:
                throw new Exception("There is no url type: " + urlType);
        }

        return Task.where("{0} access the login url", Open.browserOn().the(url));
    }
}
