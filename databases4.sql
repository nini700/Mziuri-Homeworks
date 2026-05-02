CREATE TABLE authors(
    id SERIAL PRIMARY KEY,
    first_name TEXT,
    last_name TEXT
);

CREATE TABLE books(
    id SERIAL PRIMARY KEY,
    title TEXT NOT NULL,
    author_id INTEGER,
    price DECIMAL(6,2) NOT NULL,
    FOREIGN KEY (author_id) REFERENCES authors(id)
);

CREATE TABLE sales(
    id SERIAL PRIMARY KEY,
    book_id INTEGER,
    quantity INTEGER,
    sale_date DATE,
    FOREIGN KEY (book_id) REFERENCES books(id)
);

INSERT INTO authors (first_name, last_name) VALUES
('Douglas', 'Adams'),
('J.K.', 'Rowling'),
('Charlotte', 'Bronte'),
('Emily', 'Bronte'),
('Andy', 'Weir');

INSERT INTO books (title, author_id, price) VALUES
('Hitchheikers Guide to the Galady', 1, 14.40),
('Harry Potter', 2, 27.20),
('Jane Eyre', 3, 16.55),
('Wuthering heights', 4, 18.70),
('Project Hail Mary', 5, 32.59);

INSERT INTO sales (book_id, quantity, sale_date) VALUES
(1, 3, '2024-01-21'),
(2, 5, '2024-05-23'),
(3, 2, '2024-07-30'),
(4, 4, '2024-04-04'),
(5, 1, '2024-01-12');

SELECT *
FROM books b
JOIN authors a ON a.id = b.author_id;

SELECT SUM(price * quantity)
FROM books b
JOIN sales s ON s.book_id = b.id;

SELECT 
    b.title,
    a.first_name,
    a.last_name
FROM sales s
JOIN books b ON b.id = s.book_id
JOIN authors a ON a.id = b.author_id
WHERE sale_date = '2024-01-12';