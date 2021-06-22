package Examen;

public class WeatherStats extends ClimaDecorator {


    public WeatherStats(IClima iClima){ super(iClima); }


    @Override
    public void agregarElemento(){
        super.agregarElemento();
        System.out.println("Estadisticas meteorologicas: ");
        this.calculoEstadistica();

    }

    public void calculoEstadistica(){

        System.out.println("Con una temperatura de " + 35 + " grados y una humedad con una temperatura de " + 41);
        System.out.println("los siguientes dias podrian tener una temperatura de: " + 38);

    }

}
