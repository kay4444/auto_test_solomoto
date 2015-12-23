package Elemens;

import org.openqa.selenium.By;

/**
 * Created by serhii.kaihorodov on 11/30/2015.
 */
public class Button extends Element
{
    public Button(By by)
    {
        super(by);
    }

    public void click()
    {
        composeWebElement().click();
    }

    public boolean isAvailable()
    {
        if (isPresent())
        {
            return true;
        }
        else {
            return false;
        }
    }
}
