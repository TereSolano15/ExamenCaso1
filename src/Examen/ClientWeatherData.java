package Examen;

public class ClientWeatherData {

    public static void main(String[] args) {
        System.out.println("Funcion de las 3" + "\n");

    IClima a1 = new CurrentConditions(new Forecast(new WeatherStats(new ClimaBase(24,22,31))));

    a1.agregarElemento();

    System.out.println("Funcion con 2 primer prueba" + "\n");

    IClima a2 = new Forecast(new CurrentConditions(new ClimaBase(24,22,31)));

    a2.agregarElemento();

    System.out.println("Funcion con 2 segunda prueba" + "\n");

    IClima a3 = new WeatherStats(new Forecast(new CurrentConditions(new ClimaBase(24,22,31))));

    a3.agregarElemento();

    }

    /*
    Explicacion: el porque del uso del patron decorador, sencillo, el app pide que esta se pueda extender a futuros
    clientes y que esto sea simplemente conectandose directamente, esto permite que el cliente que quiera crear una pantalla
    con añadidos tomando como base el modelo base de la aplicacion sea sumamente sencillo y rapido.

     */

}
