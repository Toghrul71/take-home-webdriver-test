package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IframePage {
    public IframePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "mce_0_ifr")
    public WebElement iframe;

    @FindBy(xpath = "//*[.='Your content goes here.']/body")
    public WebElement iframeMessage;
}
