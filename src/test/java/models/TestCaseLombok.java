package models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class TestCaseLombok {

    //1. описание private переменные, которые нам будут нужны для этой сущности
    private String title;
    private int estimate;
    private String reference;
}
