package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract{
    //type of integer for the class parameters
    Arguments<Integer,Integer> arguments=new Arguments<Integer, Integer>();
    //  Constructor - no default one needed
    public Subtract(int num1, int num2){
        arguments.setNumber1(num1);
        arguments.setNumber2(num2);
    }
    //We only want to get the result, not set the result. This also does the calculation
    public int getResult() {
        return arguments.getNumber1() - arguments.getNumber2();
    }
}
