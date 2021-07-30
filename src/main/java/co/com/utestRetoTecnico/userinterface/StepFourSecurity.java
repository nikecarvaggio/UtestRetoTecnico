package co.com.utestRetoTecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class StepFourSecurityData extends PageObject {

    public static final Target SUCCESSFULLY_SIGNUP=Target.the("confirm complete setpup").
            located(By.xpath("//*[@id=\"laddaBtn\"]/span[1]"));


    public static final Target INPUT_PASSWORD=Target.the("locate input to write password").
            located(By.id("password"));

    public static final Target INPUT_CONFIRM_PASSWORD=Target.the("locate input to write confirm password").
            located(By.id("confirmPassword"));

    public static final Target CHECKBOX_INFORMED=Target.the("locate checkbox to accept receive info").
            located(By.name("newsletterOptIn"));

    public static final Target CHECKBOX_TERM_USE=Target.the("locate checkbox to accept terms use").
            located(By.name("termOfUse"));

    public static final Target CHECKBOX_PRIVACY_SECURITY=Target.the("locate checkbox to accept privacy and security policy").
            located(By.name("privacySetting"));

    public static final Target BUTTON_COMPLETE_SETUP=Target.the("locate button finish signup process").
            located(By.xpath("//div[@class='pull-right next-step']//a[@aria-label='Complete Setup']"));


}
