package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office extends Building {

    // Instance Variables
    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices =0;

    //Constructors
    public Office(int length,int width,int lotLength,int lotWidth){
        super(length,width,lotLength,lotWidth);
        sTotalOffices++;
    }
    public Office(int length,int width,int lotLength,int lotWidth,String businessName){
        super(length,width,lotLength,lotWidth);
        this.mBusinessName = businessName;
        sTotalOffices++;
    }
    public Office(int length,int width,int lotLength,int lotWidth,String businessName,int parkingSpaces){
        super(length,width,lotLength,lotWidth);
        this.mBusinessName = businessName;
        this.mParkingSpaces = parkingSpaces;
        sTotalOffices++;
    }

    //Getters and Setters
    public String getBusinessName() {
        return mBusinessName;
    }
    public int getParkingSpaces() {
        return mParkingSpaces;
    }
    public void setBusinessName(String mBusinessName) {
        this.mBusinessName = mBusinessName;
    }
    public void setParkingSpaces(int mParkingSpaces) {
        this.mParkingSpaces = mParkingSpaces;
    }

    //Methods
    @Override
    public String toString() {
        String businessName = "unoccupied";
        if(getBusinessName()!=null){
            businessName = getBusinessName() + " ";
        }
        String NumOfParkingSpaces = "";
        if(getParkingSpaces()>0){
            NumOfParkingSpaces = "has "+getParkingSpaces()+" parking spaces";
        }
        return "Business: " + businessName + NumOfParkingSpaces + " (total offices: "+sTotalOffices+")";
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Office){
            if(this.calcBuildingArea()==((Office) obj).calcBuildingArea() && this.mParkingSpaces==((Office) obj).mParkingSpaces){
                return true;
            }
        }
        return false;
    }
}
