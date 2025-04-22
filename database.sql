CREATE DATABASE contact_management_pzn;
-- 
USE contact_management_pzn;
-- create table users
CREATE TABLE users(
    id BIGINT NOT NULL,
    username VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    name VARCHAR(100) NOT NULL,
    token VARCHAR(100),
    token_expired_at BIGINT,
    PRIMARY KEY (id),
    UNIQUE(token),
    UNIQUE(username)
) ENGINE InnoDB;
-- 
SELECT * FROM users;
-- 
DESC users;
--

-- create table contacts
CREATE TABLE contacts(
    id         VARCHAR(100) NOT NULL,
    user_id   BIGINT NOT NULL,
    first_name VARCHAR(100) NOT NULL,
    last_name  VARCHAR(100),
    phone      VARCHAR(100),
    email      VARCHAR(100),
    PRIMARY KEY (id),
    FOREIGN KEY fk_users_contacts (user_id) REFERENCES users (id)
) ENGINE InnoDB;

SELECT * FROM contacts;

DESC contacts;


-- create table address
CREATE TABLE addresses
(
    id          VARCHAR(100) NOT NULL,
    contact_id  VARCHAR(100) NOT NULL,
    street      VARCHAR(200),
    city        VARCHAR(100),
    province    VARCHAR(100),
    country     VARCHAR(100) NOT NULL,
    postal_code VARCHAR(10),
    PRIMARY KEY (id),
    FOREIGN KEY fk_contacts_addresses (contact_id) REFERENCES contacts (id)
) ENGINE InnoDB;

SELECT * FROM addresses;

DESC addresses;