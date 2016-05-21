package com.example.accountapp.logic;

import com.example.accountapp.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized.
 * <p/>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG =
        Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p/>
     * This is how we will interact with the User Interface
     * [MainActivity.java].
     * </p>
     * This was renamed to 'mOut' from 'out', as it is in the video
     * lessons, to better match Android/Java naming guidelines.
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p/>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'
     */
    public Logic(OutputInterface out) {
        mOut = out;
    }

    /**
     * This is the method that will ultimately get called when the
     * on-screen button labelled 'Process...' is pressed.
     */
    @Override
    public void process() {
        Account acct1 = new Account("Bill",738924,231.48,mOut);
        Account acct2 = new Account("Sue",894730,mOut);

        acct1.displayBalance();
        acct1.deposit(89.00);
        acct1.displayBalance();

        acct2.displayBalance();
        acct2.withdrawal(300);

        mOut.println(acct1.toString());
    }
}
