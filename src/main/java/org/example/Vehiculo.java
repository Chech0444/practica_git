package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Vehiculo {
    private String placa;
    private int modelo;
    private boolean estadoDisponible;

    public void ocupar(){
        estadoDisponible = false;
    }

    public void liberar(){
        estadoDisponible = true;
    }
}
