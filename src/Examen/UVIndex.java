package Examen;

public class UVIndex {
    public void UVinfo(Forecast x, WeatherStats y) {
        String yy=y.calculoEstadistica(x.getClima().getHumedad(), x.getClima().getTemperatura());
        if ( yy== "a")
            System.out.println("Segun los pronosticos el dia tendra UV low");
        else if (yy == "b")
            System.out.println("Segun los pronosticos el dia tendra UV medium");
        else
            if (yy == "c")
                System.out.println("Segun los pronosticos el dia tendra UV high");
            else if (yy == "d")
                System.out.println("Segun los pronosticos el dia tendra UV medium");
            else
                System.out.println("No esta entrando");

    }
}
