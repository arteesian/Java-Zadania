package com.company.devices;

import com.company.Human;
import com.company.Sellable;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;

public class Phone extends Device implements Sellable {
    final public Double screenSize;
    final public String operationSystem;

    public String appname;
    public Double version;
    public String serverAddress;
    public String[] applist;
    public Human human;

    private static final String DEFAULT_APP_SERVER_URL = "http://127.0.0.1/";
    private static final String DEFAULT_PROTOCOL = "1080";
    private static final String DEFAULT_VERSION_NAME = "1.1.5";

    HashSet<Application> happ = new HashSet<Application>();
    Application application;

    public Phone(String producer, String model, Double screenSize, String operationSystem, Integer yearOfProduction){
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
    }

    public void installApplication(Application app){
        if(human.cash >= app.price){
            happ.add(app);
            human.cash -= app.price;
            System.out.println("An application has been successfully installed.");
        }else{
            System.out.println("You don't have enough money");
        }
    }

    public boolean isInstalled (Application app){
        return happ.contains(app);
    }

    public boolean isInstalled (String name){
        for(Application app : happ){
            if(app.name.equals(name)){
                return true;
            }
        }
        return false;
    }

    public void showFreeApps(){
        System.out.println("Free apps:");
        for(Application app : happ){
            if(app.price == 0.0){
                System.out.println(app.name);
            }
        }
    }

    public void showAppsPrice(){
        for(Application app : happ){
            System.out.println(app.name + ": " + app.price);
        }
    }

    public void sortByName(){
        ArrayList<Application> applist = new ArrayList<>(happ);
        applist.sort(Application.sortByName);
        for(Application app : applist){
            System.out.println(app.name);
        }
    }

    public void sortByPrice(){
        ArrayList<Application> applist = new ArrayList<>(happ);
        applist.sort(Application.sortByPrice);
        for(Application app : applist){
            System.out.println(app.name + ": " + app.price);
        }
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

