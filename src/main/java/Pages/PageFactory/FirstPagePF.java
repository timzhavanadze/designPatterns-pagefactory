package Pages.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FirstPagePF {

    @FindBy(how = How.XPATH, using = "//div[@class='card mt-4 top-card'][2]")
    public WebElement forms;

    public FirstPagePF(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
