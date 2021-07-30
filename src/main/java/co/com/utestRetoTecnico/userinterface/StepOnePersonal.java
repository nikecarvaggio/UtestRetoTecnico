package co.com.utestRetoTecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com")
public class StepOnePersonal extends PageObject {

    public static final Target BUTTON_NEXT_LOCATION=Target.the("locate button to next stepTwo Location").
            located(By.xpath("//div[@class='form-group col-xs-12 text-right']//span[contains(text(),'Next: Location')]"));

    public static final Target SINGUP_BUTTON =
            Target.the("Boton signup").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]"));

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

}
