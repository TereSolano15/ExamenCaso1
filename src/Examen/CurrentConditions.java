package Examen;

public class CurrentConditions extends ClimaDecorator {


    public CurrentConditions(IClima iClima){ super(iClima); }

    @Override
    public void agregarElemento(){

        super.agregarElemento();
        System.out.println("Current Conditions: ");
        this.currentConditions();

    }

    private void currentConditions(){

        System.out.println("Fecha: 2/03/23"  );
        System.out.println("Temperatura: 28 grados");
        System.out.println("Humedad: 31");
        System.out.println("Precion Brometrica: 35" + "\n");

    }


}
