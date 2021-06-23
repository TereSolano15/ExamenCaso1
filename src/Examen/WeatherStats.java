package Examen;

public class WeatherStats {


    public WeatherStats(){  }



    public String calculoEstadistica(float hum, float temp){
    StringBuilder mensaje= new StringBuilder();
    String letra;
        System.out.println("Estadisticas: ");
        if(hum > 90){
           System.out.println("Nublado\n");
           letra = "a";
        }else {
            System.out.println("Parcialmente nublado\n");
            letra = "b";
        }
        if(temp > 20){
            System.out.println("Temperatura Minima de 18 grados\n");
            mensaje.append("Temperatura Maxima de 32 grados\n");
            if(letra=="a")
                letra="a";
            else
                letra="b";
        }else {
            System.out.println("Temperatura Minima de 14 grados\n");
            System.out.println("Temperatura Maxima 22 grados\n");
            if(letra == "a"){
                letra="c";
            }
            else
                letra="d";
        }
        //return mensaje.toString();
        return letra;
    }

}
