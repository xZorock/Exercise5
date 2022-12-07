package it.develhope.Exercise5;

public class CollegePerson {

     private String name;
     private String surname;
     private int collegeId;

    public void goToCollege(){
        System.out.println("The College Person is: " +getName()+ " " + getSurname());
        System.out.println("College ID: " + getCollegeId());
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

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }
}

