package tasks;

import fb.pageObjects.CheckpoinPageObject;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Collection;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TheMenu {
    public static Question<Collection<String>> displayed(){
        WaitUntil.the(CheckpoinPageObject.MENU_LIST, isVisible()).forNoMoreThan(25).seconds();

        return Text.ofEach(CheckpoinPageObject.MENU_LIST).describedAs("the massages displayed");
    }
}
