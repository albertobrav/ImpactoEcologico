/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Bicicleta implements ImpactoEcologico {
    private String localizacion;
    private String tecnologiaEcologica;
    private String procesoFabricacion;

    public Bicicleta(String localizacion, String tecnologiaEcologica, String procesoFabricacion) {
        this.localizacion = localizacion;
        this.tecnologiaEcologica = tecnologiaEcologica;
        this.procesoFabricacion = procesoFabricacion;
    }

    @Override
    public double calcularImpactoEcologico() {
        double impacto = 0;
        impacto += "Proceso ecológico".equals(procesoFabricacion) ? 50 : 100;
        impacto -= "Diseño aerodinámico".equals(tecnologiaEcologica) ? 20 : 0;
        return impacto;
    }

    @Override
    public String getIdentificacion() {
        return "Bicicleta fabricada mediante " + procesoFabricacion;
    }
}

