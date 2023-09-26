package dev.naman.productservice.InheritanceByMe.SingleTable;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name="st_user")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="user_type",
        discriminatorType = DiscriminatorType.INTEGER)
@Getter
@Setter
public class User {
    @Id
    private int userId;
    private String name;
}
