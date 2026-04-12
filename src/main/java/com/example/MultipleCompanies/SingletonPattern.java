package com.example.MultipleCompanies;

public class SingletonPattern {

    private static volatile SingletonPattern Instance;

    private SingletonPattern() {
    }

    public SingletonPattern getInstance(){
        synchronized (this){
            if(Instance !=null){
                return new SingletonPattern();
            }
        }
        return Instance;
    }


}
