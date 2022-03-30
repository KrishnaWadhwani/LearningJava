package com.javacourse.chapter27.NetworkProgramming;

import java.net.*;
import java.io.*;

public class ReverseEchoServer {
    public static void main(String[] args){
        try{
            ServerSocket serverSocket = new ServerSocket(2000);
            Socket stk = serverSocket.accept();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream ps = new PrintStream(stk.getOutputStream());

            String msg;
            StringBuilder sb;
            do {
                msg = bufferedReader.readLine();
                sb = new StringBuilder(msg);
                sb.reverse();
                msg = sb.toString();
                ps.println(msg);
            }
            while (!msg.equals("dne"));
            stk.close();
            serverSocket.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}


class Client {
    public static void main(String[] args){
        try{
            Socket socket = new Socket("localhost",2000);

            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintStream ps = new PrintStream(socket.getOutputStream());

            String msg;
            do {
                msg = keyboard.readLine();
                ps.println(msg);
                msg = bufferedReader.readLine();
                System.out.println("From Server: "+msg);
            }
            while (!msg.equals("dne"));
            socket.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}