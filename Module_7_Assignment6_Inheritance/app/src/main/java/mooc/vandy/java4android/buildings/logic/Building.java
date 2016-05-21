package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {

    // Instance Variables.
    private int mLength;
    private int mWidth;
    private int mLotLength;
    private int mLotWidth;

    //Constructor
    public Building(int length,int width,int lotLength,int lotWidth){
        mLength = length;
        mWidth = width;
        mLotLength = lotLength;
        mLotWidth = lotWidth;
    }

    //Getters and Setters
    public int getLength() {
        return mLength;
    }
    public int getWidth() {
        return mWidth;
    }
    public int getLotLength() {
        return mLotLength;
    }
    public int getLotWidth() {
        return mLotWidth;
    }
    public void setLength(int mLength) {
        this.mLength = mLength;
    }
    public void setWidth(int mWidth) {
        this.mWidth = mWidth;
    }
    public void setLotLength(int mLotLength) {
        this.mLotLength = mLotLength;
    }
    public void setLotWidth(int mLotWidth) {
        this.mLotWidth = mLotWidth;
    }

    //Methods
    public int calcBuildingArea(){
        return mWidth * mLength;
    }
    public int calcLotArea(){
        return mLotWidth * mLotLength;
    }
    public String toString(){
        if(calcLotArea() > calcBuildingArea()){
            return "has a big open space";
        }else {
            return "";
        }
    }
}