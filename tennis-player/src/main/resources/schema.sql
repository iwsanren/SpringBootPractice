CREATE TABLE Player
(
    ID INTEGER NOT NULL,
    Name VARCHAR(255) NOT NULL,
    Nationality VARCHAR(255) NOT NULL,
    Birth_date TIMESTAMP,
    Titles INTEGER,
    PRIMARY KEY(ID)
);

CREATE TABLE Ebook (
                       id INTEGER NOT NULL,
                       title VARCHAR(255) NOT NULL,
                       publisher VARCHAR(255) NOT NULL,
                       price DOUBLE NOT NULL,
                       PRIMARY KEY (ID)
);