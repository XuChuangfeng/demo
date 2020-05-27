CREATE TABLE student (
    id INTEGER not null auto_increment,
    name VARCHAR(255),
    age INTEGER,
    address VARCHAR(255),
    PRIMARY KEY (id)
);
CREATE TABLE teacher (
    id INTEGER not null auto_increment,
    name VARCHAR(255),
    age INTEGER,
    address VARCHAR(255),
    PRIMARY KEY (id)
)