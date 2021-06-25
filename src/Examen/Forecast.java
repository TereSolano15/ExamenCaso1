package Examen;

public class Forecast {
    private CurrentConditions clima;


    public Forecast(CurrentConditions clima) {
        this.clima = clima;
    }

    public CurrentConditions getClima() {
        return clima;
    }

    public String pronosticoSimple() {
        String letra;
        System.out.println("------Pronóstico------ ");
        if (clima.getHumedad() > 90) {
            System.out.println("La probabilidad de lluvia es alta");
            letra = "a";
        } else {
            System.out.println("La probabilidad de lluvia es baja");
            letra = "b";
        }

        if (clima.getTemperatura() > 20) {
            System.out.println("La probabilidad de que haga calor es alta");
            if (letra == "a")
                letra = "a";
            else
                letra = "b";

        } else {
            System.out.println("La probabilidad de que haga frío es alta");
            if (letra == "a")
                letra = "c";
            else
                letra = "d";
        }
        return letra;
    }

}
