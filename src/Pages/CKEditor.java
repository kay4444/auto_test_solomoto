package Pages;

import Elemens.Button;
import Elemens.TextField;
import Enums.Variables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

import static Settings.BasicPage.getDriver;
import static org.junit.Assert.assertTrue;

/**
 * Created by serhii.kaihorodov on 12/10/2015.
 */
public class CKEditor
{
    private Button ckImageWidget = new Button(By.xpath(Variables.CK_IMAGE_WIDGET.toString()));
    private Button addFromPCButton = new Button(By.xpath(Variables.FROM_MY_PC_BUTTON.toString()));
    private TextField linkToWebSiteTextBox = new TextField(By.xpath(Variables.LINK_TO_WEBSITE_TEXTBOX.toString()));
    private Button oKbutton = new Button(By.xpath(Variables.OK_BUTTON.toString()));
    private Button okButton_2 = new Button(By.xpath(Variables.OK_BUTTON_2.toString()));


    public CKEditor addImageFromPC()
    {
        ckImageWidget.waitForElementIsPresent();
        ckImageWidget.click();
        addFromPCButton.waitForElementIsPresent();
        addFromPCButton.click();
        try {
            Runtime.getRuntime().exec("D:\\Projects\\UploadFile2.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new CKEditor();
    }

    public void enterURLForPicture()
    {
        linkToWebSiteTextBox.waitForElementIsPresent();
        String urlForImage = "http://google.com";
        linkToWebSiteTextBox.enterText(urlForImage);
        oKbutton.waitForElementIsPresent();
        oKbutton.click();
        okButton_2.waitForElementIsPresent();
        okButton_2.click();
        WebElement addedImage = getDriver().findElement(By.xpath("//a[@href='" + urlForImage + "']"));
        assertTrue (addedImage.isDisplayed());
    }
}
