package tasks;

import fb.pageObjects.CheckpoinPageObject;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Collection;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TheMessage {
    public static Question<Collection<String>> displayed(){
        WaitUntil.the(CheckpoinPageObject.ERROR_MESSAGE, isVisible()).forNoMoreThan(25).seconds();

        return Text.ofEach(CheckpoinPageObject.ERROR_MESSAGE).describedAs("the mesaage displayed");
    }
}
