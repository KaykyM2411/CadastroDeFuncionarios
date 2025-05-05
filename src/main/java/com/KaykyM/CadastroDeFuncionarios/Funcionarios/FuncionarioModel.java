package com.KaykyM.CadastroDeFuncionarios.Funcionarios;

import com.KaykyM.CadastroDeFuncionarios.Atestados.AtestadoModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;

    private String telefone;

    private String email;

    private int idade;

    @OneToMany(mappedBy = "funcionario")
    private List<AtestadoModel> atestadosList;

}
