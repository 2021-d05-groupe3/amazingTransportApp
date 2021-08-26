package com.example.disturbingparadox.collaborateur;

public class CollaborateurDto {
    String name;
    String firstName;
    String email;

    

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getFirstName() {
        return firstName;
    }



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public String toString() {
        return "CollaborateurDto [email=" + email + ", firstName=" + firstName + ", name=" + name + "]";
    }

    
    
}
