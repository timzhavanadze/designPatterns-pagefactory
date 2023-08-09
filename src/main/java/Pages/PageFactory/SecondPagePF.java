package Pages.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SecondPagePF {

    @FindBy(how = How.XPATH, using = "//span[text()='Practice Form']")
    public WebElement practiceForm;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(how = How.XPATH, using = "//label[text()='Male']")
    public WebElement genderMale;

    @FindBy(how = How.XPATH, using = "//label[text()='Female']")
    public WebElement genderFemale;

    @FindBy(how = How.XPATH, using = "//label[text()='Other']")
    public WebElement genderOther;

    @FindBy(how = How.XPATH, using = "//footer")
    public WebElement footer;

    @FindBy(how = How.XPATH, using = "//div[@id='fixedban']")
    public WebElement ad;

    @FindBy(id = "userNumber")
    public WebElement number;

    @FindBy(how = How.ID, using = "submit")
    public WebElement submit;

    public SecondPagePF(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
