package co.com.utestRetoTecnico.tasks;

import co.com.utestRetoTecnico.model.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.utestRetoTecnico.userinterface.StepTwoAddress.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Find implements Task {

    private UserData addressData;

    public Find(UserData addressData) {
        this.addressData = addressData;
    }

    public static Performable addressInformation(UserData userData) {
        return Tasks.instrumented(Find.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LABEL_AUTODETECTED, isVisible()).forNoMoreThan(40).seconds(),
                Enter.theValue(addressData.getStrCity()).into(INPUT_CITY),
                Hit.the(Keys.DOWN).keyIn(INPUT_CITY),
                Hit.the(Keys.ENTER).keyIn(INPUT_CITY),
                Enter.theValue(addressData.getStrZipCode()).into(INPUT_ZIPCODE),
                Click.on(BUTTON_COUNTRY),
                Enter.theValue(addressData.getStrCountry()).into(INPUT_COUNTRY),
                Hit.the(Keys.DOWN).keyIn(INPUT_COUNTRY),
                Hit.the(Keys.ENTER).keyIn(INPUT_COUNTRY),
                Click.on(BUTTON_NEXT_DEVICES)
        );
    }
}
