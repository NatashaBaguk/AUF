package models;


import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Data
@Builder
@EqualsAndHashCode
@Getter

public class ProjectGson {
    int id;
    String name;
    String announcement;
    boolean show_announcement;
    boolean is_completed;
    String completed_on;
    int suite_mode;
    String url;
}
