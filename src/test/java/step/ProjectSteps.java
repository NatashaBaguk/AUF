package step;

import org.openqa.selenium.WebDriver;
import pages.ProjectDeletePage;
import pages.ProjectEditPage;
import pages.ProjectPage;

public class ProjectSteps {
    private WebDriver driver;


    public ProjectSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void create (String name){
        ProjectPage projectPage = new ProjectPage(driver, true);
        projectPage.setAddProject();
        projectPage.setNameField(name);
        projectPage.setButtonAddProject();

    }

    public void edit (String text) {
        ProjectEditPage projectEditPage = new ProjectEditPage(driver, true);
        projectEditPage.setButtonEdit();
        projectEditPage.setAnnouncement(text);
        projectEditPage.setSaveProject();

    }

    public void delete (){
        ProjectDeletePage projectDeletePage = new ProjectDeletePage(driver, true);
        projectDeletePage.setIcon();
        projectDeletePage.setTick();
        projectDeletePage.setButton();
    }
}
