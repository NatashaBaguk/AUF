package tests;

import models.ProjectLombokBuilder;
import models.TestCaseLombokBuilder;
import org.testng.annotations.Test;

public class ProjectBuilderLombokTest {

    @Test
    public void test (){
        ProjectLombokBuilder projectLombokBuilder = ProjectLombokBuilder.builder()
                .typeOfProject(3)
                .name("Teach Me Skills")
                .announcement("blabla")
                .isShowAnnouncement(false)
                .isCompleted(true)
                .build();

        projectLombokBuilder.setAnnouncement("fghgfdfgh");



        String title = projectLombokBuilder.getAnnouncement();


        System.out.println(title);
        System.out.println(projectLombokBuilder.toString());
        System.out.println(projectLombokBuilder.hashCode());
        System.out.println(projectLombokBuilder.equals(projectLombokBuilder));
    }
}
