package com.zybooks.testing;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.zybooks.testing.Bitcoin;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
       assertEquals(4, 2 + 2);
    }
    public class ConverterUtilTest{
        @Test
        public void testConvertBitcoinToUSD(){
            //a number goes in the parathesis
            double actual = Bitcoin.testConvertBitcoinToUSD();
            //expected value is 18165.90
            double expected = 18165.90;
            assertEquals("Conversion from Bitcoin to Dollars failed",
                    expected,actual, 0.001);
        }
        @Test
        public void testUsdToBitcoin(){
            double actual = Bitcoin.testUsdToBitcoin();
            //expected value is 18165.90
            double expected = 0.000055;
            assertEquals("Conversion from Dollars to Bitcoin failed", expected,
                    actual, 0.001);

        }
    }


}