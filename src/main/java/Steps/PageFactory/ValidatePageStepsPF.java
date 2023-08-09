package Steps.PageFactory;

import Pages.PageFactory.ValidatePagePF;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class ValidatePageStepsPF {

    public WebDriver driver;
    ValidatePagePF validatePagePF;

    public ValidatePageStepsPF(WebDriver driver) {
        this.driver = driver;
        validatePagePF = new ValidatePagePF(driver);
    }

    @Step
    public String getFullName() {
        return validatePagePF.studentNamePage.getText();
    }

    @Step
    public String getGender() {
        return validatePagePF.genderPage.getText();
    }

    @Step
    public String getMobile() {
        return validatePagePF.mobilePage.getText();
    }

}
