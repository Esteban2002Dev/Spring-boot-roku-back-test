package com.esteban.roku_back_test.model;

public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /**
     * If we dont add the getters and setters, the thymeleaf template wont be able to access the properties of the object, and will throw an error.
     * This is because thymeleaf uses reflection to access the properties of the object, and if there are no getters and setters, it wont be able to find them.
     */
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
