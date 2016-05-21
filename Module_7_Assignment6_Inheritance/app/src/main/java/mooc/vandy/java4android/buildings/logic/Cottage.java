package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage
        extends House {

    // TODO - Put your code here.
    //variable to store if cottage has a second floor
    private boolean mSecondFloor;

    //Overloaded constructors and cottage is a square house
    public Cottage(int dimension,int lotLength,int lotWidth){
        super(dimension,dimension,lotLength,lotWidth);
    }

    public Cottage(int dimension,int lotLength,int lotWidth,String owner,boolean secondFloor){
        super(dimension,dimension,lotLength,lotWidth,owner);
        this.mSecondFloor = secondFloor;
    }

    //method to get if cottage has a second floor
    public boolean hasSecondFloor(){
        return mSecondFloor;
    }

    @Override
    public String toString() {
        String secondFloor = "";
        if(hasSecondFloor()){
            secondFloor = "is a two story cottage";
        }
        return super.toString()+  "; " + secondFloor;
    }

}