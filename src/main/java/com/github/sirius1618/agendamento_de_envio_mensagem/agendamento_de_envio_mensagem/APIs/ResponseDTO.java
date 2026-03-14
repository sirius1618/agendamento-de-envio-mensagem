package com.github.sirius1618.agendamento_de_envio_mensagem.agendamento_de_envio_mensagem.APIs;

import com.github.sirius1618.agendamento_de_envio_mensagem.agendamento_de_envio_mensagem.model.TipoMensagem;

import java.time.OffsetDateTime;

public record ResponseDTO(
        OffsetDateTime dataAgendamento,
        TipoMensagem tipoMensagem,
        String mensagem
) { }
