package Examen;

public class Main {

    public static void main(String[] args) {
        CurrentConditions monday=new CurrentConditions(28,1034,86);
        CurrentConditions tuesday=new CurrentConditions(18,1000,94);
        CurrentConditions wednesday=new CurrentConditions(23,1012,89);
        Forecast forecastM=new Forecast(monday);
        Forecast forecastMa=new Forecast(tuesday);
        Forecast forecastMie=new Forecast(wednesday);
        WeatherStats z=new WeatherStats();
        Dia1 dia1 = new Dia1();
        Dia2 dia2 = new Dia2();
        Dia3 dia3 = new Dia3();
        MessagePublisher p = new MessagePublisher();

        p.attach(dia1);

        p.notifyUpdate(forecastM,z);   //s1 and s2 will receive the update
        p.attach(dia2);
        p.detach(dia1);
        p.notifyUpdate(forecastMa, z);
        p.detach(dia2);
        p.attach(dia3);
        p.notifyUpdate(forecastMie,z);


    }


}
