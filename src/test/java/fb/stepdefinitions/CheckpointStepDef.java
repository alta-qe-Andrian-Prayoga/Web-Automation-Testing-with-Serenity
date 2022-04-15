package fb.stepdefinitions;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_old.Ac;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import tasks.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.contains;

public class CheckpointStepDef {
    @Then("{actor} can't see my news feed")
    public void validateNewsFeed(Actor actor){
        actor.should(seeThat(TheMenu.displayed(), not(contains("News Feed"))));
    }

    @But("{actor} see FB has disabled my account")
    public void validateAccountIsDissable(Actor actor){
        actor.should(
                seeThat(
                        TheMessage.displayed(), contains(
                                "Your account has been disabled"
                        )
                )
        );

        actor.attemptsTo(
                Ensure.thatTheCurrentPage().currentUrl().contains("checkpoint")
        );
    }
}
