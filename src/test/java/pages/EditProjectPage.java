package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import wrappers.Checkbox;

public class EditProjectPage extends BasePage {

    private static String ENDPOINT = "index.php?/admin/projects/overview";
    private static By BUTTON_EDIT_LOCATOR = By.className("icon-small-edit");
    private static By ANNOUNCEMENT_LOCATOR = By.id("announcement");
    private static By SAVE_PROJECT_LOCATOR = By.id("accept");
    private static By CHECKBOX_LOCATOR = By.id("show_announcement");

    public EditProjectPage(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }

    @Override
    protected void openPage() {
        driver.get(BASE_URL + ENDPOINT);
    }

    @Override
    public boolean isPageOpened() {
        return waits.isElementDisplayed(BUTTON_EDIT_LOCATOR);
    }


    private WebElement getButtonEdit (){
        return  waits.getElementBy(BUTTON_EDIT_LOCATOR);
    }

    private WebElement getAnnouncement (){
        return waits.getElementBy(ANNOUNCEMENT_LOCATOR);
    }

    private Checkbox getCheckbox (){
        return new Checkbox(driver,CHECKBOX_LOCATOR);
    }

    private WebElement getSaveProject (){
        return waits.getElementBy(SAVE_PROJECT_LOCATOR);
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


