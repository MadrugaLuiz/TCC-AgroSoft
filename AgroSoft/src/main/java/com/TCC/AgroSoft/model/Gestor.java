package com.TCC.AgroSoft.model;


import jakarta.persistence.Entity;
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


    private List<Pessoa> pessoasGestor; //Verificar se faz sentido esse atributo
}
