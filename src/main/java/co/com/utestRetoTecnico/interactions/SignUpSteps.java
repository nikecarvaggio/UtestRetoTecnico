package co.com.utestRetoTecnico.interactions;

import co.com.utestRetoTecnico.model.UserData;
import co.com.utestRetoTecnico.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import org.openqa.selenium.Keys;

import java.util.List;

public class SignUpSteps implements Interaction {
    private List<UserData> userData;

    public SignUpSteps(List<UserData> userData) {
        this.userData = userData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        UserData userData = this.userData.get(0);

        actor.attemptsTo(
                Click.on(UtestPage.SINGUP_BUTTON),
                Enter.theValue(userData.getStrFistName()).into(UtestPage.INPUT_FIRSTNAME),
                Enter.theValue(userData.getStrLastName()).into(UtestPage.INPUT_LASTNAME),
                Enter.theValue(userData.getStrEmail()).into(UtestPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(userData.getStrMonth()).from(UtestPage.INPUT_MONTH),
                SelectFromOptions.byVisibleText(userData.getStrDay()).from(UtestPage.INPUT_DAY),
                SelectFromOptions.byVisibleText(userData.getStrYear()).from(UtestPage.INPUT_YEAR),
                Enter.theValue(userData.getStrLanguageUser()).into(UtestPage.INPUT_LANGUAGE),
                Hit.the(Keys.DOWN).keyIn(UtestPage.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).keyIn(UtestPage.INPUT_LANGUAGE),
                Click.on(UtestPage.BUTTON_NEXT_LOCATION),
                WaitUntil.the(UtestPage.LABEL_AUTODETECTED, isVisible()).forNoMoreThan(40).seconds(),
                Enter.theValue(userData.getStrCity()).into(UtestPage.INPUT_CITY),
                Hit.the(Keys.DOWN).keyIn(UtestPage.INPUT_CITY),
                Hit.the(Keys.ENTER).keyIn(UtestPage.INPUT_CITY),
                Enter.theValue(userData.getStrZipCode()).into(UtestPage.INPUT_ZIPCODE),
                Click.on(UtestPage.BUTTON_COUNTRY),
                Enter.theValue(userData.getStrCountry()).into(UtestPage.INPUT_COUNTRY),
                Hit.the(Keys.DOWN).keyIn(UtestPage.INPUT_COUNTRY),
                Hit.the(Keys.ENTER).keyIn(UtestPage.INPUT_COUNTRY),
                Click.on(UtestPage.BUTTON_NEXT_DEVICES),
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
                Click.on(UtestPage.BUTTON_LAST_STEP),
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
