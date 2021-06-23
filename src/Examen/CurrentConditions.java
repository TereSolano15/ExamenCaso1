package Examen;

public class CurrentConditions {

    private float temperatura;
    private float presionBarometrica;
    private float humedad;

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getPresionBarometrica() {
        return presionBarometrica;
    }

    public void setPresionBarometrica(float presionBarometrica) {
        this.presionBarometrica = presionBarometrica;
    }

    public float getHumedad() {
        return humedad;
    }

    public void setHumedad(float humedad) {
        this.humedad = humedad;
    }

    public CurrentConditions(float temp, float presBar, float hum) {
        temperatura = temp;
        presionBarometrica = presBar;
        humedad = hum;
    }

    public String climaBase(){
    StringBuilder mensaje = new StringBuilder("");
       mensaje.append("Temperatura: " + temperatura + "\n");
       mensaje.append("Precion Brometrica: " + presionBarometrica + "\n" );
       mensaje.append("Humedad: " + humedad + "\n");
        return mensaje.toString();
    }

}
