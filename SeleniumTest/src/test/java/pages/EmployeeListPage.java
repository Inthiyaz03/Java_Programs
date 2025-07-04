package pages;

import com.extensions.UIElementExtensions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeListPage {
    private  WebDriver driver;

    public EmployeeListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Create New")
    private WebElement btnCreate ;

    public CreateEmployeePage clickCreateEmpBtn(){
        UIElementExtensions.performClick(btnCreate);
        return new CreateEmployeePage(driver);
    }



}
