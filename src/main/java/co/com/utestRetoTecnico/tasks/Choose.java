package co.com.utestRetoTecnico.tasks;

import co.com.utestRetoTecnico.model.UserData;
import co.com.utestRetoTecnico.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Choose implements Task {

    private UserData userData;

    public Choose(UserData userData) {
        this.userData = userData;
    }

    public static Performable passwordAndConditions(UserData userData) {
        return Tasks.instrumented(Choose.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userData.getStrPassword()).into(UtestPage.INPUT_PASSWORD),
                Enter.theValue(userData.getStrPassword()).into(UtestPage.INPUT_CONFIRM_PASSWORD),
                Click.on(UtestPage.CHECKBOX_INFORMED),
                Click.on(UtestPage.CHECKBOX_TERM_USE),
                Click.on(UtestPage.CHECKBOX_PRIVACY_SECURITY),
                Click.on(UtestPage.BUTTON_COMPLETE_SETUP),
                WaitUntil.the(UtestPage.SUCCESSFULLY_SIGNUP, isVisible()).forNoMoreThan(40).seconds()
        );
    }
}
