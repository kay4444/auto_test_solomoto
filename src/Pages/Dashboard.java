package Pages;

import Elemens.Button;
import Enums.Variables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Settings.BasicPage.getDriver;

/**
 * Created by serhii.kaihorodov on 12/1/2015.
 */
public class Dashboard
{
    private List<WebElement> widgetList = getDriver().findElements(By.xpath("//div[@class='widget-header ng-scope']"));

    private WebElement langs = getDriver().findElement(By.xpath(Variables.SELECT_LANG_DROP_DOWN.toString()));
    private WebElement business = getDriver().findElement(By.xpath(Variables.SELECT_BUSINESS.toString()));

    private Button selectLangDropDown = new Button(By.xpath(Variables.SELECT_LANG_DROP_DOWN.toString()));
    private Button englishLangDropDownItemDash = new Button(By.xpath(Variables.ENGLISH_LANG_DROP_DOWN_ITEM.toString()));
    private Button createBusinessWidget = new Button (By.xpath(Variables.CREATE_BUSINESS_WIDGET.toString()));
    private Button publishSite = new Button (By.xpath(Variables.PUBLISH_SITE_WIDGET.toString()));
    private Button selectBusinessDropDown = new Button(By.xpath(Variables.SELECT_BUSINESS.toString()));
    private Button selectUSAItemDropDown = new Button(By.xpath(Variables.ENGLISH_LANG_DROP_DOWN_ITEM.toString()));
    private Button manageUSAWidget = new Button(By.xpath(Variables.MANAGE_WIDGET_FOR_USA_BUSINESS.toString()));

    public Dashboard selectUSA_Business()
    {
        String busines = business.getText();
        System.out.println(busines);
        String usaBusiness = "!S_USA_Media";
        if (busines.equals(usaBusiness))
        {
            return new Dashboard();
        }
        else
        {
            selectBusinessDropDown.waitForElementIsPresent();
            selectBusinessDropDown.click();
            selectUSAItemDropDown.waitForElementIsPresent();
            selectUSAItemDropDown.click();
            manageUSAWidget.waitForElementIsPresent();
        }
        return new Dashboard();
    }

    public Dashboard selectLanguageOnDash() {
        String lang = langs.getText();
        String engLang = "English";
        String rusLang = "Русский";
        System.out.println(lang);
        if (lang.equals(engLang)) {
            return new Dashboard();

        } else {
            selectLangDropDown.waitForElementIsPresent();
            selectLangDropDown.click();
            englishLangDropDownItemDash.waitForElementIsPresent();
            englishLangDropDownItemDash.click();
        }
        return new Dashboard();
    }

    public PublishSite clickPublishSiteWidget()
    {
        for (WebElement ell : widgetList)
        {
            String str = ell.getText();
            System.out.println (str);
            if (ell.getText().equals("Publish site"))
            {
                ell.click();
                publishSite.click();
                break;
            }
        }
        return new PublishSite();
    }
}
