package com.github.sirius1618.agendamento_de_envio_mensagem.agendamento_de_envio_mensagem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.OffsetDateTime;

@Entity
@Table(name = "tb_agendamento")
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Future(message = "A data de aendamento precisa ser no futuro")
    @Column(name = "data_agendamento")
    private OffsetDateTime dataAgendamento;

    @CreationTimestamp
    @Column(name = "data_criacao_agendamento")
    private OffsetDateTime dataCriacao;

    @UpdateTimestamp
    @Column(name = "atualizado_em")
    private OffsetDateTime dataAtualizacao;

    @NotBlank(message = "A mensagem não pode esta vazia")
    @Size(max=500, message = "Mensagem muito longa, ela pode conter apenas 500 caracteres")
    @Column(length = 500)
    private String mensagem;

    @Column(name = "manndar_frequente")
    private boolean inMandarFrequentemente;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_mensagem")
    private TipoMensagem tipoMensagem;

    @Enumerated(EnumType.STRING)
    private StatusAgendamento status;
}
