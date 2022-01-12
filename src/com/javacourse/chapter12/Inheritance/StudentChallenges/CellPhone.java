package com.javacourse.chapter12.Inheritance.StudentChallenges;

import java.util.Arrays;

class iPhoneX{
    private String IMEI;
    private String[] features;
    public iPhoneX(String IMEI, String[] features){
        this.IMEI = IMEI;
        this.features = features;
    }

    public String getIMEI() {
        return IMEI;
    }

    public String[] getFeatures() {
        return features;
    }
}
class iPhoneXS extends iPhoneX{
    public iPhoneXS(String IMEI, String[] features) {
        super(IMEI, features);
    }
}
public class CellPhone {
    public static void main(String[] args){
        iPhoneXS iPhoneXS = new iPhoneXS("32165456t4w", new String[] {"Camera", "No Charger", "Fast"});
        iPhoneXS iPhoneX = new iPhoneXS("32165456t4w", new String[] {"Camera", "Fast"});
        System.out.println(Arrays.toString(iPhoneXS.getFeatures()));
        System.out.println(iPhoneXS.getIMEI());
        System.out.println(Arrays.toString(iPhoneX.getFeatures()));
        System.out.println(iPhoneX.getIMEI());
    }
}
