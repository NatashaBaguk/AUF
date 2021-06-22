package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DropDownMenu {

    private UIElement uiElement;
    private WebDriver driver;

    public DropDownMenu(WebDriver driver, By by) {
        this.driver = driver;
        uiElement = new UIElement(driver, by);

    }

    public DropDownMenu(WebDriver driver, WebElement webElement) {
        uiElement = new UIElement(driver, webElement);
    }

    private UIElement findDropdown (By by){
        return new UIElement(driver, by);
    }


//    private UIElement getRow(int rowIndex) {
//        List<WebElement> list = uiElement.findElements(By.tagName("tr"));
//        return new UIElement(driver, list.get(rowIndex));
//
//    }
//
//    public void clickItemInRow(int rowIndex) {
//        UIElement item = getRow(rowIndex);
//        UIElement link = item.findElement(By.tagName("a"));
//        link.click();
//
//    }

    
}