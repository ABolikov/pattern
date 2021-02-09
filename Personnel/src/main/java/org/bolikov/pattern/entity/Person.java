package org.bolikov.pattern.entity;

public class Person {

    private String uuid;
    private String login;
    private String password;
    private String email;

    public Person() {
    }

    public Person(String uuid, String login, String password, String email) {
        this.uuid = uuid;
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getUuid() {
        return uuid;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String uuid) {
        this.uuid = uuid;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
