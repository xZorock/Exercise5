package it.develhope.Exercise5;

public class Student extends CollegePerson implements ILearningPerson {

    private int academicYear;

    public Student(String name, String surname, int collegeId, int academicYear){

        this.setName(name);
        this.setSurname(surname);
        this.setCollegeId(collegeId);
        this.academicYear=academicYear;
    }

    @Override
    public void studyAtHome() {

        System.out.println("The student does study at home");

    }
}
