package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectDeletePage extends BasePage {

    private static String ENDPOINT = "index.php?/admin/projects/overview";
    private static By ICON_LOCATOR = By.className("icon-small-delete");
    private static By TICK_LOCATOR = By.xpath("//*[@class='icon-progress-inline']/following::input");
    private static By OK_BUTTON_LOCATOR = By.xpath("//*[@class='icon-progress-inline']/following::a[1]");

    public ProjectDeletePage(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }

    @Override
    protected void openPage() {
        driver.get(BASE_URL + ENDPOINT);
    }

    @Override
    public boolean isPageOpened() {
        return driver.findElement(ICON_LOCATOR).isDisplayed();
    }

    private WebElement getIcon (){
        return driver.findElement(ICON_LOCATOR);
    }

    private WebElement getTick (){
        return driver.findElement(TICK_LOCATOR);
    }

    private WebElement getButton (){
        return driver.findElement(OK_BUTTON_LOCATOR);
    }

    public void setIcon (){
        getIcon().click();
    }

    public void setTick (){
        getTick().click();
    }

    public void setButton (){
        getButton().click();
    }
}
