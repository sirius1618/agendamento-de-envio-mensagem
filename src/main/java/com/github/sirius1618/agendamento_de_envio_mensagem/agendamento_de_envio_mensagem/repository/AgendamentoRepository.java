package com.github.sirius1618.agendamento_de_envio_mensagem.agendamento_de_envio_mensagem.repository;

import com.github.sirius1618.agendamento_de_envio_mensagem.agendamento_de_envio_mensagem.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository <Agendamento, Long> {
}
