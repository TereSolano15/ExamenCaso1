package Examen;

public class Forecast {
CurrentConditions clima;


  public Forecast(CurrentConditions clima){
    this.clima=clima;
  }
  public CurrentConditions getClima(){

    return clima;
}
  public void pronosticoSimple(){
    if(clima.getHumedad() > 90){
      System.out.println("La probabilidad de lluvia es alta");
    }else {
      System.out.println("La probabilidad de lluvia es baja");
    }

    if(clima.getTemperatura() > 20){
      System.out.println("La probabilidad de que haga calor es alta");
    }else{
      System.out.println("La probabilidad de que haga frío es alta ");
    }
  }

}
