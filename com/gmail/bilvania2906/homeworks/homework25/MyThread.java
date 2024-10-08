package com.gmail.bilvania2906.homeworks.homework25;

public class MyThread extends Thread {

     DataHandler dataHandler; // Оголосимо поле

    public MyThread(String name, DataHandler dataHandler) {
        super(name);
        this.dataHandler = dataHandler;
    }
    @Override
    public void run() {
        dataHandler.getOutput();
    }
    }







