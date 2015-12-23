package Pages;

import Elemens.Button;
import Enums.Variables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static Settings.BasicPage.getDriver;
/**
 * Created by serhii.kaihorodov on 12/3/2015.
 */
public class PublishSite
{
    WebElement textHTMLWidget= getDriver().findElement(By.xpath(Variables.TEXT_HTML_WIDGET.toString()));
    WebElement toElement=getDriver().findElement(By.xpath(Variables.FOR_PLACING_WIDGETS.toString()));

    private Button publishShowcaseButton = new Button (By.xpath(Variables.PUBLISH_SHOWCASE_BUTTON.toString()));

    public CKEditor moveHTMLWidget() {
        for (int i=0; i<19; i++)
        {
                Actions action = new Actions(getDriver());
//        Action dragDrop = action.dragAndDrop(textHTMLWidget, toElement).build();
//        dragDrop.perform();

                Action dragAndDrop = action.clickAndHold(textHTMLWidget).
                        moveToElement(toElement).
                        build();

                dragAndDrop.perform();
                try{
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Action dragAndDrop1 = action.release(toElement).
                        build();

                dragAndDrop1.perform();
            if(getDriver().findElements(By.xpath(Variables.CK_EDITOR.toString())).size() != 0)
            {
                break;
            }
        }
        return new CKEditor();
    }

    public PublishSite publishSite()
    {
        String windowName = getDriver().getTitle();
        System.out.println(windowName);
        publishShowcaseButton.waitForElementIsPresent();
        publishShowcaseButton.click();
        return new PublishSiteStep2();
    }
}
