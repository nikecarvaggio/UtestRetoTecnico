package co.com.utestRetoTecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class StepThreeDevicesData extends PageObject {

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

}
