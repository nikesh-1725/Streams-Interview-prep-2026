package com.example.MediumWebsite;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockSenarioQuestion{
    public static void main(String[] args) {

        Lock lock=new ReentrantLock();

        accessResource(lock);


    }

    private static void accessResource(Lock lock) {
        lock.lock();

        try {
            Thread.sleep(100);
            accessAnotherResouce(lock);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }

    }

    private static void accessAnotherResouce(Lock lock) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
