package dev.naman.productservice.InheritanceByMe.JoinTable;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "jt_user")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
public class User {
    @Id
    private int userId;
    private String name;
}
