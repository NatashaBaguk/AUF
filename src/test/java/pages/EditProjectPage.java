package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditProjectPage extends BasePage {

    private static String ENDPOINT = "index.php?/admin/projects/overview";
    private static By BUTTON_EDIT_LOCATOR = By.className("icon-small-edit");
    private static By ANNOUNCEMENT_LOCATOR = By.id("announcement");
    private static By SAVE_PROJECT_LOCATOR = By.id("accept");

    public EditProjectPage(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }

    @Override
    protected void openPage() {
        driver.get(BASE_URL + ENDPOINT);
    }

    @Override
    public boolean isPageOpened() {
        return waiters.isElementDisplayed(BUTTON_EDIT_LOCATOR);
    }

    private WebElement getButtonEdit (){
        return  waiters.getElementBy(BUTTON_EDIT_LOCATOR);
    }
    private WebElement getAnnouncement (){
        return waiters.getElementBy(ANNOUNCEMENT_LOCATOR);
    }

    private WebElement getSaveProject (){
        return waiters.getElementBy(SAVE_PROJECT_LOCATOR);
    }

    public void setButtonEdit (){
        getButtonEdit().click();
    }
    public void setAnnouncement (String text){
        getAnnouncement().sendKeys(text);
    }

    public void setSaveProject (){
        getSaveProject().submit();
    }
}

