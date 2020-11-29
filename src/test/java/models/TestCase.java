package models;

public class TestCase {
    //1. описание private переменные, которые нам будут нужны для этой сущности
    private String title;
    private int estimate;
    private String reference;

    //3. getters
    public String getTitle() {
        return title;
    }

    public int getEstimate() {
        return estimate;
    }

    public String getReference() {
        return reference;
    }

    //2. создать внутри этого класса public static class Builder
    public static class Builder {
       private TestCase newTestCase;
        //конструктор
        public Builder() {
            newTestCase = new TestCase();
        }

        //setters
        public Builder withTitle(String title) {
            newTestCase.title = title;
            return this;
        }

        public Builder withEstimate(int estimate) {
            newTestCase.estimate = estimate;
            return this;
        }
        public Builder withReference(String reference) {
            newTestCase.reference = reference;
            return this;
        }

        //Build method
        public TestCase build() {
            return newTestCase;
        }
    }
}
