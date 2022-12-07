package it.develhope.Exercise5;

public class Assistant extends CollegePerson implements ITeachingPerson, ILearningPerson {

    private boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int collegeId, boolean isGoingToBeAPhD){
        this.setName(name);
        this.setSurname(surname);
        this.setCollegeId(collegeId);
        this.isGoingToBeAPhD=isGoingToBeAPhD;

    }



    @Override
    public void studyAtHome() {
        System.out.println("The Assistant does not study at home");

    }

    @Override
    public void teachToOtherPeople() {

        System.out.println("The Assistant teaches to other people");

    }
}
