package Examen;

public class ClimaBase implements IClima {

    private float temperatura;
    private float presionBarometrica;
    private float humedad;


    public ClimaBase(float temp, float presBar, float hum) {
        temperatura = temp;
        presionBarometrica = presBar;
        humedad = hum;
    }


    @Override
    public void agregarElemento() {

        System.out.println("Basic Weather data: ");
        this.weatherBasicData();

    }

    private void weatherBasicData(){

        System.out.println("Temperatura: " + temperatura);
        System.out.println("Humedad: " + humedad);
        System.out.println("Precion Brometrica: " + presionBarometrica + "\n");

    }

}
