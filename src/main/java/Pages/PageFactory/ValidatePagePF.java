package Pages.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ValidatePagePF {

    @FindBy(how = How.XPATH, using = "//td[text()='Student Name']//following-sibling::td")
    public WebElement studentNamePage;

    @FindBy(how = How.XPATH, using = "//td[text()='Gender']//following-sibling::td")
    public WebElement genderPage;

    @FindBy(how = How.XPATH, using = "//td[text()='Mobile']//following-sibling::td")
    public WebElement mobilePage;

    public ValidatePagePF(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
