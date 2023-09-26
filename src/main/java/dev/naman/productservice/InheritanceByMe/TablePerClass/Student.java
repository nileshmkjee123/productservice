package dev.naman.productservice.InheritanceByMe.TablePerClass;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name="tpc_student")

public class Student extends User {
    private int psp;
    private int attendance;
}
