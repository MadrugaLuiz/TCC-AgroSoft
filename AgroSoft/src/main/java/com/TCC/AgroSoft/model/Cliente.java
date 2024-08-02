package com.TCC.AgroSoft.model;


import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cliente {

    @NonNull
    private Boolean IsCliente;

}
