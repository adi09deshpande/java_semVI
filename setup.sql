-- Run this in MySQL before starting the app

CREATE DATABASE IF NOT EXISTS employeedb;

USE employeedb;

CREATE TABLE IF NOT EXISTS employee (
    emp_id     VARCHAR(20) PRIMARY KEY,
    name       VARCHAR(100),
    email      VARCHAR(100),
    department VARCHAR(50),
    salary     VARCHAR(20)
);
