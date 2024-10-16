package com.gc;

public class RoundingUtil {
    public static double roundUp(double value) {
        return Math.round(value * 20) / 20.0;
    }

}
