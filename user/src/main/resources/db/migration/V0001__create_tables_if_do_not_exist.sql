CREATE TABLE IF NOT EXISTS user(
    id         uuid NOT NULL,
    first_name text NOT NULL,
    last_name  text NOT NULL,
    CONSTRAINT id_pkey PRIMARY KEY (id)
);

