package dev.naman.productservice.InheritanceByMe.JoinTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name="jt_student")
@PrimaryKeyJoinColumn(name = "user_id")
public class Student extends User {
    private int psp;
    private int attendance;
}
