CREATE TABLE subjects (
    id SERIAL PRIMARY KEY,
    subject_name VARCHAR(100)
);

CREATE TABLE students (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    grade INT
);

CREATE TABLE teachers (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    subject INT REFERENCES subjects(id),
    salary NUMERIC
);