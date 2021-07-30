package co.com.utestRetoTecnico.tasks;


import co.com.utestRetoTecnico.userinterface.StepOnePersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.utestRetoTecnico.userinterface.StepOnePersonal.*;

public class OpenUp implements Task {

    private StepOnePersonal stepOnePersonal;

    public static Performable thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(stepOnePersonal),
                Click.on(SINGUP_BUTTON)
        );
    }
}
