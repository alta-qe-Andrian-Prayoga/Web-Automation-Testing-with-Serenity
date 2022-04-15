package fb.pageObjects;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class CheckpoinPageObject extends PageObject {
    public static Target ERROR_MESSAGE = Target.the("banned account")
            .locatedBy(".aov4n071.bi6gxh9e:first-of-type>span:nth-child(1)");
    public static Target MENU_LIST = Target.the("list of menu")
            .locatedBy(".rq0escxv.l9j0dhe7.du4w35lb");
}
