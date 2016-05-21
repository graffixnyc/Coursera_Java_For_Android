package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        // Varilable to hold result

        double divResult=0;
        //Call method depending on which operation
        switch (operation){
            case 1:
                //Calling the constructor that gets both values passed in as parameters
                Add myAdd=new Add(argumentOne,argumentTwo);
                mOut.print(Integer.toString(myAdd.getResult()));
                break;
            case 2:
                Subtract mySub=new Subtract(argumentOne,argumentTwo);
                mOut.print(Integer.toString(mySub.getResult()));
                break;
            case 3:
                Multiply myMul=new Multiply(argumentOne,argumentTwo);
                mOut.print(Integer.toString(myMul.getResult()));
                break;
            case 4:
                //Check for division by zero
                if (argumentTwo==0){
                    mOut.print("Division by Zero");
                }
                else{
                    Divide myDiv=new Divide(argumentOne,argumentTwo);
                    mOut.print(Double.toString(myDiv.getResult()));
                    break;
                }


        }
    }
}
