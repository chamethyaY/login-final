//here the UserRegistrationDto also same as the entity class only difference i swe do n ot include the id.because it is auto  generated.
//here dto is the one who carried data from controller layer to the service layer.
package com.example.loginsecurity.web;

public class UserRegistrationDto {


    private String firstName;
    private String lastname;
    private String email;
    private String password;

    UserRegistrationDto(){

    }


    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getLastname() {
        return lastname;
    }

    public UserRegistrationDto(String firstName,String lastname,String email,String password) {
        this.firstName = firstName;
        this.lastname=lastname;
        this.email=email;
        this.password=password;
            }
}
