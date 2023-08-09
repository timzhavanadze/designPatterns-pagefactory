package Steps.PageFactory;

import Data.PersonDataPF;
import Pages.PageFactory.SecondPagePF;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondPageStepsPF {

    public WebDriver driver;
    PersonDataPF dataPF;
    SecondPagePF secondPagePF;

    public SecondPageStepsPF(WebDriver driver) {
        this.driver = driver;
        secondPagePF = new SecondPagePF(driver);
        dataPF = new PersonDataPF();
    }

    @Step
    public SecondPageStepsPF choosePracticeForms() {
        secondPagePF.practiceForm.click();
        return this;
    }
    @Step
    public SecondPageStepsPF deleteFooterAds(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].remove();", secondPagePF.footer);
        js.executeScript("arguments[0].remove();", secondPagePF.ad);
        return this;
    }
    @Step
    public SecondPageStepsPF clickOnSubmit() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(secondPagePF.submit));
        secondPagePF.submit.click();
        return this;
    }
    @Step
    public SecondPageStepsPF enterFirstName() {
        secondPagePF.firstName.sendKeys(dataPF.firstName);
        return this;
    }

    @Step
    public SecondPageStepsPF enterLastName() {
        secondPagePF.lastName.sendKeys(dataPF.lastName);
        return this;
    }

    @Step
    public SecondPageStepsPF chooseGender() {

        String gender = dataPF.gender;

        switch (gender) {
            case "Male" -> secondPagePF.genderMale.click();
            case "Female" -> secondPagePF.genderFemale.click();
            case "Other" -> secondPagePF.genderOther.click();
        }

        return this;
    }

    @Step
    public SecondPageStepsPF enterNumber() {
        secondPagePF.number.sendKeys(dataPF.number);
        return this;
    }


}
