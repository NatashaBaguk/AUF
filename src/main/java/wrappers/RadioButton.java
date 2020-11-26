package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButton {

    private UIElement uiElement;
    private WebDriver driver;

    public RadioButton(WebDriver driver, By by) {
        this.driver = driver;
        uiElement = new UIElement(driver, by);
    }

    public RadioButton(WebDriver driver, WebElement webElement) {
        uiElement = new UIElement(driver, webElement);
    }

    private UIElement getRow(int rowIndex) {
        List<WebElement> list = uiElement.findElements(By.cssSelector(".column.project-type"));
        return new UIElement(driver, list.get(rowIndex));

    }

    public void clickRadioButton(int rowIndex) {
        UIElement item = getRow(rowIndex);
        UIElement link = item.findElement(By.tagName("input"));
        link.click();
    }

    private UIElement selectOption(String option){
        return uiElement.findElement(By.id(option));
    }
    public void clickRadio (String option){
        UIElement item = selectOption(option);
        item.click();

    }
}
