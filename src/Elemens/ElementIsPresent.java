package Elemens;

import org.openqa.selenium.By;

/**
 * Created by serhii.kaihorodov on 12/10/2015.
 */
public class ElementIsPresent extends Element {
    public ElementIsPresent(By by) {
        super(by);
    }

    public boolean elementIsPresent()
    {
        if (isPresent())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
