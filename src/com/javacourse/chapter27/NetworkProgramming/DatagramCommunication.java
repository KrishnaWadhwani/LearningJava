package com.javacourse.chapter27.NetworkProgramming;

import java.io.IOException;
import java.net.*;

public class DatagramCommunication {
    public static void main(String[] args){
        try{
            DatagramSocket ds = new DatagramSocket(2001);
            String msg = "Hello World";
            DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getByName("localhost"), 2000);

            ds.send(dp);

            byte[] b = new byte[1024];
            dp = new DatagramPacket(b, 1024);
            ds.receive(dp);

            msg = new String(dp.getData()).trim();
            System.out.println("From Server: "+msg);
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}

class DatagramCommunicationServer {
    public static void main(String[] args){
        try{
            DatagramSocket ds = new DatagramSocket(2000);
            byte[] b = new byte[1024];
            DatagramPacket dp = new DatagramPacket(b, 1024);
            ds.receive(dp);

            String msg = new String(dp.getData()).trim();
            System.out.println("From Client: "+msg);
            StringBuilder builder = new StringBuilder(msg);
            builder.reverse();
            msg = builder.toString();

            dp = new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getByName("localhost"), 2001);

            ds.send(dp);

            ds.close();

        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
