package models;

import lombok.Builder;
import lombok.Data;


@Data
@Builder

public class UserGson {
    String name;
    int id;
    String email;
    boolean is_active;
    int role_id;
    String role;
}
