package Pages;

import Elemens.Button;
import Elemens.TextField;
import Enums.Variables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Settings.BasicPage.getDriver;


/**
 * Created by serhii.kaihorodov on 11/30/2015.
 */
public class StartPage {

    private WebElement langs = getDriver().findElement(By.xpath(Variables.SELECT_LANG_DROP_DOWN.toString()));

    private Button selectLangDropDown = new Button(By.xpath(Variables.SELECT_LANG_DROP_DOWN.toString()));

    private Button englishLangDropDownItem = new Button(By.xpath(Variables.ENGLISH_LANG_DROP_DOWN_ITEM.toString()));
    private Button russianLanguageDropDownItem = new Button(By.xpath(Variables.RUSSIAN_LANGUAGE_DROP_DOWN_ITEM.toString()));

    private Button logInTab = new Button(By.xpath(Variables.LOG_IN_TAB.toString()));
    private TextField logInField = new TextField(By.xpath(Variables.EMAIL_FIELD.toString()));
    private TextField passwordField = new TextField(By.xpath(Variables.PASSWORD_FIELD.toString()));
    private Button loginButton = new Button(By.xpath(Variables.LOGIN_BUTTON.toString()));


    public StartPage selectLanguage() {
        String lang = langs.getText();
        String engLang = "English";
        String rusLang = "Русский";
        System.out.println(lang);
        if (lang.equals(engLang)) {
            return new StartPage();

        } else {
            selectLangDropDown.waitForElementIsPresent();
            selectLangDropDown.click();
            englishLangDropDownItem.waitForElementIsPresent();
            englishLangDropDownItem.click();
        }
        return new StartPage();
    }

    public Dashboard logIn(String login, String password) {
        logInTab.click();
        logInField.waitForElementIsPresent();
        logInField.enterText(login);
        passwordField.waitForElementIsPresent();
        passwordField.enterText(password);
        loginButton.waitForElementIsPresent();
        loginButton.click();
        return new Dashboard();
    }
}
