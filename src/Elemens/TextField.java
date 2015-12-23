package Elemens;

import org.openqa.selenium.By;

/**
 * Created by serhii.kaihorodov on 11/30/2015.
 */
public class TextField extends Element
{

    public TextField(By by)
    {
        super(by);
    }

    public void enterText(String string)
    {
        composeWebElement().clear();
        composeWebElement().sendKeys(string);
    }
}
