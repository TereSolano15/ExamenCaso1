package Examen;

public class CurrentConditions {

    private final float temperatura;
    private final float presionBarometrica;
    private final float humedad;

    public CurrentConditions(float temp, float presBar, float hum) {
        temperatura = temp;
        presionBarometrica = presBar;
        humedad = hum;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public float getHumedad() {
        return humedad;
    }


    public String climaBase() {
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Temperatura: " + temperatura + "\n");
        mensaje.append("Precion Brometrica: " + presionBarometrica + "\n");
        mensaje.append("Humedad: " + humedad);
        return mensaje.toString();
    }

}
