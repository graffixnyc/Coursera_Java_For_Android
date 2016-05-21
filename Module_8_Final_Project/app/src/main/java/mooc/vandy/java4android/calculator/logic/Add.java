package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {
    //type of integer for the class parameters
    Arguments<Integer,Integer> arguments=new Arguments<Integer, Integer>();
    ///  Constructor- no default one needed
    public Add(int num1, int num2){
        arguments.setNumber1(num1);
        arguments.setNumber2(num2);
    }
    //We only want to get the result, not set the result. This also does the calculation
    public int getResult() {
        return arguments.getNumber1() + arguments.getNumber2();
    }
}
