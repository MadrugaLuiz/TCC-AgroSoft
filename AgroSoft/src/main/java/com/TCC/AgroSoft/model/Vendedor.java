package com.TCC.AgroSoft.model;


import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Vendedor {

    @NonNull
    private String tipo;
}
