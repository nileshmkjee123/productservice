package dev.naman.productservice.InheritanceByMe.MappedSuperClass;

import jakarta.persistence.Entity;

@Entity(name="msc_student")
public class Student extends User{
    private int psp;
    private int attendance;
}
