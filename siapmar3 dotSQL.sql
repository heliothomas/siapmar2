-- drop database if exists siapmar3;
-- 
-- CREATE DATABASE siapmar2
-- WITH OWNER = postgres
-- ENCODING = 'UTF8'
-- TABLESPACE = pg_default
-- LC_COLLATE = 'Spanish_Spain.1252'
-- LC_CTYPE = 'Spanish_Spain.1252'
-- CONNECTION LIMIT = -1;

drop table if exists Cargo;

CREATE TABLE Cargo
(
id_cargo smallserial not null,
name character varying(20),
state integer[],
form character varying(20)[]
);

CREATE TABLE Login
(
  c_uname character varying(20) NOT NULL,
  c_passw character varying(20) NOT NULL,
  s_cargo character varying(15),
  v_estado integer,
  f_modify character varying(15),
  s_modify character varying(20),
  s_name character varying(100),
  f_nac character varying(10),
  v_edad integer,
  s_dir character varying(200),
  v_cel character varying(10),
  v_tel character varying(10),
  s_pemail character varying(50),
  s_semail character varying(50),
  song character varying(500),
  CONSTRAINT login_pkey PRIMARY KEY (c_uname)
);