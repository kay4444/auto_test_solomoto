package Elemens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

import static Settings.BasicPage.getDriver;
import static Settings.BasicPage.waitInSeconds;

/**
 * Created by serhii.kaihorodov on 11/30/2015.
 */
public class Element
{
    protected By by;

    public Element (By by)
    {
        this.by=by;
    }

    protected WebElement composeWebElement ()
    {
        return getDriver().findElement(by);
    }

    public boolean isPresent()
    {
        try
        {
            composeWebElement();
            return true;
        }
        catch (NoSuchElementException e)
        {
            return false;
        }
    }

    public void waitForElementIsPresent()
    {
        for (int i=0; i<20; i++)
        {
            if (isPresent())
            {
                waitInSeconds(1);
                break;
            }
            else
            {
                waitInSeconds(1);
            }
        }
    }
}
