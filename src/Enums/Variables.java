package Enums;

/**
 * Created by serhii.kaihorodov on 11/30/2015.
 */
public enum Variables
{

// StartPage
    SELECTED_LANG ("//span[text()='English']"),
    SELECT_LANG_DROP_DOWN ("//button[@class='btn selectpicker btn-default']"),
    ENGLISH_LANG_DROP_DOWN_ITEM ("//li[span/text()='English']"),
    RUSSIAN_LANGUAGE_DROP_DOWN_ITEM ("//li[span/text()='Русский']"),
    LOG_IN_TAB ("//a[@id='loginLink']"),
    EMAIL_FIELD ("//input[@id='Email']"),
    PASSWORD_FIELD ("//input[@id='Password']"),
    LOGIN_BUTTON ("//button[@id='loginBtn']"),

// Dashboard

    CREATE_BUSINESS_WIDGET ("//span[text()='business']"),
    PUBLISH_SITE_WIDGET ("//span[@class='name-widget']/span[text()='Publish site']"),
    SELECT_BUSINESS ("//a[@class='business-name fl arrow show-dropdown-link']"),
    USA_BUSINESS_DROP_DOWV_ITEM ("//li[a/text()='!S_Auto USA']"),
    MANAGE_WIDGET_FOR_USA_BUSINESS ("//span[span/text()='!S_Auto USA']"),

// Publish Site
    PUBLISH_SHOWCASE_BUTTON ("//a[@class='menu-button menu-button-large button-blue pull-right ng-scope']"),
    FOR_PLACING_WIDGETS ("//div[@class='column widget-holder cfx solo-showcase-widget-container main-col1']"),
    CK_EDITOR ("//span[@id='cke_1_top']"),
    TEXT_HTML_WIDGET ("//div[@class='widget-template-shortcut no-select ui-draggable ui-draggable-handle logo-image logo-text-widget wide']"),

//    CK_Editor
    CK_IMAGE_WIDGET ("//span[@class='cke_button_icon cke_button__solomotoimage_icon']"),
    LINK_TO_WEBSITE_TEXTBOX ("//input[@id='link-url']"),
    OK_BUTTON ("//input[@value='OK']"),
    OK_BUTTON_2 ("//div[button/text()='OK']"),
    FROM_MY_PC_BUTTON ("//a[@id='openUpload']");

    private String text;

    private Variables (String text)
    {
        this.text=text;
    }

    public String toString()
    {
        return this.text;
    }
}
