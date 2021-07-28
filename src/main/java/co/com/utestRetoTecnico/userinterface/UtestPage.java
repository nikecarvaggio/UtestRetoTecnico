package co.com.utestRetoTecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://utest.com")
public class UtestPage extends PageObject {
    public static final Target SINGUP_BUTTON =
            Target.the("Boton signup").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]"));

    public static final Target LABEL_AUTODETECTED=Target.the("autodetect field").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[1]/span[2]"));
    public static final Target INPUT_FIRSTNAME=Target.the("locate field to write fistname").
            located(By.id("firstName"));

    public static final Target INPUT_LASTNAME=Target.the("locate field to write lastname").
            located(By.id("lastName"));

    public static final Target INPUT_EMAIL=Target.the("locate field to write email").
            located(By.id("email"));


    public static final Target INPUT_MONTH=Target.the("locate field to write date").
            located(By.id("birthMonth"));

    public static final Target INPUT_DAY=Target.the("locate field to write date").
            located(By.id("birthDay"));

    public static final Target INPUT_YEAR=Target.the("locate field to write date").
            located(By.id("birthYear"));

    public static final Target INPUT_LANGUAGE=Target.the("locate field to write language").
            located(By.xpath("//div[@id='languages']//input[@type='search']"));

    public static final Target SUCCESSFULLY_SIGNUP=Target.the("confirm complete setpup").
            located(By.xpath("//*[@id=\"laddaBtn\"]/span[1]"));

    public static final Target BUTTON_NEXT_LOCATION=Target.the("locate button to next stepTwo Location").
            located(By.xpath("//div[@class='form-group col-xs-12 text-right']//span[contains(text(),'Next: Location')]"));


    public static final Target INPUT_CITY=Target.the("locate field to write city address").
            located(By.id("city"));

    public static final Target INPUT_ZIPCODE=Target.the("locate field to write zipcode").
            located(By.id("zip"));

    public static final Target BUTTON_COUNTRY=Target.the("locate field to write country").
            located(By.xpath("//div[@class='ui-select']"));

    public static final Target INPUT_COUNTRY=Target.the("locate field to write country").
            located(By.xpath("//input[@type='search' and @placeholder='Select a country']"));

    public static final Target BUTTON_NEXT_DEVICES=Target.the("locate button to next stepTwo Devices").
            located(By.xpath("//div[@class='pull-right next-step']//a[@aria-label='Next step - select your devices']"));

    public static final Target BUTTON_COMPUTER=Target.the("locate field to write computer s.o").
            located(By.xpath("//div[@class='ui-select-match' and @placeholder='Select OS']"));

    public static final Target INPUT_COMPUTER=Target.the("locate field to write computer s.o").
            located(By.xpath("//input[@type='search' and @placeholder='Select OS']"));

    public static final Target BUTTON_VERSION=Target.the("locate field to write computer s.o").
            located(By.xpath("//div[@class='ui-select-match' and @placeholder='Select a Version']"));

    public static final Target INPUT_VERSION=Target.the("locate field to write version s.o").
            located(By.xpath("//input[@type='search' and @placeholder='Select a Version']"));

    public static final Target BUTTON_LANGUAGE_PC=Target.the("locate field to write language PC").
            located(By.xpath("//div[@class='ui-select-match' and @placeholder='Select OS language']"));

    public static final Target INPUT_LANGUAGE_PC=Target.the("locate field to write Language PC").
            located(By.xpath("//input[@type='search' and @placeholder='Select OS language']"));

    public static final Target BUTTON_MOBILE_DEVICE=Target.the("locate field to write mobile device").
            located(By.xpath("//div[@class='ui-select-match' and @placeholder='Select Brand']"));

    public static final Target INPUT_MOBILE_DEVICE=Target.the("locate field to write mobile device").
            located(By.xpath("//input[@type='search' and @placeholder='Select Brand']"));

    public static final Target BUTTON_MODEL=Target.the("locate field to write model device").
            located(By.xpath("//div[@class='ui-select-match' and @placeholder='Select a Model']"));

    public static final Target INPUT_MODEL=Target.the("locate field to write model device").
            located(By.xpath("//input[@type='search' and @placeholder='Select a Model']"));

    public static final Target BUTTON_OS=Target.the("locate field to write mobile device os").
            located(By.name("handsetOSId"));

    public static final Target INPUT_OS=Target.the("locate field to write mobile device os").
            located(By.xpath("//div[@name='handsetOSId']//input[@type='search' and @placeholder='Select OS']"));

    public static final Target BUTTON_LAST_STEP=Target.the("locate button to next stepFour, last step").
            located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Next: Last Step')]"));

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

    public static final Target EMAIL_EXISTS=Target.the("locate span to validate email warningEmail already registered error").
            located(By.xpath("//span[@id='emailError']") );
}


