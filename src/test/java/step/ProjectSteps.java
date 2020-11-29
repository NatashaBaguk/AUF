package step;

import org.openqa.selenium.WebDriver;
import pages.*;

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
        EditProjectPage editProjectPage = new EditProjectPage(driver, true);
        editProjectPage.setButtonEdit();
        editProjectPage.setAnnouncement(text);
//        editProjectPage.setCheckbox();
        editProjectPage.setSaveProject();

    }

    public void delete (){
        DeleteProjectPage deleteProjectPage = new DeleteProjectPage(driver, true);
        deleteProjectPage.setIcon();
        deleteProjectPage.setTick();
        deleteProjectPage.setButton();
    }
}
