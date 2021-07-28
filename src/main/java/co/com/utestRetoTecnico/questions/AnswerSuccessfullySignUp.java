package co.com.utestRetoTecnico.questions;

import co.com.utestRetoTecnico.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;



public class AnswerSuccessfullySignUp implements Question<Boolean> {

    private String strQuestion;

    public AnswerSuccessfullySignUp(String strQuestion) {
        this.strQuestion = strQuestion;
    }
    public static AnswerSuccessfullySignUp toThe(String strQuestion) {
        return new AnswerSuccessfullySignUp(strQuestion);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String strSuccessfullSignUp= Text.of(UtestPage.SUCCESSFULLY_SIGNUP).viewedBy(actor).asString();


        return (strQuestion.equals(strSuccessfullSignUp)) ? true : false;
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}
