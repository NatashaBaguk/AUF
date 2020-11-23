package models;


import lombok.Builder;
import lombok.Data;

import java.nio.file.FileStore;


@Data
@Builder
public class ProjectLombokBuilder {
    private String name;
    private String announcement;
    private boolean isShowAnnouncementFlag;
    private int typeOfProject;
    private boolean isCompleted;


}