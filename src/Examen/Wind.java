package Examen;

public class Wind {
    public void windVelocity(Forecast x, WeatherStats y){
        String xx=x.pronosticoSimple();
        if (xx=="a")
            System.out.println("Segun los pronosticos el dia tendra vientos a 12km/h");
        else
        if (xx=="b")
            System.out.println("Segun los pronosticos el dia tendra vientos a 20km/h");
        else
        if (xx=="c")
            System.out.println("Segun los pronosticos el dia tendra vientos a 11km/h");
        else
        if (xx=="d")
            System.out.println("Segun los pronosticos el dia tendra vientos a 8km/h");
        else
            System.out.println("No esta entrando");
     }
}
