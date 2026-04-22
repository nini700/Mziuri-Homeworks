DROP TABLE IF EXISTS students;

CREATE TABLE students(
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    dob DATE,
    enrollment_date TIMESTAMP DEFAULT NOW(),
    grade INTEGER CHECK (grade >= 1 AND grade <= 12),
    email VARCHAR(100) UNIQUE
);

INSERT INTO students (first_name, last_name, dob, grade, email)
VALUES 
('Nini', 'Chanadiri', '2009-08-21', 11, 'ninikiooo4@gmail.com'),
('Data', 'Maisuradze', '2008-02-04', 12, 'data2008@gmail.com'),
('Nicole', 'Mzhavia', '2010-04-14', 10, 'nicolek@gmail.com'),
('Bakar', 'Orjonikidze', '2011-11-11', 9, 'bakargoresha@gmail.com'),
('Gigi', 'Gotsiridze', '2009-01-15', 10, 'datogoco@gmail.com');

SELECT * FROM students;

-- INSERT INTO students (first_name, last_name, dob, grade, email)
-- VALUES ('vigaca', 'bavshvi', '2003-09-09', 14, 'vigacabavshvi@gmail.com');

UPDATE students
SET grade = grade + 1
WHERE first_name = 'Nini';

DELETE FROM students
WHERE first_name = 'Data';

SELECT * FROM students;