package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide{
    //type of double for the class parameters
    Arguments<Double,Double> arguments=new Arguments<Double, Double>();
    //  Constructor- no default one needed
    public Divide(double num1, double num2){
        arguments.setNumber1(num1);
        arguments.setNumber2(num2);
    }
    //We only want to get the result, not set the result. This also does the calculation
    public double getResult() {
        return arguments.getNumber1() / arguments.getNumber2();
    }
}
