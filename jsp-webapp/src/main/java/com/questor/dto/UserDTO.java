package com.questor.dto;

public class UserDTO {
    private int userid;
    private String username;
    private String password;
    private String name;
    private String email;
    private String country;
    private String town;
    private String bio;

    // Default constructor
    public UserDTO() {}

    // Constructor with all parameters
    public UserDTO(String username, String password, String name, String email, String country, String town, String bio) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.country = country;
        this.town = town;
        this.bio = bio;
    }

    // Getters and setters
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
