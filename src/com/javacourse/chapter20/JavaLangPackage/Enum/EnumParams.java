package com.javacourse.chapter20.JavaLangPackage.Enum;

enum StateOfThread {
    NEW("start()"), READY("run()"), RUNNING("end()"), TERMINATED("");
    private String method;
    private StateOfThread(String methodToGoToNextState){
        this.method = methodToGoToNextState;
    }
    public String getMethodToGoToNextState(){
        return method;
    }
}

public class EnumParams {
    public static void main(String[] args){
        StateOfThread stateOfThread = StateOfThread.READY;
        System.out.println(stateOfThread.getMethodToGoToNextState());
    }
}
