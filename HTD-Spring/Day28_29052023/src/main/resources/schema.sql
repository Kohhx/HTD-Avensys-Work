CREATE TABLE Student
(
    id BIGINT NOT NULL,
    name    VARCHAR(200) NOT NULL,
    address VARCHAR(200) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE Customer
(
    id BIGINT NOT NULL,
    name    VARCHAR(200) NOT NULL,
    address VARCHAR(200) NOT NULL,
    age INT NOT NULL,
    PRIMARY KEY (id)
);

-- INSERT into STUDENT (id, name, address)
-- VALUES (1, 'kohhx', 'sg');

