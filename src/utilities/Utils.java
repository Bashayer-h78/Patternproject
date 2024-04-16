package utilities;

import java.util.Random;

public class Utils {


    public static long randLong(long min, long max) {
        Random rand = new Random();
        return min + (long)(rand.nextDouble()*(max - min));
    }
    public static int randInt(int min, int max) {
        Random rand = new Random();
        return  rand.nextInt((max - min) + 1) + min;
    }
}