package tasks;

import fb.pageObjects.LoginPageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import orange_hrm.pageobject.HRMLoginObjects;
import orange_hrm.pageobject.HRMPIMPageObjects;

public class InputText {
    public static Performable onField(String fieldType, String value)throws Exception{
        Target field;

        switch (fieldType){
            case "FB email":
                field = LoginPageObject.EMAIL_FIELD;
                break;
            case "FB password":
                field = LoginPageObject.PASSWORD_FIELD;
                break;
            case "HRM username":
                field = HRMLoginObjects.USERNAME_FIELD;
                break;
            case "HRM password":
                field = HRMLoginObjects.PASSWORD_FIELD;
                break;
            case "firstName":
                field = HRMPIMPageObjects.FIRST_NAME_FIELD;
                break;
            case "lastName":
                field = HRMPIMPageObjects.LAST_NAME_FIELD;
                break;
            case "editMiddleName":
                field = HRMPIMPageObjects.EDIT_MIDDLE_NAME_FIELD;
                break;
            case "employeeName":
                field = HRMPIMPageObjects.EMPLOYEE_NAME;
                break;
            default:
                throw new Exception("There is no field type: " + fieldType);
        }

        return Task.where("{0} input value: '" + value + "'", Enter.theValue(value).into(field));
    }
}
