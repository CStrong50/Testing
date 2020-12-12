package com.zybooks.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {
    //Courtney Berson Tice
    //ISYS221-VL1
    //Exam 3- written programming
    //Due December 12, 2020

    //Create the variable to be linked
    private Bitcoin con = new Bitcoin();
    private RadioButton bitcoinToDollars; //bitcoin to dollars
    private RadioButton dollarsToBitcoin; //dollars to Bitcoins
    private RadioGroup conversions; //name of the radiogroup
    private TextView result; //displayed after the "calculate" button has been pushed
    private EditText input; //what the user is entering


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //linking variables to activity_main.xml
        conversions = findViewById(R.id.conversion);
        input = findViewById(R.id.input);
        input.setText("");
        result = findViewById(R.id.result);

        bitcoinToDollars = findViewById(R.id.radioButton_bcToDollars);
        dollarsToBitcoin = findViewById(R.id.radioButton_dollarsTobc);

    }
    //everything happens in this method
    public void calculateClick(View view){

        String currencyString = input.getText().toString();
        int currency =0;
        try {
            currency = Integer.parseInt(currencyString);
        } catch (NumberFormatException ex)
        {
            currency =0;
        }


        //test bitcoin to dollars
        if (conversions.getCheckedRadioButtonId() == bitcoinToDollars.getId()){
            //get the value from the TextEdit field
            String newCurrency = input.getText().toString();
            int outputCurrency = 0;
            //convert the string to a integer, set it to zero if it fails
            try {
                outputCurrency = Integer.parseInt(newCurrency);
            } catch (NumberFormatException ex){
                outputCurrency = 0;
            }
            double convertedValue = con.dollarsToBitcoin(outputCurrency);
            //Converted number format
            NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
            System.out.println(defaultFormat.format(convertedValue));
            //converted to string
            result.setText("$"+(String.valueOf(convertedValue)));
        }
        //test dollars to bitcoin
        if (conversions.getCheckedRadioButtonId() == dollarsToBitcoin.getId()){
            //get the value from the TextEdit field
            String newCurrency = input.getText().toString();
            int outputCurrency = 0;
            //convert the string to a integer, set it to zero if it fails
            try {
                outputCurrency = Integer.parseInt(newCurrency);
            } catch (NumberFormatException ex){
                outputCurrency = 0;
            }
            double convertedValue = con.bitcoinToDollars(outputCurrency);
            //Converted number format
            NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
            System.out.println(defaultFormat.format(convertedValue));
            //converted to string
            result.setText("B "+(String.valueOf(convertedValue)));
        }

    }

}