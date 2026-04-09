package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Pasajero {
    private String nombre;
    private int id;

    public void solicitarViaje(){
        System.out.println("El pasajero solicita el viaje de Puerto Espejo a Shango");
    }
}
