import java.util.ArrayList;

public class Calculo {
    public static void main(String[] args) {
        Edificio edificio = new Edificio("Clima cálido", "Tecnología sostenible", "madera");
        Vehiculo vehiculo = new Vehiculo("Zona rural", "Motor eficiente", "Eléctrico");
        Bicicleta bicicleta = new Bicicleta("Uso urbano", "Diseño aerodinámico", "Proceso ecológico");

        ArrayList<ImpactoEcologico> objetos = new ArrayList<>();
        objetos.add(edificio);
        objetos.add(vehiculo);
        objetos.add(bicicleta);

        for (ImpactoEcologico objeto : objetos) {
            System.out.println(objeto.getIdentificacion() + " - Impacto Ecológico: " + objeto.calcularImpactoEcologico());
        }
    }
}

