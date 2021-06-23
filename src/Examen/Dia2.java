package Examen;

public class Dia2 implements Observer{
    CurrentConditions clima;
    Forecast forecast;
    WeatherStats weatherStats;
    public Dia2(){
    }
    @Override
    public void update(Forecast x, WeatherStats y) {
        clima=x.getClima();
        forecast=x;
        weatherStats=y;
        System.out.println("Condiciones del Martes: ");
        System.out.println(clima.climaBase());
        System.out.println("Pronostico: ");
        forecast.pronosticoSimple();
        System.out.println("Estadisticas: ");
        weatherStats.calculoEstadistica(clima.getHumedad(), clima.getTemperatura());
    }
}
