package io.github.vcsdailiusrepo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SimpleMath {

    public static int random(int min, int max) {
        double r = Math.random();
        return (int) (r * (max - min)) + min;
    }

    public static double random(double min, double max) {
        double r = Math.random();
        return (r * (max - min)) + min;
    }

    public static double random(float min, float max) {
        double r = Math.random();
        return (float) (r * (max - min)) + min;
    }

    public static String round(double number, int decimal) {
        BigDecimal round = BigDecimal.valueOf(number);
        return round.setScale(decimal, RoundingMode.HALF_EVEN).toString();
    }

    public static String round(float number, int decimal) {
        BigDecimal round = BigDecimal.valueOf(number);
        return round.setScale(decimal, RoundingMode.HALF_EVEN).toString();
    }

    public static String round(String number, int decimal) {
        return new BigDecimal(number).setScale(decimal, RoundingMode.HALF_EVEN).toString();
    }
}
