package com.example.ApartFromStreams;

public class SingletonClass {

    private static volatile SingletonClass instance;

    private SingletonClass(){

    }

    public SingletonClass getInstance(){
        if(instance!=null){
            synchronized (this) {
                instance = new SingletonClass();
            }
        }
        return instance;
    }
}
