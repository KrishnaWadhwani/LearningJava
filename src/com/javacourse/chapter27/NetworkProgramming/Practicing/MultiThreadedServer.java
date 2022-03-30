package com.javacourse.chapter27.NetworkProgramming.Practicing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.Scanner;

public class MultiThreadedServer extends Thread {
    Socket socket;
    static int count = 1;
    public MultiThreadedServer(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run(){
        try{
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintStream toClient = new PrintStream(socket.getOutputStream());

            String msg;
            do{
                msg = fromClient.readLine();
                toClient.println(msg);
                System.out.println("Message sent to Client: "+msg);
            }
            while (!msg.matches("end"));
        }
        catch (IOException e){

        }
    }
    public static void main(String[] args){
        try{
            ServerSocket serverSocket = new ServerSocket(6000);
            Socket socket;
            MultiThreadedServer multiThreadedServer;

            do {
                socket = serverSocket.accept();
                multiThreadedServer = new MultiThreadedServer(socket);
                multiThreadedServer.start();
                System.out.println("Client "+(count++)+" Connected");
            }while (true);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

class MultiClients{
    public static void main(String[] args){
        try{
            Socket socket = new Socket("192.168.29.195", 6000);
            Scanner scin = new Scanner(System.in);
            BufferedReader fromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintStream toServer = new PrintStream(socket.getOutputStream());
            String msg;
            do{
                msg = scin.nextLine();
                toServer.println(msg);
                System.out.println("Message From Server: "+fromServer.readLine());
            }
            while (!msg.matches("end"));
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}