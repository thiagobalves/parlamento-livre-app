CREATE TABLE account_user(
    id INT NOT NULL UNIQUE AUTO_INCREMENT ,
    email VARCHAR(255) NOT NULL UNIQUE,
    name VARCHAR(255),
    password VARCHAR(255),
    settings JSON NULL,
    PRIMARY KEY (id)
);