package models;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
//позволяет создать класс в кот можно установить значения, но поменять нельзя
@Value
@Builder(toBuilder = true)
public class TestCaseLombokBuilder {
    //1. описание private переменные, которые нам будут нужны для этой сущности
    @NonNull
    private String title;
    @Builder.Default
    private int estimate=5;
    private String reference;
}
