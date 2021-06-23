package Examen;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {
     
    private List<Observer> observers = new ArrayList<>();
 
    @Override
    public void attach(Observer o) {
        observers.add(o);
    }
 
    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }
 
    @Override
    public void notifyUpdate(Forecast x, WeatherStats y) {
        for(Observer o: observers) {
            o.update(x,y);
        }
    }
    public void notifyUpdate(Forecast x, WeatherStats y, UVIndex t, Wind r) {
        for(Observer o: observers) {
            o.update(x,y,t,r);
        }
    }
}