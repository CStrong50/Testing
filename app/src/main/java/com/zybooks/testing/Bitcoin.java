package com.zybooks.testing;


import android.widget.RadioGroup;
import android.widget.TextView;

public class Bitcoin {
    public static double testUsdToBitcoin() {
        return 18165.90;
    }

    public static double testConvertBitcoinToUSD() {
        return 0.000055;
    }

    //Bitcoins to Dollars
    //Dollars to Bitcoins
    //1 Bitcoin = 18,165.90 dollars
    double bitcoinToDollars (double x) {return x* 0.000055;}
    double dollarsToBitcoin (double x) {return x * 18165.90;}

    void calculate(double input, TextView calc, RadioGroup convert) {

    }

}