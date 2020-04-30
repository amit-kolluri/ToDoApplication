-- Table: todo.user_login_security

-- DROP TABLE todo.user_login_security;
create schema todo;

CREATE TABLE todo.user_login_security
(
    user_id       integer NOT NULL,
    user_password character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT user_login_security_pkey PRIMARY KEY (user_id),
    CONSTRAINT user_login_security_user_id_fkey FOREIGN KEY (user_id)
        REFERENCES todo.user_login_security (user_id) MATCH SIMPLE
        ON UPDATE RESTRICT
        ON DELETE RESTRICT
)
    WITH (
        OIDS = FALSE
    )
    TABLESPACE pg_default;

ALTER TABLE todo.user_login_security
    OWNER to postgres;

CREATE SEQUENCE todo.user_details_user_id_seq
    INCREMENT 1
    START 10002
    MINVALUE 10000
    MAXVALUE 2147483647
    CACHE 1;



ALTER SEQUENCE todo.user_details_user_id_seq
    OWNER TO postgres;


-- Table: todo.user_details

-- DROP TABLE todo.user_details;

CREATE TABLE todo.user_details
(
    user_id   integer                                        NOT NULL DEFAULT nextval('todo.user_details_user_id_seq'::regclass),
    user_name character varying COLLATE pg_catalog."default" NOT NULL,
    email     character varying COLLATE pg_catalog."default" NOT NULL,
    phone     bigint,
    address   character varying COLLATE pg_catalog."default",
    city      character varying COLLATE pg_catalog."default",
    zip       integer,
    state     character varying(2) COLLATE pg_catalog."default",
    country   character varying(2) COLLATE pg_catalog."default",
    CONSTRAINT user_details_pkey PRIMARY KEY (user_id),
    CONSTRAINT user_details_phone_key UNIQUE (phone)
)
    WITH (
        OIDS = FALSE
    )
    TABLESPACE pg_default;

ALTER TABLE todo.user_details
    OWNER to postgres;


INSERT INTO todo.user_details(user_id, user_name, email, phone, address, city, zip, state, country)
VALUES (10001, 'John Adams', 'john.adams@gmail.com', 3898386482, 'null', null, null, null, 'US'),
       (10002, 'William Bates', 'William.Bates@gmail.com', 3893486482, null, null, null, null, 'US'),
       (10003, 'Cole Van', 'Cole.Van@gmail.com', 3898336482, null, null, null, null, 'US'),
       (10004, 'Justin Cradle', 'Justin.Cradle@gmail.com', 3896786482, null, null, null, null, 'US');



INSERT INTO todo.user_login_security(user_id, user_password)
VALUES (10001, 'UYGS897@9023'),
       (10002, 'UYGS897@9023'),
       (10003, 'UYGS897@9023'),
       (10004, 'UYGS897@9023');



