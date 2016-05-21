package mooc.vandy.java4android.birthdayprob.logic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import mooc.vandy.java4android.birthdayprob.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early Android interactions.
 * Designing the assignments this way allows you to first learn key 'Java' features without
 * having to beforehand learn the complexities of Android.
 *
 */
public class Logic implements LogicInterface {

    // This is a String to be used in Logging (if/when you decide you need it for debugging)
    public static final String TAG = Logic.class.getName();

    /*
    * This is the variable that stores our OutputInterface instance.
    * <p>
    * This is how we will interact with the User Interface [MainActivity.java].
    * <p>
    * it is called 'out' because it is where we 'out-put' our results. (It is also the 'in-put'
    * from where we get values from, but it only needs 1 name, and 'out' is good enough)
    */
    OutputInterface out;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance
     * (which implements [OutputInterface]) to 'out'
     */
    public Logic(OutputInterface _out){
        out = _out;
    }

    /**
     * This is the method that will (eventually) get called when the on-screen button labelled
     * 'Process...' is pressed.
     */
    public void process() {

        int groupSize = out.getSize();
        int simulationCount = out.getCount();

        if (groupSize < 2 || groupSize > 365) {
            out.makeAlertToast("Group Size must be in the range 2-365.");
            return;
        }
        if (simulationCount <= 0) {
            out.makeAlertToast("Simulation Count must be positive.");
            return;
        }

        double percent = calculate(groupSize, simulationCount);

        // report results
        out.println("For a group of " + groupSize + " people, the percentage");
        out.println("of times that two people share the same birthday is");
        out.println(String.format("%.2f%% of the time.", percent));

    }

    /**
     * This is the method that actually does the calculations.
     * <p>
     * We provide you this method that way we can test it with unit testing.
     */
    public double calculate(int size, int count) {
        int totalRunsWithDup=0;
        // TODO -- add your code here
        for (int i=0;i<count;i++){
           if (doOneTrial(size,i+1)==1){
               totalRunsWithDup++;
           }
        }
        return (double)totalRunsWithDup/count*100;
    }

    // TODO -- add your code here
    private static int doOneTrial(int size,int simNum) {
        Set<Integer> birthdays = new HashSet<Integer>();
        Random rnd = new Random();
        rnd.setSeed(simNum);
        for (int i=0;i<size;i++){
            if (!birthdays.add(rnd.nextInt(365))) {
                return 1;

            }
        }
        return 0;
    }

     
}
