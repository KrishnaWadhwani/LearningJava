package com.javacourse.chapter27.NetworkProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MultiThreadedServer extends Thread {
    Socket socket;

    public MultiThreadedServer(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run(){
        try{
            BufferedReader dataFromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintStream atClientSide = new PrintStream(socket.getOutputStream());

            String msg;
            StringBuilder builder;

            do{
                msg = dataFromClient.readLine();
                builder = new StringBuilder(msg);
                msg = builder.reverse().toString();
                atClientSide.println(msg);
            }
            while (!msg.matches("dne"));
            socket.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        try{
            ServerSocket serverSocket = new ServerSocket(2000);
            Socket socket;
            MultiThreadedServer multiThreadedServer;
            int count = 0;
            do{
                socket = serverSocket.accept();
                multiThreadedServer = new MultiThreadedServer(socket);
                multiThreadedServer.start();
                System.out.println("Connection Accepted and Started, Client Count: "+(++count));
            }while (true);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

class ClientSide{
    public static void main(String[] args){
        try{
            Socket socket = new Socket("localhost", 2000);
            System.out.println("Welcome to client side interface");
            System.out.println("Write something here");
            Scanner scin = new Scanner(System.in);
            BufferedReader fromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintStream onServer = new PrintStream(socket.getOutputStream());
            String msg;
            do {
                msg = scin.nextLine();
                onServer.println(msg);
                System.out.println("Reply From Server: "+fromServer.readLine());
            }
            while (!msg.matches("dne"));
        }

        catch (IOException e){
            System.out.println(e);
        }
    }
}
