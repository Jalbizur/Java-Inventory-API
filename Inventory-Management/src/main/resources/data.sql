drop table if exists account;
drop table if exists product;

create table account (
    accountId int primary key auto_increment,
    username varchar(255) not null unique,
    password varchar(255)
);

create table products (
    productId int primary key auto_increment,
    productName varchar(255) not null,
    description text,
    price decimal(10,2) not null,
    quantity int not null,
    categoryId int,
    dateAdded DATE DEFAULT GETDATE(),
    lastUpdated DATE DEFAULT GETDATE()
);