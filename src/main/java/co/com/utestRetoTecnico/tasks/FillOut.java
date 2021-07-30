package co.com.utestRetoTecnico.tasks;

import co.com.utestRetoTecnico.model.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static co.com.utestRetoTecnico.userinterface.StepOnePersonal.*;

public class FillOut implements Task {

    private UserData userData;

    public FillOut(UserData userData) {
        this.userData = userData;
    }

    public static Performable personalData(UserData userData) {
        return Tasks.instrumented(FillOut.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userData.getStrFistName()).into(INPUT_FIRSTNAME),
                Enter.theValue(userData.getStrLastName()).into(INPUT_LASTNAME),
                Enter.theValue(userData.getStrEmail()).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(userData.getStrMonth()).from(INPUT_MONTH),
                SelectFromOptions.byVisibleText(userData.getStrDay()).from(INPUT_DAY),
                SelectFromOptions.byVisibleText(userData.getStrYear()).from(INPUT_YEAR),
                Enter.theValue(userData.getStrLanguageUser()).into(INPUT_LANGUAGE),
                Hit.the(Keys.DOWN).keyIn(INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).keyIn(INPUT_LANGUAGE),
                Click.on(BUTTON_NEXT_LOCATION)
        );
    }
}
