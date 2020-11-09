package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectPage extends BasePage {

    private static String ENDPOINT = "index.php?/dashboard";

    private static By ADD_BUTTON_LOCATOR = By.className("sidebar-button");
    private static By NAME_FIELD_LOCATOR = By.id("name");
    private static By ADD_PROJECT_LOCATOR = By.id("accept");


    public ProjectPage(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }

    @Override
    protected void openPage() {
        driver.get(BASE_URL + ENDPOINT);
    }

    @Override
    public boolean isPageOpened() {
        return waiters.isElementDisplayed(By.id("sidebar-button"));
    }

    private WebElement getAddProject (){
       return waiters.getElementBy(ADD_BUTTON_LOCATOR);
    }

    private WebElement getNameField (){
        return waiters.getElementBy(NAME_FIELD_LOCATOR);
    }

    private WebElement getButtonAddProject (){
        return waiters.getElementBy(ADD_PROJECT_LOCATOR);
    }

    public void setAddProject (){
        getAddProject().click();
    }

    public void setNameField (String name){
        getNameField().sendKeys(name);
    }

    public void setButtonAddProject (){
        getButtonAddProject().submit();
    }

}
