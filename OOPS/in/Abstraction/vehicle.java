package in.Abstraction;

public abstract class vehicle {            //abstract is use for no one can create the object without abstract create an object
                                            // go to the testAbstract class and see
    private int noOfTier;

    public abstract void startSound();      // this is the public method

    public vehicle(int noOfTier) {
        this.noOfTier = noOfTier;
    }

    public int getNoOfTier() {
        return noOfTier;
    }

    public void setNoOfTier(int noOfTier) {
        this.noOfTier = noOfTier;
    }

    public void commute(){
        System.out.println("going..............");
    }
}
