package models;

public class TestCase {
    //1. описание private переменных которые нам будут нужны для этой сущности
    private String title;
    private int estimate;
    private String reference;


    //Getters
    public String getTitle() {
        return title;
    }

    public int getEstimate() {
        return estimate;
    }

    public String getReference() {
        return reference;
    }

    //2. Создать внутри этого класса - public static class builder
    private static class Builder{
        private TestCase newTestCase;

        //Конструктор

        public Builder(TestCase testCase) {
            this.newTestCase = testCase;
        }

        //Setters
        public Builder withTitle(String title){
            newTestCase.title = title;
            return this;
        }

        public Builder withEstimate(int estimate){
            newTestCase.estimate = estimate;
            return this;
        }

        public Builder withReference(String reference){
            newTestCase.reference = reference;
            return this;
        }

        //метод build
        public TestCase build(){
            return newTestCase;
        }
    }

}
