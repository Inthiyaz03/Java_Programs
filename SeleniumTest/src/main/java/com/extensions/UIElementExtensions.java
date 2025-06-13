package com.extensions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UIElementExtensions {
    

    public static void performEnterText(WebElement locator, String value) {
        locator.click();
        locator.clear();
        locator.sendKeys(value);
    }
    

    public static void performClick(WebElement locator) {
        locator.click();
    }
    

    public static void performDropdownSelectionByText(WebElement locator, String dropdownText) {
        Select select = new Select((locator));
        select.selectByVisibleText(dropdownText);
    }
    

    public static void performDropdownSelectionByIndex(WebElement locator,int index) {
        Select select = new Select((locator));
        select.selectByIndex(index);
    }
    

    public static void performDropdownSelectionByValue(WebElement locator, String dropdownValue) {
        Select select = new Select((locator));
        select.selectByValue(dropdownValue);
    }
}