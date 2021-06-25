package Examen;

public class Main {

    public static void main(String[] args) {
        CurrentConditions monday = new CurrentConditions(28, 1034, 86);
        CurrentConditions tuesday = new CurrentConditions(18, 1000, 94);
        CurrentConditions wednesday = new CurrentConditions(23, 1012, 89);
        UVIndex uvIndex = new UVIndex();
        Wind wind = new Wind();
        Forecast forecastM = new Forecast(monday);
        Forecast forecastMa = new Forecast(tuesday);
        Forecast forecastMie = new Forecast(wednesday);
        WeatherStats z = new WeatherStats();
        Dia1 dia1 = new Dia1();
        Dia2 dia2 = new Dia2();
        Dia3 dia3 = new Dia3();
        MessagePublisher p = new MessagePublisher();

        p.attach(dia1);
        p.notifyUpdate(forecastM, z);
        p.attach(dia2);
        p.detach(dia1);
        p.notifyUpdate(forecastMa, z);
        p.detach(dia2);
        p.attach(dia3);
        p.notifyUpdate(forecastMie, z);
        p.detach(dia3);
        p.attach(dia1);
        System.out.println("\n*******************************");
        System.out.println("***********HIBRIDOS************");
        System.out.println("*******************************");
        p.notifyUpdate(forecastM, z, uvIndex, wind);
        p.detach(dia1);
        p.attach(dia2);
        p.notifyUpdate(forecastMa, z, uvIndex, wind);
        System.out.println("------------------------------");
    }
    /*                          ----------EXPLICACION-------------
    El patrón Observer se elige pensando en que hay disositivos recolectando los datos del clima
    y hay observadores esperando ese cambio para ejecutar los metodos correpondientes por lo que este
    patrón se aplicó cómo el mas ideal para dicha situación.
    */
}
