package com.TCC.AgroSoft.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Orcamento {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Cliente cliente;

    private Vendedor vendedor;

    private List<Produto> produtosOrcamento; //Verificar escrita código e seu relacionamento

    private List<Servico> servicosOrcamento;//Verificar escrita código e seu relacionamento

    private Double total;

    private Boolean statusOrcamento;


}
