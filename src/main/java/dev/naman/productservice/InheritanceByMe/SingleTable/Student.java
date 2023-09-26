package dev.naman.productservice.InheritanceByMe.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name="st_student")
@DiscriminatorValue("1")
public class Student extends User {
    private int psp;
    private int attendance;
}
