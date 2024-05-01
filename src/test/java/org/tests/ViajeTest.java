package org.tests;

import org.cuidandonos.Ubicacion;
import org.cuidandonos.Viaje;
import org.cuidandonos.demora.CalculadorDeDemora;
import org.cuidandonos.distancia.AdapterDistanceMatrixAPI;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
public class ViajeTest {
/*
    @Test
    public void demoraDe5MinsEnViaje(){
        Ubicacion medrano = new Ubicacion(-34.598450F,-58.420065F, "UTN BA MEDRANO");
        Ubicacion campus = new Ubicacion(-34.659277F,-58.4673392F, "UTN BA CAMPUS");

        Viaje viajeDeSedeASede  = new Viaje();
        viajeDeSedeASede.setPuntoDePartida(medrano);
        viajeDeSedeASede.setDestinos(campus,medrano);

        AdapterDistanceMatrixAPI calculadorDeDistancia = mock(AdapterDistanceMatrixAPI.class); //instancia que cumple con la interfaz
        when(calculadorDeDistancia.distanciaEnMetrosEntre(medrano,campus)).thenReturn(10100F);//que la instancia devuelta

        CalculadorDeDemora calculadorDeDemora = mock(CalculadorDeDemora.class);
        when(calculadorDeDemora.demoraAproxEnMinsParaRecorrer(10100F)).thenReturn(30.0);
        viajeDeSedeASede.calcularDemoraAproxEnMins(calculadorDeDistancia, calculadorDeDemora); //le pasamos los objetos mockeados
        Assertions.assertEquals(30.0, viajeDeSedeASede.getDemoraAproxEnMins());
    }

 */
}
