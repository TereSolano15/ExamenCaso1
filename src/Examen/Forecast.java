package Examen;

public class Forecast extends ClimaDecorator {



  public Forecast(IClima iClima){ super(iClima); }

  @Override
  public void agregarElemento(){
    super.agregarElemento();
    System.out.println("Forecast: ");

  }

  private void pronosticoSimple(){

    System.out.println("El dia " + "Lunes" + " tenemos el siguiente pronostico: ");
    System.out.println("Temperatura: 28" );
    System.out.println("Humedad: 31" );
    System.out.println("Precion Brometrica: 41" + "\n");

  }

}
