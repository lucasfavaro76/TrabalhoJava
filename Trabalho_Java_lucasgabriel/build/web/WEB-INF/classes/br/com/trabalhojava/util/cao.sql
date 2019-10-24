--drop if exists table raca_cao;
--drop if exists table cao;

CREATE TABLE raca_cao(
id_raca SERIAL,
desc_raca VARCHAR(15),
CONSTRAINT pk_raca PRIMARY KEY(id_raca)
);

CREATE TABLE cao(
id_cao SERIAL,
nome_cao VARCHAR(15),
idade_cao INTEGER,
peso_cao DOUBLE,
fk_raca INTEGER,
CONSTRAINT pk_cao PRIMARY KEY(id_cao),
CONSTRAINT fk_raca_cao FOREIGN KEY (fk_raca) REFERENCES raca_cao (id_raca)
);

select * from cao;
