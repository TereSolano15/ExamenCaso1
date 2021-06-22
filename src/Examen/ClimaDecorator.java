package Examen;

public class ClimaDecorator implements IClima {

    private IClima iClima;


    public ClimaDecorator(IClima iClima) {

        this.iClima = iClima;

    }

    @Override
    public void agregarElemento() {

        this.iClima.agregarElemento();

    }
}
