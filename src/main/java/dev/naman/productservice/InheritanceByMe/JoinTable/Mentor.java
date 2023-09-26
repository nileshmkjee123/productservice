package dev.naman.productservice.InheritanceByMe.JoinTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name="jt_mentor")
@PrimaryKeyJoinColumn(name = "user_id")
public class Mentor extends User {
    private String mail;
    private int noOfMentees;
}
