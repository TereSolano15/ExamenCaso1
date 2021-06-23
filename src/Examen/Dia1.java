package Examen;

public class Dia1  implements Observer{
    CurrentConditions clima;
    Forecast forecast;
    WeatherStats weatherStats;
    public Dia1(){
    }
    @Override
    public void update(Forecast x, WeatherStats y) {
        clima=x.getClima();
        forecast=x;
        weatherStats=y;
System.out.println("Condiciones del Lunes: ");
System.out.println(clima.climaBase());
        System.out.println("Pronostico: ");
        forecast.pronosticoSimple();
        System.out.println("Estadisticas: ");
weatherStats.calculoEstadistica(clima.getHumedad(), clima.getTemperatura());
    }
}
