package tests;

import models.TestCaseLombok;
import models.TestCaseLombokBuilder;
import org.testng.annotations.Test;

public class LombokTest {

    @Test
    public void firsTest (){
        TestCaseLombok testCaseLombok = new TestCaseLombok();
        testCaseLombok.setTitle("Test Title");
        String title = testCaseLombok.getTitle();
        System.out.println(title);
        System.out.println(testCaseLombok.toString());
        System.out.println(testCaseLombok.hashCode());
        System.out.println(testCaseLombok.equals(testCaseLombok));

    }

    @Test
    public void secondTest (){
        TestCaseLombokBuilder testCaseLombokBuilder = TestCaseLombokBuilder.builder()
                .estimate(10)
                .build();

        String title = testCaseLombokBuilder.getTitle();


        System.out.println(title);
        System.out.println(testCaseLombokBuilder.toString());
        System.out.println(testCaseLombokBuilder.hashCode());
        System.out.println(testCaseLombokBuilder.equals(testCaseLombokBuilder));
    }
}
