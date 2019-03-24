package sda.Obserwator;

import java.util.ArrayList;
import java.util.List;

public class TemperatureProvider {

    //Zaimplementuj prosty system informujący o alarmach pogodowych.
    //Utwórz klasę reprezentującą temperaturę powietrza.
    //W klasie tej dodaj metodę pozwalającą ustawić aktualną wartość.

 private List<Observer> observers = new ArrayList<>();
 private Double temperature;

 public void setTemperature(Double temperature){
     this.temperature = temperature;
     execute();
 }

 public Double getTemperature() {
     return temperature;
 }

 public void add (Observer observer) {
     observers.add(observer);
 }

 public void remove (Observer observer) {
     observers.remove(observer);
 }

 public void execute() {
     for (Observer observer: observers) {
         observer.update();
     }
 }


}
