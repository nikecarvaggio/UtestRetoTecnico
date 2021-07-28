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
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FindUser implements Task {

    private UserData userData;

    public FindUser(UserData userData) {
        this.userData = userData;
    }

    public static Performable addressInformation(UserData userData) {
        return Tasks.instrumented(FindUser.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(UtestPage.LABEL_AUTODETECTED, isVisible()).forNoMoreThan(40).seconds(),
                Enter.theValue(userData.getStrCity()).into(UtestPage.INPUT_CITY),
                Hit.the(Keys.DOWN).keyIn(UtestPage.INPUT_CITY),
                Hit.the(Keys.ENTER).keyIn(UtestPage.INPUT_CITY),
                Enter.theValue(userData.getStrZipCode()).into(UtestPage.INPUT_ZIPCODE),
                Click.on(UtestPage.BUTTON_COUNTRY),
                Enter.theValue(userData.getStrCountry()).into(UtestPage.INPUT_COUNTRY),
                Hit.the(Keys.DOWN).keyIn(UtestPage.INPUT_COUNTRY),
                Hit.the(Keys.ENTER).keyIn(UtestPage.INPUT_COUNTRY),
                Click.on(UtestPage.BUTTON_NEXT_DEVICES)
        );
    }
}
