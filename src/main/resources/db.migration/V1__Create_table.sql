CREATE TABLE tb_agendamento (
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    data_agendamento TIMESTAMPTZ NOT NULL,
    data_criacao_agendamento TIMESTAMPTZ DEFAULT NOW() NOT NULL,
    atualizado_em TIMESTAMPTZ NOT NULL DEFAULT NOW() ,
    mensagem TEXT NOT NULL,
    manndar_frequente BOOLEAN DEFAULT FALSE NOT NULL,
    tipo_mensagem VARCHAR(20) DEFAULT 'EMAIL' NOT NULL,
    status VARCHAR DEFAULT 'PENDENTE',
    CONSTRAINT ck_tipo CHECK (tipo_mensagem IN ('SMS', 'TELEGRAM', 'EMAIL')),
    CONSTRAINT ck_status CHECK (status IN ('PENDENTE', 'CANCELADO', 'CONCLUIDO')),
    CONSTRAINT ck_intervalo CHECK (data_criacao_agendamento < data_agendamento)
)
