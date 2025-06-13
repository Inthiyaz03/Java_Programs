package pages;

import com.extensions.UIElementExtensions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateEmployeePage {

    private WebDriver driver;

    public CreateEmployeePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


//
//		UIElementExtensions.performEnterText(driver,By.id("Name"),"Harry");
//		UIElementExtensions.performEnterText(driver,By.id("DurationWorked"),"24");
//
//		UIElementExtensions.performDropdownSelectionByValue(driver,By.id("Grade"),"2");
//
//		UIElementExtensions.performClick(driver,By.xpath("//input[@type='submit' and @value='Create']"));

    @FindBy(id = "Name")
    private WebElement name;

    @FindBy(id = "DurationWorked")
    private WebElement durationWorked;

    @FindBy(id = "Salary")
    private WebElement salary;

    @FindBy(id = "Email")
    private WebElement email;

    @FindBy(id = "Grade")
    private WebElement grade;

    @FindBy(xpath = "//input[@type='submit' and @value='Create']")
    private WebElement btnCreate;

    public EmployeeListPage createNewEmployeePage(String txtname, String txtdurationWorked, String txtsalary, String txtemail, String txtgrade) {
        UIElementExtensions.performEnterText(name,txtname);
        UIElementExtensions.performEnterText(durationWorked,txtdurationWorked);
        UIElementExtensions.performEnterText(salary,txtsalary);
        UIElementExtensions.performEnterText(email,txtemail);
        UIElementExtensions.performDropdownSelectionByValue(grade,txtgrade);
        UIElementExtensions.performClick(btnCreate);
        return  new EmployeeListPage(driver);
    }

}
