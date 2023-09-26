package dev.naman.productservice.InheritanceByMe.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name="st_mentor")
@DiscriminatorValue("2")
public class Mentor extends User {
    private String mail;
    private int noOfMentees;
}
