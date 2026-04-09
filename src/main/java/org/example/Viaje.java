package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Viaje {
    private Pasajero pasajero;
    private Conductor conductor;
    private String origen;
    private String destino;
    private String estado;

    public void iniciar(){
        System.out.println("Iniciando viaje");
    }

    public void finalizar(){
        System.out.println("Finalizando viaje");
    }
}
