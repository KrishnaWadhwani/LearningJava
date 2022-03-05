package com.javacourse.chapter23.JavaIOStreams.StudentChallenges;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class StoreFloats {
    public static void main(String[] args){
        try(
                FileOutputStream fileOutputStream = new FileOutputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/Files/StudentChallenges/StoreAndRetrieveFloats.txt");
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        ){
            float[] f = {59.95f, 56.98f, 54.64f};
            dataOutputStream.writeInt(f.length);
            for (float x : f){
                dataOutputStream.writeFloat(x);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
