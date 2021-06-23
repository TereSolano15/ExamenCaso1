package Examen;

public class WeatherStats {


    public WeatherStats(){  }



    public void calculoEstadistica(float hum, float temp){

        if(hum > 90){
            System.out.println("Nublado");
        }else {
            System.out.println("Parcialmente nublado");
        }
        if(temp > 20){
            System.out.println("Temperatura Minima de 18 grados");
            System.out.println("Temperatura Maxima de 32 grados");
        }else {
            System.out.println("Temperatura minima de 14 grados");
            System.out.println("Temperatura maxima 22 ");
        }
    }

}
