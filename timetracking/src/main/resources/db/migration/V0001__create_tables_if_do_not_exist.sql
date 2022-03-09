CREATE TABLE IF NOT EXISTS timetracking(
    id              uuid NOT NULL,
    end_date        timestamp NOT NULL,
    start_date      timestamp NOT NULL,
    user_id         uuid,
    CONSTRAINT id_pkey PRIMARY KEY (id)
);

