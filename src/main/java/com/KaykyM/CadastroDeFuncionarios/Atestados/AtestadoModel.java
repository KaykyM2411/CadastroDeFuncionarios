package com.KaykyM.CadastroDeFuncionarios.Atestados;

import com.KaykyM.CadastroDeFuncionarios.Funcionarios.FuncionarioModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "tb_atestado")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class AtestadoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dataInicio;

    private Date dataFim;

    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private FuncionarioModel funcionario;

}
