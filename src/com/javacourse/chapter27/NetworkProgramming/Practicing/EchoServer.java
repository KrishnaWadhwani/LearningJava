package com.javacourse.chapter27.NetworkProgramming.Practicing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    public static void main(String[] args){
        try{
            ServerSocket serverSocket = new ServerSocket(4000);
            Socket socket = serverSocket.accept();
            System.out.println("Client Connected");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintStream printStream = new PrintStream(socket.getOutputStream());
            String msg;
            StringBuilder builder;
            do {
                msg = bufferedReader.readLine();
                System.out.println("Client is saying this: "+msg);
                if(msg.equalsIgnoreCase("Krishna is the best programmer")){
                    printStream.println("Everyone knows that!");
                }
                if(msg.endsWith("[reverse]")){
                    builder = new StringBuilder(msg.replace("[reverse]", ""));
                    printStream.println(builder.reverse());
                }
                else{
                    printStream.println(msg); // this method is sending data to buffered reader of Client
                }
            }
            while (!msg.matches("end"));

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

class Client{
    public static void main(String[] args){
        try{
            Socket socket = new Socket("192.168.29.195", 4000);

            Scanner scin = new Scanner(System.in);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintStream printStream = new PrintStream(socket.getOutputStream());

            String msg;
            do{
                msg = scin.nextLine();
                printStream.println(msg);
                System.out.println("Reply from the server: "+reader.readLine());
            }
            while (!msg.matches("end"));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}