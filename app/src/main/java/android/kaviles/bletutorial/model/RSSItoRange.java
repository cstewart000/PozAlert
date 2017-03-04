package android.kaviles.bletutorial.model;

/**
 * Created by Cam on 4/03/2017.
 *
 * http://stackoverflow.com/questions/22784516/estimating-beacon-proximity-distance-based-on-rssi-bluetooth-le
 *
 * Converts RSSI value to range
 */




public class RSSItoRange {

    private static int txPower = 4;
    private static double distance;
    private static final int signalPropogationConstant =2;

    public static void setxPower(int txPower) {
        txPower = txPower;
    }

    public static double getDistanceFromRssi(int rssi){

        //RSSI = -10nlogd + A;
        distance = Math.pow(10d, ((double) txPower - rssi) / (10 * 2));
        return distance;
    }


}
