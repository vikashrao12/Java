package in.Interface;

public abstract class vehicle implements Transport {    // use interface then write the implements and then interface name
    private int noOfTier;

    public void getSetGo(){
        System.out.println("Going to place........");
    }

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
