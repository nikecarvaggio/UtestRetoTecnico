package co.com.utestRetoTecnico.tasks;

import co.com.utestRetoTecnico.model.UserData;
import co.com.utestRetoTecnico.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

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
                Enter.theValue(userData.getStrFistName()).into(UtestPage.INPUT_FIRSTNAME),
                Enter.theValue(userData.getStrLastName()).into(UtestPage.INPUT_LASTNAME),
                Enter.theValue(userData.getStrEmail()).into(UtestPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(userData.getStrMonth()).from(UtestPage.INPUT_MONTH),
                SelectFromOptions.byVisibleText(userData.getStrDay()).from(UtestPage.INPUT_DAY),
                SelectFromOptions.byVisibleText(userData.getStrYear()).from(UtestPage.INPUT_YEAR),
                Enter.theValue(userData.getStrLanguageUser()).into(UtestPage.INPUT_LANGUAGE),
                Hit.the(Keys.DOWN).keyIn(UtestPage.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).keyIn(UtestPage.INPUT_LANGUAGE),
                Click.on(UtestPage.BUTTON_NEXT_LOCATION)
        );
    }
}
