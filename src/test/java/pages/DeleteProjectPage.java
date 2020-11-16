package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteProjectPage extends BasePage {

    private static String ENDPOINT = "index.php?/admin/projects/overview";
    private static By ICON_LOCATOR = By.className("icon-small-delete");
    private static By TICK_LOCATOR = By.xpath("//*[@class='icon-progress-inline']/following::input");
    private static By OK_BUTTON_LOCATOR = By.xpath("//*[@class='icon-progress-inline']/following::a[1]");

    public DeleteProjectPage(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }

    @Override
    protected void openPage() {
        driver.get(BASE_URL + ENDPOINT);
    }

    @Override
    public boolean isPageOpened() {
        return waits.getElementBy(ICON_LOCATOR).isDisplayed();
    }

    private WebElement getIcon (){
        return waits.getElementBy(ICON_LOCATOR);
    }

    private WebElement getTick (){
        return waits.getElementBy(TICK_LOCATOR);
    }

    private WebElement getButton (){
        return waits.getElementBy(OK_BUTTON_LOCATOR);
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
