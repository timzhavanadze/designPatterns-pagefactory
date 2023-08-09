package Steps.PageFactory;

import Data.PersonDataPF;
import Pages.PageFactory.FirstPagePF;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class FirstPageStepsPF {

    public WebDriver driver;
    PersonDataPF dataPF;
    FirstPagePF firstPagePF;

    public FirstPageStepsPF(WebDriver driver) {
        this.driver = driver;
        dataPF = new PersonDataPF();
        firstPagePF = new FirstPagePF(driver);
    }

    @Step
    public FirstPageStepsPF open() {
        driver.get(dataPF.url);
        return this;
    }

    @Step
    public FirstPageStepsPF clickOnForms() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", firstPagePF.forms);
        firstPagePF.forms.click();
        return this;
    }

}
