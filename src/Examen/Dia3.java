package Examen;

public class Dia3 implements Observer {
    CurrentConditions clima;
    Forecast forecast;
    WeatherStats weatherStats;

    public Dia3() {}

    @Override
    public void update(Forecast x, WeatherStats y) {
        clima = x.getClima();
        forecast = x;
        weatherStats = y;
        System.out.println("\n===================================");
        System.out.println("=====Condiciones del Miercoles=====");
        System.out.println("===================================");
        System.out.println(clima.climaBase());
        forecast.pronosticoSimple();
        weatherStats.calculoEstadistica(clima.getHumedad(), clima.getTemperatura());
    }

    @Override
    public void update(Forecast x, WeatherStats y, UVIndex u, Wind w) {
        clima = x.getClima();
        forecast = x;
        weatherStats = y;
        System.out.println("\n===================================");
        System.out.println("=====Condiciones del Miercoles=====");
        System.out.println("===================================");
        System.out.println(clima.climaBase());
        u.UVinfo(x, y);
        w.windVelocity(x, y);
    }

}
