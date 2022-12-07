package it.develhope.Exercise5;

public class Start {
    public static void main(String[] args) {

        Student student= new Student("Mario","Rossi",101,2);
        Professor professor= new Professor("Luigi","Valduga",102,"Java");
        Assistant assistant= new Assistant("Carlo","Valentino",103,false);

        student.goToCollege();
        professor.goToCollege();
        assistant.goToCollege();

        student.studyAtHome();
        professor.teachToOtherPeople();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();

    }
}
