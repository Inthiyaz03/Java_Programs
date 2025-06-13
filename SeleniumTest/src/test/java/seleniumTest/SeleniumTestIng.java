package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.extensions.UIElementExtensions;
import org.testng.annotations.Test;
import pages.CreateEmployeePage;
import pages.EmployeeListPage;
import pages.HomePage;
import pages.LoginPage;

public class SeleniumTestIng {
	public static void main(String[] args) {
		   ChromeDriver driver = new ChromeDriver();
		   driver.navigate().to("http://eaapp.somee.com/");
//		   driver.manage().window().maximize();

		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = homePage.clickLogin();
		loginPage.performLogin("admin", "password");
		EmployeeListPage employeeListPage = homePage.clickEmployeeListPage();
		CreateEmployeePage createEmployeePage = employeeListPage.clickCreateEmpBtn();
		createEmployeePage.createNewEmployeePage("Harry","2","12344","harry@gmail.com","2");

//		   login(driver);
//		   addEmployee(driver);
//		   logOff(driver);

		 
	}
	
//	public static void login(WebDriver driver) {
//
//
//
////		   By lnkLogin = By.id("loginLink");
////		   WebElement element = driver.findElement(lnkLogin);
////		   element.click();
////
////		   By name = By.name("UserName");
////		   WebElement nameElement = driver.findElement(name);
////		   nameElement.sendKeys("admin");
////
////		   By password = By.name("Password");
////		   WebElement passElement = driver.findElement(password);
////		   passElement.sendKeys("password");
////
////		   By loginBtn = By.id("loginIn");
////		   WebElement loginBtnElem = driver.findElement(loginBtn);
////		   loginBtnElem.click();
//
//		   UIElementExtensions.performClick(driver, By.id("loginLink"));
//		   UIElementExtensions.performEnterText(driver, By.name("UserName"), "admin");
//		   UIElementExtensions.performEnterText(driver, By.name("Password"), "password");
//		   UIElementExtensions.performClick(driver, By.id("loginIn"));
//
//
//	}
//
//	public static void addEmployee(WebDriver driver) {
//
////		By linkText = By.linkText("Employee List");
////		WebElement empElem = driver.findElement(linkText);
////		empElem.click();
////
////		By create = By.linkText("Create New");
////		WebElement createElem = driver.findElement(create);
////		createElem.click();
////
////
////		driver.findElement(By.id("Name")).sendKeys("Harry");
////
////		driver.findElement(By.id("DurationWorked")).sendKeys("23");
////
////		Select select = new Select(driver.findElement(By.id("Grade")));
////		select.selectByValue("2");
////
////		driver.findElement(By.xpath("//input[@type='submit' and @value='Create']")).click();
//
//		UIElementExtensions.performClick(driver,By.linkText("Employee List"));
//		UIElementExtensions.performClick(driver,By.linkText("Create New"));
//
//		UIElementExtensions.performEnterText(driver,By.id("Name"),"Harry");
//		UIElementExtensions.performEnterText(driver,By.id("DurationWorked"),"24");
//
//		UIElementExtensions.performDropdownSelectionByValue(driver,By.id("Grade"),"2");
//
//		UIElementExtensions.performClick(driver,By.xpath("//input[@type='submit' and @value='Create']"));
//
//
//		if (driver.findElement(By.xpath("//span[text()='The Salary field is required.']")).isDisplayed()) {
//
////		    driver.findElement(By.name("Salary")).sendKeys("10000");
////		    driver.findElement(By.cssSelector(".btn")).click();
//
//			UIElementExtensions.performEnterText(driver, By.name("Salary"), "10000");
//			UIElementExtensions.performClick(driver, By.cssSelector(".btn"));
//		}
//		else
//		{
////			do nothing
//		}
//
//
//	}
//
//	public static void logOff(WebDriver driver) {
//
////        By logout = By.linkText("Log off");
////        WebElement logoutElem = driver.findElement(logout);
////        logoutElem.click();
//		UIElementExtensions.performClick(driver, By.linkText("Log off"));
//
//	}
	
}
