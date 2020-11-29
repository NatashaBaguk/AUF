package tests;

import models.ProjectLombokBuilder;
import org.testng.annotations.Test;

public class ProjectLombokTest {

    @Test
    public void projectTest() {
        ProjectLombokBuilder projectLombokBuilder = ProjectLombokBuilder.builder()
                .name("test")
                .announcement("Hello")
                .typeOfProject(1)
                .build();


        String name = projectLombokBuilder.getName();

        System.out.println(name);
        System.out.println(projectLombokBuilder.toString());
        System.out.println(projectLombokBuilder.hashCode());
        System.out.println(projectLombokBuilder.equals(projectLombokBuilder));
    }
}