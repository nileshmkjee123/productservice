package dev.naman.productservice.InheritanceByMe.TablePerClass;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name="tpc_mentor")
public class Mentor extends User {
    private String mail;
    private int noOfMentees;
}
