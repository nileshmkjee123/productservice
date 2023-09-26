package dev.naman.productservice.InheritanceByMe.MappedSuperClass;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class User {
    @Id
    private int userId;
    private String name;
}
