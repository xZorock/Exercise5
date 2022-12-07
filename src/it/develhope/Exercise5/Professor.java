package it.develhope.Exercise5;

public class Professor extends CollegePerson implements  ITeachingPerson{

    private String teachesSubject;

    public Professor(String name, String surname, int collegeId, String teachesSubject){

        this.setName(name);
        this.setSurname(surname);
        this.setCollegeId(collegeId);
        this.setTeachesSubject(teachesSubject);

    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("The teacher teaches to other people");
    }

    public String getTeachesSubject() {
        return teachesSubject;
    }

    public void setTeachesSubject(String teachesSubject) {
        this.teachesSubject = teachesSubject;
    }
}
