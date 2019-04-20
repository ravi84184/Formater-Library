package com.nikdemo.formaterlibrary;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyConversion {

    public static String currencyConvert(double amount ,Locale country) {
        NumberFormat n = NumberFormat.getCurrencyInstance(country);
        return n.format(amount);
    }
    public static String currencyConvert(double amount) {
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.getDefault());
        return n.format(amount);
    }
}
