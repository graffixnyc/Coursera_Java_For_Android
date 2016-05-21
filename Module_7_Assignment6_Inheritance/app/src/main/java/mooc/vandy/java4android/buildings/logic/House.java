package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House
        extends Building {

    // TODO - Put your code here.
    private String mOwner;
    private boolean mPool;

    //Overloaded constructors
    public House(int length,int width,int lotLength,int lotWidth){
        super(length,width,lotLength,lotWidth);
    }

    public House(int length,int width,int lotLength,int lotWidth, String owner){
        super(length,width,lotLength,lotWidth);
        mOwner = owner;
    }

    public House(int length,int width,int lotLength,int lotWidth, String owner,boolean pool){
        super(length,width,lotLength,lotWidth);
        mOwner = owner;
        mPool = pool;
    }

    //method to set owners name
    public void setOwner(String mOwner) {
        this.mOwner = mOwner;
    }

    //method to set if house has a pool
    public void setPool(boolean mPool) {
        this.mPool = mPool;
    }

    //method to get owners name
    public String getOwner() {
        return mOwner;
    }

    //method to know if house has a pool
    public boolean hasPool(){
        return mPool;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Building){
            if(this.calcBuildingArea()==((House) o).calcBuildingArea() && this.mPool==((House) o).mPool)
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String owner="n/a";
        if(mOwner!=null){
            owner = mOwner;
        }
        String poolStr="";
        if(hasPool()){
            poolStr="has a pool";
        }
        return "Owner: "+owner+";"+ poolStr+ " " + super.toString();
    }
}
