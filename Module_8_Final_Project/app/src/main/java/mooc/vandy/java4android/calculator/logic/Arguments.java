package mooc.vandy.java4android.calculator.logic;

/**
 * Created by Patrick Hill on 5/21/16.
 */
public class Arguments<Number1,Number2> {
    /*  Here I'm using this class using generics to take the arguments
        Because I want to account for the double in division
        So I want to be able to set to integer or double
     */
    private Number1 mNumber1;
    private Number2 mNumber2;
    //getters and setters
    public Number1 getNumber1() {
        return mNumber1;
    }
    public void setNumber1(Number1 number1) {
        mNumber1 = number1;
    }
    public Number2 getNumber2() {
        return mNumber2;
    }
    public void setNumber2(Number2 number2) {
        mNumber2 = number2;
    }
}
