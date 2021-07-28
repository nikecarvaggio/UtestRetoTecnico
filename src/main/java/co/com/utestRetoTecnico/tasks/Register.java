package co.com.utestRetoTecnico.tasks;

import co.com.utestRetoTecnico.interactions.SignUpSteps;
import co.com.utestRetoTecnico.model.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class Register implements Task {


    public static Performable introduceData(List<UserData> userData) {
        return Tasks.instrumented(SignUpSteps.class, userData);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
    }
}
