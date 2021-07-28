package co.com.utestRetoTecnico.stepdefinitions;

import co.com.utestRetoTecnico.model.UserData;
import co.com.utestRetoTecnico.questions.AnswerSuccessfullySignUp;
import co.com.utestRetoTecnico.tasks.OpenUp;
import co.com.utestRetoTecnico.tasks.Register;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestRetoTecnicoStepDefinitions {

    @Before
    public void setStage() {

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^brandon wants to signup into a utest\\.com$")
    public void brandoWantsToSignupIntoAUtestCom() {

            OnStage.theActorCalled("brandon").wasAbleTo(OpenUp.thePage());
    }


    @When("^brandon clicks on button Join today and writes his credentials$")
    public void brandonClicksOnButtonJoinTodayAndWritesHisCredentials(List<UserData> userData) {
        OnStage.theActorCalled("brandon").attemptsTo(
                Register.introduceData(userData)
        );
    }

    @Then("^brandon was successfully registered$")
    public void brandonWasSuccessfullyRegistered(List<String> strQuestion) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerSuccessfullySignUp.toThe(strQuestion.get(1))));
    }
}
