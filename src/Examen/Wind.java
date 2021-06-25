package Examen;

public class Wind {
    public void windVelocity(Forecast x, WeatherStats y) {
        String caso = x.pronosticoSimple();
        if (caso == "a")
            System.out.println("Segun los pronosticos el dia tendra vientos a 12km/h");
        else if (caso == "b")
            System.out.println("Segun los pronosticos el dia tendra vientos a 20km/h");
        else if (caso == "c")
            System.out.println("Segun los pronosticos el dia tendra vientos a 11km/h");
        else if (caso == "d")
            System.out.println("Segun los pronosticos el dia tendra vientos a 8km/h");
        else
            System.out.println("No esta entrando");
    }
}
