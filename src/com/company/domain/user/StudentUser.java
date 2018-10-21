package com.company.domain.user;

import java.util.Objects;

public class StudentUser {

    private int id;
    private String name;
    private String surname;
    private int age;
	private String docType;

    public StudentUser(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
	
	public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
				", docType=" + docType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentUser)) return false;
        StudentUser that = (StudentUser) o;
        return getId() == that.getId() &&
            getAge() == that.getAge() &&
            Objects.equals(getName(), that.getName()) &&
            Objects.equals(getSurname(), that.getSurname()) &&
            Objects.equals(getDocType(), that.getDocType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSurname(), getAge(), getDocType());
    }
}
