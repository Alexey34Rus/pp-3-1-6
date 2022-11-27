package ru.spiridonov.pp316.model;


import lombok.AllArgsConstructor;




@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private String lastName;
    private Byte age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public User() {

    }

    public String toString() {
        return String.format("{id=%d, name=%s, lastName=%s, age=%d}", id, name, lastName, age);
    }
}
