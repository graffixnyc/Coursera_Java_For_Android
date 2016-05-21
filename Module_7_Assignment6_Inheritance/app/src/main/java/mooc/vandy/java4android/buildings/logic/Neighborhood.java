package mooc.vandy.java4android.buildings.logic;

import mooc.vandy.java4android.buildings.ui.OutputInterface;

/**
 * This Neighborhood utility class provides static helper methods the
 * print a Building List and calculate the area of a Building list.
 * A utility class in Java should always be final and have a private
 * constructor, as per https://en.wikipedia.org/wiki/Utility_class.
 */
public final class Neighborhood {

    // TODO - Put your code here.
    public static void print(Building[] buildings, String header, OutputInterface out){

    }
    public static int calcArea(Building[] buildings){
        int totalArea=0;
        for (Building b:buildings){
            totalArea+=b.calcBuildingArea();
        }
        return totalArea;
    }
    
}
