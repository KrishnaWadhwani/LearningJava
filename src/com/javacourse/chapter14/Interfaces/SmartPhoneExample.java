package com.javacourse.chapter14.Interfaces;

class Phone{
    public void call(){

    }
    public void sms(){

    }
}

interface ICamera{
    void clickPhoto();
    void recordVideo();
}

interface IMusicPlayer{
    void playMusic();
    void stopMusic();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer{

    public SmartPhone(String brandName, String phoneName){
        System.out.println("Purchasing: "+brandName+"'s"+" "+phoneName);
        System.out.println("Jyada Mehenga Hai!, Ghar Chal Ke Apne Saare Apps Ishi Pe Hi Test Karoonga!!!");
    }

    // Camera

    @Override
    public void clickPhoto(){
        System.out.println("Snap! Looks Like Nice Picture Captured");
    }

    @Override
    public void recordVideo(){
        System.out.println("Ofhh! It Is Consuming My Phone's Space, Please Stop!!!");
    }

    // Music Player

    @Override
    public void playMusic(){
        System.out.println("No Lieee...... Dua Lipaaa!!, Baby Ko Bass Pasand Hai");
    }

    @Override
    public void stopMusic(){
        System.out.println("Time Waste, Isse Aacha Kuch Aur Hi Kar Leta!!");
    }

    public void videoCall(String personToCall){
        System.out.println("SmartPhone: Video Calling "+personToCall);
    }

    public void playGame(String gameName){
        System.out.println("Opening "+gameName);
    }

}

public class SmartPhoneExample {
    public static void main(String[] args){
        SmartPhone RedmiNote10S = new SmartPhone("Redmi", "Note 10S");
        RedmiNote10S.playGame("PUBG");
        RedmiNote10S.videoCall("Papaji");
        RedmiNote10S.playMusic();

        ICamera camera = RedmiNote10S;
        camera.clickPhoto();
        camera.recordVideo();

        IMusicPlayer musicPlayer = RedmiNote10S;
        musicPlayer.playMusic();
        musicPlayer.stopMusic();

    }
}
