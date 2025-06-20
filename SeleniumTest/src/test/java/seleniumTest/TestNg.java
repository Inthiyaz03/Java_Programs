package seleniumTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.CreateEmployeePage;
import pages.EmployeeListPage;
import pages.HomePage;
import pages.LoginPage;

public class TestNg {

    private  ChromeDriver driver;
    @BeforeTest
    public void runBeforetest(){
         driver = new ChromeDriver();
        driver.navigate().to("http://eaapp.somee.com/");
//		   driver.manage().window().maximize();
    }

    @Parameters({"UserName","Password"})
    @Test
    public void logInCreateEmp(String UserName,String Password){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickLogin();
        loginPage.performLogin(UserName, Password);
        EmployeeListPage employeeListPage = homePage.clickEmployeeListPage();
        CreateEmployeePage createEmployeePage = employeeListPage.clickCreateEmpBtn();
        createEmployeePage.createNewEmployeePage("Harry","2","12344","harry@gmail.com","2");
//        homePage.logOff();
    }

    @AfterTest
    public void runAfterTest(){

        System.out.println("quitedd");
        driver.quit();
    }


}
