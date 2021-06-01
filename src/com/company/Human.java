package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.CarYearProductionComparator;
import com.company.devices.Phone;

import java.util.Arrays;

public class Human{
    public String name, surname;
    public String fullname;
    public Animal pet;
    private Car car;
    public Car garage[];
    public Phone phone;
    private Double salary;
    public Double cash;

    public Human(String name, String surname, Integer size){
        this.name = name;
        this.surname = surname;
        this.garage = new Car[size];
        this.fullname = name + " " + surname;
    }

    public Double getSalary() {
        if (salary != null) {
            System.out.println(salary);
            return salary;
        } else {
            System.out.println("You don't have a salary");
            return null;
        }
    }

    public void setSalary(Double salary){
        if(salary < 0){
            System.out.println("The payment is below 0");
        }else{
            System.out.println("The new data has been sent to the accounting system");
            System.out.println("Do not forget to pick up the annex to the contract from Mrs. Hania from HR");
            System.out.println("ZUS and US already know about the change in payment");
            this.salary = salary;
        }
    }

    public Car getCar(Integer parkslot)
    {
        return garage[parkslot];
    }

    public void setCar (Car car){
        if(getSalary() > car.value){
            for (int i = 0; i < garage.length; i++){
                if (garage[i] == null){
                    garage[i] = car;
                    addOwner(garage[i]);
                    System.out.println("You took a car to the spot " + i);
                    break;
                }else{
                    System.out.println("This garage spot is already taken");
                }
            }
        }
        else if(getSalary() > (car.value/12)){
            System.out.println("The car can be bought for credit");
            for (int i = 0; i < garage.length; i++){
                if (garage[i] == null){
                    garage[i] = car;
                    addOwner(garage[i]);
                    System.out.println("You took a car to the spot " + i);
                    break;
                }else{
                    System.out.println("This garage spot is already taken");
                }
            }
        }else{
            System.out.println("You cannot afford this car");
        }
    }

    public Double getGarageValue(){
        Double value = 0.0;
        for(int i = 0; i < garage.length; i++){
            if(garage[i].value != null){
                value += garage[i].value;
            }
        }
        return value;
    }

    public boolean hasCar(Car newCar){
        for(Car car : garage){
            if(car == newCar)
                return true;
        }
        return false;
    }

    public boolean hasFreeParkingSlot(){
        for(Car car : garage){
            if(car == null)
                return true;
        }
        return false;
    }

    public boolean isLastOwner(Car car){
        if(car.ownerlist.get(car.ownerlist.size() - 1) == fullname) {
            return true;
        }
        return false;
    }

    public void sortCar(){
        Arrays.sort(garage, new CarYearProductionComparator());
    }

    public void removeCar(Car car){
        for(int i = 0; i < garage.length; i++){
            if(garage[i] == car)
                garage[i] = null;
        }
    }

    public void addCar(Car newCar){
        for(int i = 0; i < garage.length; i++){
            if(garage[i] == null){
                garage[i] = newCar;
                return;
            }
        }
    }

    public void addOwner(Car car){
        car.ownerlist.add(fullname);
    }

    @Override
    public String toString(){
        return "Pet: " + pet + ", car: " + car + ", salary: " + salary;
    }
}
