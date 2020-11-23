package models;


import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class ProjectLombokBuilder {

    private String name;
    private String announcement;
    private boolean isShowAnnouncement;
    private int typeOfProject;
    private boolean isCompleted;
}
