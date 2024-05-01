package org.cuidandonos;

import org.cuidandonos.demora.CalculadorDeDemora;
import org.cuidandonos.distancia.AdapterDistanceMatrixAPI;
import org.cuidandonos.distancia.CalculadorDeDistancia;

import java.util.List;

public class Viaje {
private List<Float> demoraAproxEnMinsPorSeccion;
private double demoraAproxEnMinsTotal;

private List<Ubicacion> destinos;

private Ubicacion puntoDePartida;
private List<Usuario> cuidadores;
private List<Usuario> cuidadoresDeseados;

private Boolean seDetiene;

private Usuario transeunte;


public void calcularDemoraAproxEnMins(CalculadorDeDistancia calculadorDeDistancia, CalculadorDeDemora calculadorDeDemora) {
    List<Float> distanciaEnMetrosPorSecciones = calculadorDeDistancia.distanciaEnMetrosEntre(puntoDePartida, destinos);

    if (seDetiene) {
        this.demoraAproxEnMinsPorSeccion = calculadorDeDemora.demoraAproxEnMinsParaRecorrer(distanciaEnMetrosPorSecciones);
    } else { this.demoraAproxEnMinsTotal = calculadorDeDemora.demoraAproxEnMinsParaRecorrer(distanciaEnMetrosPorSecciones)
                                            .stream().reduce(0.0f, Float::sum);
    }
}

public void evaluarDemora(){
    //Si la demora total es mayor al tiempo de demora aprox en minutos calculado, se reacciona
    //si el tiempo que tarda en una seccion es mayor al esperado, se reacciona
}
/*public void calcularDemoraAproxEnMins(CalculadorDeDistancia calculadorDeDistancia, CalculadorDeDemora calculadorDeDemora){
    float distanciaEnMetros = calculadorDeDistancia.distanciaEnMetrosEntre(puntoDePartida,destino);
    this.demoraAproxEnMins = calculadorDeDemora.demoraAproxEnMinsParaRecorrer(distanciaEnMetros);
}

public void calcularDemoraTotalEnMinsDeteniendose(){
    this.demoraAproxEnMins = this.destinos.stream().map(this::calcularDemoraAproxEnMins).sum();
}*/

    public void agregarCuidadorALista(Usuario unCuidador){
    this.cuidadores.add(unCuidador);
}

    public void setDestinos(List<Ubicacion> destinos) {
        this.destinos = destinos;
    }

    public void setPuntoDePartida(Ubicacion puntoDePartida) {
        this.puntoDePartida = puntoDePartida;
    }



}
