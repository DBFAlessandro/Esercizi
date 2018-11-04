--
-- File generated with SQLiteStudio v3.2.1 on dom nov 4 12:19:24 2018
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: libri
DROP TABLE IF EXISTS libri;

CREATE TABLE libri (
    IDL      INTEGER      NOT NULL
                          PRIMARY KEY AUTOINCREMENT,
    Autore   VARCHAR (50) NOT NULL,
    Titolo   VARCHAR (50) NOT NULL,
    Edizione INT (4)      NOT NULL,
    IDU      INTEGER      REFERENCES utenti (IDU),
    DataP    DATETIME
);

INSERT INTO libri (
                      IDL,
                      Autore,
                      Titolo,
                      Edizione,
                      IDU,
                      DataP
                  )
                  VALUES (
                      1,
                      'Dio',
                      'Il giorno del giudizio',
                      2099,
                      2,
                      '2018-11-04 11:10:42'
                  );

INSERT INTO libri (
                      IDL,
                      Autore,
                      Titolo,
                      Edizione,
                      IDU,
                      DataP
                  )
                  VALUES (
                      2,
                      'Paolo Viallaggio',
                      'Io Speriamo che me la cavo',
                      1989,
                      2,
                      '2018-11-04 11:10:24'
                  );

INSERT INTO libri (
                      IDL,
                      Autore,
                      Titolo,
                      Edizione,
                      IDU,
                      DataP
                  )
                  VALUES (
                      3,
                      'Ezio Greggio',
                      'Il silenzio dei prosciutti',
                      1970,
                      NULL,
                      NULL
                  );

INSERT INTO libri (
                      IDL,
                      Autore,
                      Titolo,
                      Edizione,
                      IDU,
                      DataP
                  )
                  VALUES (
                      4,
                      'Ezio Greggio',
                      'Il silenzio dei prosciutti',
                      1970,
                      2,
                      '2018-11-04 11:10:36'
                  );

INSERT INTO libri (
                      IDL,
                      Autore,
                      Titolo,
                      Edizione,
                      IDU,
                      DataP
                  )
                  VALUES (
                      5,
                      'Satana',
                      'Il giorno della redenzione',
                      6666,
                      1,
                      '2018-11-04 11:10:42'
                  );


-- Table: utenti
DROP TABLE IF EXISTS utenti;

CREATE TABLE utenti (
    IDU        INTEGER      NOT NULL
                            PRIMARY KEY AUTOINCREMENT,
    nominativo VARCHAR (50) NOT NULL,
    Indirizzo  VARCHAR (50) NOT NULL
);

INSERT INTO utenti (
                       IDU,
                       nominativo,
                       Indirizzo
                   )
                   VALUES (
                       1,
                       'Giovanni  Impastato',
                       'Via cosche 2'
                   );

INSERT INTO utenti (
                       IDU,
                       nominativo,
                       Indirizzo
                   )
                   VALUES (
                       2,
                       'Rodolfo Giannino',
                       'Via non lo so'
                   );

INSERT INTO utenti (
                       IDU,
                       nominativo,
                       Indirizzo
                   )
                   VALUES (
                       3,
                       'Ezio Auditore',
                       'Via sti cazzi 3'
                   );


COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
