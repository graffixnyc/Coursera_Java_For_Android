package mooc.vandy.java4android.gate.logic;

public class Gate {

    // Define Static Variables
    public final static int IN = 1;
    public final static int OUT = -1;
    //Define Instance Variables
    private int mSwing;
    private boolean mLocked;
    //Constructor
    public Gate() {
        mSwing = 0;
        mLocked = true;
    }
    //Set the mSwing instance variable to the direction passed in
    public boolean setSwing(int direction) {
        if (direction==IN || direction==OUT){
            mSwing=direction;
            return true;
        } else {
            return false;
        }
    }
    //Open the gate
    public boolean open(int direction) {
        if (setSwing(direction)){
            mLocked=false;
            return true;
        } else{
            return false;
        }
    }
    //Close the gate
    public void close() {
        mSwing=0;
        mLocked=true;
    }
    //Check if gate is locked
    public boolean isLocked(){
        return mLocked;
    }
    //Get the value of mSwing
    public int getSwingDirection() {
        return mSwing;
    }
    //Thru method
    public int thru(int count)
    {
        switch (mSwing){
            case IN:
                return count;
            case OUT:
                return -count;
            default:
                return 0;
        }
    }
    //toString overridden
    @Override
    public String toString()
    {
        if(mLocked) {
            return "This gate is locked";
        } else if(!mLocked && mSwing == IN) {
            return "This gate is not locked and swings to enter the pen only";
        } else if(!mLocked && mSwing == OUT) {
            return "This gate is not locked and swings to exit the pen only";
        } else {
            return "This gate is not locked and swings but the swing is not set properly";
        }
    }
}
