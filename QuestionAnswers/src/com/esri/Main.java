package com.esri;

public class Main {

    public static void main(String[] args) {
	// write your code here

        float dd = degreeDifference(8, 15);
        System.out.println(dd);
    }

    public static float degreeDifference(int hour, int minute) {
        final float degreesInClock = 360;
        final float degreesInMinute = 6;
        final float degreesInHour = 30;

        float angleOfHour = (30*hour) + (degreesInHour*minute/60);
        float angleOfMinute = (degreesInMinute*minute);

        float angleDifference = Math.abs(angleOfHour-angleOfMinute);
        if (angleDifference > 180) {
            angleDifference = 360 - angleDifference;
        }

        return angleDifference;
    }
}
