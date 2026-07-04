create database DemandChain;
use DemandChain;
CREATE TABLE Supplier(
    supplier_id INT PRIMARY KEY,
    supplier_name VARCHAR(100),
    city VARCHAR(100),
    mobile_number VARCHAR(15)
);
CREATE TABLE Product(
    product_id INT PRIMARY KEY,
    product_name VARCHAR(100),
    category VARCHAR(50),
    price DECIMAL(10,2),
    stock_quantity INT,
    supplier_id INT,
    FOREIGN KEY(supplier_id) REFERENCES Supplier(supplier_id)
);
CREATE TABLE Purchase(
    purchase_id INT PRIMARY KEY,
    product_id INT,
    supplier_id INT,
    purchase_quantity INT,
    purchase_date DATE,
    FOREIGN KEY(product_id) REFERENCES Product(product_id),
    FOREIGN KEY(supplier_id) REFERENCES Supplier(supplier_id)
);
CREATE TABLE Sales(
    sales_id INT PRIMARY KEY,
    product_id INT,
    sold_quantity INT,
    sales_date Date,
    FOREIGN KEY(product_id) REFERENCES Product(product_id)
);
