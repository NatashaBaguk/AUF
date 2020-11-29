package pagesPF;


import baseEntities.BasePage;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class DashboardPagePF extends BasePage {
    private static String ENDPOINT = "index.php?/dashboard";

    @FindBy(className = "sidebar-button")
    public WebElement ADD_PROJECT;

    @FindBy(xpath = "//div[@class='summary-title text-ppp']/a[text()='Project by Marina']")
    private WebElement SELECT_PROJECT;

    @FindBy(xpath = "//li/a[text()='Test Cases']")
    private WebElement SELECT_TEST_CASES_TAB;

    public DashboardPagePF(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }

    public void openPage() {
        driver.get(BASE_URL + ENDPOINT);
    }

    @Override
    public boolean isPageOpened() {
        return driver.findElement(By.id("content-header")).isDisplayed();
    }

    public void clickSelectTestCases (){
         ADD_PROJECT.click();
    }

}
