package co.com.utestRetoTecnico.tasks;

import co.com.utestRetoTecnico.model.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.utestRetoTecnico.userinterface.StepThreeDevices.*;

public class FindThe implements Task {

    private UserData deviceData;

    public FindThe(UserData deviceData) {
        this.deviceData = deviceData;
    }

    public static Performable devicesInformation(UserData userData) {
        return Tasks.instrumented(FindThe.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_COMPUTER),
                Enter.theValue(deviceData.getStrComputer()).into(INPUT_COMPUTER),
                Hit.the(Keys.DOWN).keyIn(INPUT_COMPUTER),
                Hit.the(Keys.ENTER).keyIn(INPUT_COMPUTER),
                Click.on(BUTTON_VERSION),
                Enter.theValue(deviceData.getStrVersion()).into(INPUT_VERSION),
                Hit.the(Keys.DOWN).keyIn(INPUT_VERSION),
                Hit.the(Keys.ENTER).keyIn(INPUT_VERSION),
                Click.on(BUTTON_LANGUAGE_PC),
                Enter.theValue(deviceData.getStrLanguagePc()).into(INPUT_LANGUAGE_PC),
                Hit.the(Keys.DOWN).keyIn(INPUT_LANGUAGE_PC),
                Hit.the(Keys.ENTER).keyIn(INPUT_LANGUAGE_PC),
                Click.on(BUTTON_MOBILE_DEVICE),
                Enter.theValue(deviceData.getStrMobileDevice()).into(INPUT_MOBILE_DEVICE),
                Hit.the(Keys.DOWN).keyIn(INPUT_MOBILE_DEVICE),
                Hit.the(Keys.ENTER).keyIn(INPUT_MOBILE_DEVICE),
                Click.on(BUTTON_MODEL),
                Enter.theValue(deviceData.getStrModel()).into(INPUT_MODEL),
                Hit.the(Keys.DOWN).keyIn(INPUT_MODEL),
                Hit.the(Keys.ENTER).keyIn(INPUT_MODEL),
                Click.on(BUTTON_OS),
                Enter.theValue(deviceData.getStrOS()).into(INPUT_OS),
                Hit.the(Keys.DOWN).keyIn(INPUT_OS),
                Hit.the(Keys.ENTER).keyIn(INPUT_OS),
                Click.on(BUTTON_LAST_STEP)
        );
    }
}
