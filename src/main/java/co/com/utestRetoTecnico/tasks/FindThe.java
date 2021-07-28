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
import org.openqa.selenium.Keys;

public class FindThe implements Task {

    private UserData userData;

    public FindThe(UserData userData) {
        this.userData = userData;
    }

    public static Performable devicesInformation(UserData userData) {
        return Tasks.instrumented(FindThe.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestPage.BUTTON_COMPUTER),
                Enter.theValue(userData.getStrComputer()).into(UtestPage.INPUT_COMPUTER),
                Hit.the(Keys.DOWN).keyIn(UtestPage.INPUT_COMPUTER),
                Hit.the(Keys.ENTER).keyIn(UtestPage.INPUT_COMPUTER),
                Click.on(UtestPage.BUTTON_VERSION),
                Enter.theValue(userData.getStrVersion()).into(UtestPage.INPUT_VERSION),
                Hit.the(Keys.DOWN).keyIn(UtestPage.INPUT_VERSION),
                Hit.the(Keys.ENTER).keyIn(UtestPage.INPUT_VERSION),
                Click.on(UtestPage.BUTTON_LANGUAGE_PC),
                Enter.theValue(userData.getStrLanguagePc()).into(UtestPage.INPUT_LANGUAGE_PC),
                Hit.the(Keys.DOWN).keyIn(UtestPage.INPUT_LANGUAGE_PC),
                Hit.the(Keys.ENTER).keyIn(UtestPage.INPUT_LANGUAGE_PC),
                Click.on(UtestPage.BUTTON_MOBILE_DEVICE),
                Enter.theValue(userData.getStrMobileDevice()).into(UtestPage.INPUT_MOBILE_DEVICE),
                Hit.the(Keys.DOWN).keyIn(UtestPage.INPUT_MOBILE_DEVICE),
                Hit.the(Keys.ENTER).keyIn(UtestPage.INPUT_MOBILE_DEVICE),
                Click.on(UtestPage.BUTTON_MODEL),
                Enter.theValue(userData.getStrModel()).into(UtestPage.INPUT_MODEL),
                Hit.the(Keys.DOWN).keyIn(UtestPage.INPUT_MODEL),
                Hit.the(Keys.ENTER).keyIn(UtestPage.INPUT_MODEL),
                Click.on(UtestPage.BUTTON_OS),
                Enter.theValue(userData.getStrOS()).into(UtestPage.INPUT_OS),
                Hit.the(Keys.DOWN).keyIn(UtestPage.INPUT_OS),
                Hit.the(Keys.ENTER).keyIn(UtestPage.INPUT_OS),
                Click.on(UtestPage.BUTTON_LAST_STEP)
        );
    }
}
