package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*; //no usar el .* .. solo usar los q usamos ej: lombok.Data

@Data  // genera constructores, getters y setters
//@Getter // genera solo getters
//@AllArgsConstructor // genera constructores con todos los argumentos
//@RequiredArgsConstructor // genera constructor solo con los requeridos
@Entity
public class TestClass {
 //  @Id
    private String id;
    // //funciona con el AllArgsConstructor diciendo que es obligatorio
    private  String name;

}
