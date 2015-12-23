package Test_Cases;

import Settings.BasicPage;
import org.testng.annotations.Test;


/**
 * Created by serhii.kaihorodov on 12/1/2015.
 */
public class TestCases1 extends BasicPage
{
    @Test
    public void sitePublish()
    {
        mainPage.selectLanguage().
                logIn("solo_kay@ukr.net", "06011988").
                selectLanguageOnDash().
                selectUSA_Business().
                clickPublishSiteWidget().
                moveHTMLWidget().
                addImageFromPC().
                enterURLForPicture();
//                publishSite();
    }
}
