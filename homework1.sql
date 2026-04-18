DROP TABLE IF EXISTS teachers;

CREATE TABLE teachers (
    id BIGINT,
    first_name TEXT,
    last_name TEXT,
    hire_date DATE,
    email VARCHAR(150)
);

SELECT * FROM information_schema.tables
WHERE table_schema = 'public';

INSERT INTO teachers VALUES
(1, 'Lali', 'Nadiradze', '2007-10-14', 'lali@gmail.com');

INSERT INTO teachers VALUES
(2, 'Tako', 'Melikidze', '2021-02-19', 'tako@gmail.com');

INSERT INTO teachers VALUES
(3, 'Giorgi', 'Skhirtladze', '2017-05-03', 'giorgi@gmail.com');

INSERT INTO teachers VALUES
(4, 'Madlena', 'Chkeidze', '2004-06-08', 'madlena@gmail.com');

INSERT INTO teachers VALUES
(5, 'Tamriko', 'Kipiani', '2007-04-12', 'tamriko@gmail.com');

SELECT *
FROM teachers
WHERE hire_date > '2009-01-01';

ALTER TABLE teachers
ADD COLUMN department TEXT;

UPDATE teachers SET department = 'ბიოლოგია' WHERE id = 1;
UPDATE teachers SET department = 'ქართული' WHERE id = 2;
UPDATE teachers SET department = 'მათემატიკა' WHERE id = 3;
UPDATE teachers SET department = 'ქიმია' WHERE id = 4;
UPDATE teachers SET department = 'ისტორია' WHERE id = 5;

ALTER TABLE teachers
RENAME COLUMN email TO contact_email;

SELECT first_name, contact_email
FROM teachers

WHERE hire_date < '2015-01-01'
   OR hire_date > '2018-12-31';