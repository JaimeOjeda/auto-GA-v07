package testingui.diplomadoumss.org.managepage.leftpanel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

public class LeftPanel extends BasePage {
    @FindBy(xpath = "//input[@name='email' and @type='text']")
    private WebElement menuCars;
}
