package Examen;

public class UVIndex {
    public void UVinfo(Forecast x, WeatherStats y) {
        String calculo = y.calculoEstadistica(x.getClima().getHumedad(), x.getClima().getTemperatura());
        if (calculo == "a")
            System.out.println("Segun los pronosticos el dia tendra UV low");
        else if (calculo == "b")
            System.out.println("Segun los pronosticos el dia tendra UV medium");
        else if (calculo == "c")
            System.out.println("Segun los pronosticos el dia tendra UV high");
        else if (calculo == "d")
            System.out.println("Segun los pronosticos el dia tendra UV medium");
        else
            System.out.println("No esta entrando");

    }
}
