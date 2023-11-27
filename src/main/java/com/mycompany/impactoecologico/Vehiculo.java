/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Vehiculo implements ImpactoEcologico {
    private String localizacion;
    private String tecnologiaEcologica;
    private String modoPropulsion;

    public Vehiculo(String localizacion, String tecnologiaEcologica, String modoPropulsion) {
        this.localizacion = localizacion;
        this.tecnologiaEcologica = tecnologiaEcologica;
        this.modoPropulsion = modoPropulsion;
    }

    @Override
    public double calcularImpactoEcologico() {
        double impacto = 0;
        impacto += "Eléctrico".equals(modoPropulsion) ? 100 : 300;
        impacto -= "Motor eficiente".equals(tecnologiaEcologica) ? 50 : 0;
        return impacto;
    }

    @Override
    public String getIdentificacion() {
        return "Vehiculo con " + modoPropulsion;
    }
}

