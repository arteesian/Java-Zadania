package com.company.devices;

import com.company.Human;
import com.company.Sellable;

import java.net.MalformedURLException;
import java.net.URL;

public class Phone extends Device implements Sellable {
    final public Double screenSize;
    final public String operationSystem;

    public String appname;
    public Double version;
    public String serverAddress;
    public String[] applist;

    static URL url = null;
    static {
        try {
            url = new URL(null, "https://docs.oracle.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public Phone(String producer, String model, Double screenSize, String operationSystem, Integer yearOfProduction){
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
    }

    public void installAnApp(String appname){
        this.appname = appname;
    }

    public void installAnApp(String appname, Double version){
        this.appname = appname;
        this.version = version;
    }

    public void installAnApp(String appname, Double version, String serverAddress){
        this.appname = appname;
        this.version = version;
        this.serverAddress = serverAddress;
    }

    public void installAnApp(String[] applist){
        this.applist = applist;
    }

    public void installAnApp(URL url){
        String protocol = url.getProtocol();
        String host = url.getHost();
        Integer port = url.getPort();
        System.out.println("The web application: " + protocol + host + port);
    }

    @Override
    public void turnOn(){
        System.out.println("Put your finger to unlock");
    }

    @Override
    public void sell (Human seller, Human buyer, Double price){
        if(seller.phone != this){
            System.out.println("You can't sell what you don't own");
        }else if(buyer.cash < price){
            System.out.println("You can't afford this");
        }else{
            seller.cash += price;
            buyer.cash -= price;
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println("You have sold a phone.");
        }
    }
}

