package models;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Data
@Builder(toBuilder = true)
public class TestCaseLombokBuilder {
    //1. описание private переменных которые нам будут нужны для этой сущности
    private String title;
    private int estimate;
    private String reference;


}
