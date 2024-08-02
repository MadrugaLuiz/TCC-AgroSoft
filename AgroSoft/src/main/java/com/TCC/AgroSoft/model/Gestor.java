package com.TCC.AgroSoft.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Gestor {

    @JsonIgnore
    @OneToMany(mappedBy = "pessoa")
    private List<Pessoa> pessoasGestor; //Verificar se faz sentido esse atributo
}
