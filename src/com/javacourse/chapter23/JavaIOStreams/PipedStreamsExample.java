package com.javacourse.chapter23.JavaIOStreams;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Producer extends Thread {
    private OutputStream os;
    public Producer(OutputStream outputStream){
        this.os = outputStream;
    }
    @Override
    public void run() {
        int count = 1;
        while (true){
            try{
                os.write(count); // there is no guaranty that data is sent on the other side
                os.flush(); // so to send the data we use flush
                System.out.println("Producer: "+count);
                count++;
                Thread.sleep(1000);
            }
            catch (Exception e){}
        }
    }
}

class Consumer extends Thread {
    private InputStream is;
    public Consumer(InputStream inputStream){
        this.is = inputStream;
    }
    @Override
    public void run(){
        int x;
        while (true) {
            try{
                x = is.read();
                System.out.println("Consumer: "+x);
                System.out.flush();
                Thread.sleep(1000);
            }
            catch (Exception e){}
        }
    }
}

public class PipedStreamsExample {
    public static void main(String[] args){
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        try{
            // both the ways are correct :-)
            pis.connect(pos);
            // pos.connect(pis);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        Consumer c = new Consumer(pis);
        Producer p = new Producer(pos);

        p.start();
        c.start();
    }
}
