package org.cuidandonos.distancia;

import org.cuidandonos.Ubicacion;

import java.util.List;

public interface AdapterDistanceMatrixAPI {

    public List<Float> distanciaEnMetrosEntre(Ubicacion direccionInicial, List<Ubicacion> direcciones );

}
