<h1> TCL Commands in SQL </h1>

- [TCL Commands](#tcl-commands)
- [MySQL TCL Commands](#mysql-tcl-commands)
	- [1. Create Database and Table](#1-create-database-and-table)
	- [2. Perform TCL Commands](#2-perform-tcl-commands)
		- [`COMMIT`](#commit)
		- [`ROLLBACK`](#rollback)
		- [`SAVEPOINT`](#savepoint)
- [Oracle SQL Example](#oracle-sql-example)
	- [1. Create Database and Table](#1-create-database-and-table-1)
	- [2. Perform TCL Commands](#2-perform-tcl-commands-1)
		- [`COMMIT`](#commit-1)
		- [`ROLLBACK`](#rollback-1)
		- [`SAVEPOINT`](#savepoint-1)
- [How TCL commands helps in achieving ACID❓](#how-tcl-commands-helps-in-achieving-acid)
- [The `SET TRANSACTION` Command](#the-set-transaction-command)
	- [Syntax](#syntax)
	- [Oracle SQL Example](#oracle-sql-example-1)
	- [MySQL Example](#mysql-example)

<hr>

[Youtube Video Link](https://www.youtube.com/watch?v=OSfcmmoQWgU&t=39s)

<hr>

## TCL Commands

1. `START` TRANSACTION: begins a transaction
2. `COMMIT`: apply all the changes and end transaction.
3. `ROLLBACK`: discard changes and end transaction.
4. `SAVEPOINT`: checkout within the group of transactions in which to roll back.
5. `SET TRANSACTION`: Configures the transaction's properties, including isolation levels and read/write access.

In MySQL, there is setting name `AUTO-COMMIT`, it is enabled bydefault, so using `COMMIT` doesn't make any sence. Therefore, we need to use `START TRANSACTION` command.

Where as in Oracle SQL, there is no `START TRANSACTION` command because Oracle manages transactions automatically and starts a transaction with the first DML operation. You only need to explicitly use `COMMIT`, `ROLLBACK`, and `SAVEPOINT` to control the transaction and ensure data integrity.

## MySQL TCL Commands

### 1. Create Database and Table

```sql
-- Create a new database
CREATE DATABASE my_database;

-- Use the created database
USE my_database;

-- Create a table
CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    salary DECIMAL(10, 2)
);

-- Insert some values into the table
INSERT INTO employees (name, salary) VALUES ('Alice', 50000.00);
INSERT INTO employees (name, salary) VALUES ('Bob', 60000.00);
```

Output after Table Creation and Insertion

```
| id | name  | salary   |
|----|-------|----------|
| 1  | Alice | 50000.00 |
| 2  | Bob   | 60000.00 |
```

### 2. Perform TCL Commands

#### `COMMIT`

```sql
START TRANSACTION;

-- Update a record
UPDATE employees SET salary = salary + 5000 WHERE name = 'Alice';

-- Commit the transaction
COMMIT;

-- Verify the changes
SELECT * FROM employees;
```

Output after `COMMIT`:

```
| id | name  | salary   |
|----|-------|----------|
| 1  | Alice | 55000.00 |
| 2  | Bob   | 60000.00 |
```

#### `ROLLBACK`

```sql
START TRANSACTION;

-- Update a record
UPDATE employees SET salary = salary + 5000 WHERE name = 'Bob';

-- Rollback the transaction
ROLLBACK;

-- Verify the changes
SELECT * FROM employees;
```

Output after `ROLLBACK`:

```
| id | name  | salary   |
|----|-------|----------|
| 1  | Alice | 55000.00 |
| 2  | Bob   | 60000.00 |
```

#### `SAVEPOINT`

```sql
START TRANSACTION;

-- Update a record
UPDATE employees SET salary = salary + 5000 WHERE name = 'Alice';

-- Set a savepoint
SAVEPOINT before_salary_increase;

-- Perform another update
UPDATE employees SET salary = salary + 3000 WHERE name = 'Bob';

-- Rollback to the savepoint
ROLLBACK TO SAVEPOINT before_salary_increase;

-- Commit the transaction
COMMIT;

-- Verify the changes
SELECT * FROM employees;
```

Output after `SAVEPOINT` and `ROLLBACK` TO `SAVEPOINT`:

```
| id | name  | salary   |
|----|-------|----------|
| 1  | Alice | 55000.00 |
| 2  | Bob   | 60000.00 |
```

## Oracle SQL Example

### 1. Create Database and Table

```sql
-- Create a table
CREATE TABLE employees (
    id NUMBER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    name VARCHAR2(100),
    salary NUMBER(10, 2)
);

-- Insert some values into the table
INSERT INTO employees (name, salary) VALUES ('Alice', 50000.00);
INSERT INTO employees (name, salary) VALUES ('Bob', 60000.00);
```

Output after Table Creation and Insertion:
```
| id | name  | salary   |
|----|-------|----------|
| 1  | Alice | 50000.00 |
| 2  | Bob   | 60000.00 |
```

### 2. Perform TCL Commands

#### `COMMIT`

```sql
BEGIN;

-- Update a record
UPDATE employees SET salary = salary + 5000 WHERE name = 'Alice';

-- Commit the transaction
COMMIT;

-- Verify the changes
SELECT * FROM employees;
```

Output after `COMMIT`:

```
| id | name  | salary   |
|----|-------|----------|
| 1  | Alice | 55000.00 |
| 2  | Bob   | 60000.00 |
```

#### `ROLLBACK`

```sql
BEGIN;

-- Update a record
UPDATE employees SET salary = salary + 5000 WHERE name = 'Bob';

-- Rollback the transaction
ROLLBACK;

-- Verify the changes
SELECT * FROM employees;
```

Output after `ROLLBACK`:

```
| id | name  | salary   |
|----|-------|----------|
| 1  | Alice | 55000.00 |
| 2  | Bob   | 60000.00 |
```

#### `SAVEPOINT`

```sql
BEGIN;

-- Update a record
UPDATE employees SET salary = salary + 5000 WHERE name = 'Alice';

-- Set a savepoint
SAVEPOINT before_salary_increase;

-- Perform another update
UPDATE employees SET salary = salary + 3000 WHERE name = 'Bob';

-- Rollback to the savepoint
ROLLBACK TO SAVEPOINT before_salary_increase;

-- Commit the transaction
COMMIT;

-- Verify the changes
SELECT * FROM employees;
```

Output after `SAVEPOINT` and `ROLLBACK` TO `SAVEPOINT`:

```
| id | name  | salary   |
|----|-------|----------|
| 1  | Alice | 55000.00 |
| 2  | Bob   | 60000.00 |
```

## How TCL commands helps in achieving ACID❓

TCL (Transaction Control Language) commands play a critical role in maintaining the ACID properties of transactions in a database.

- `COMMIT`: Ensures that changes are applied permanently and persistently, satisfying Atomicity and Durability.
- `ROLLBACK`: Reverts changes if necessary, ensuring Atomicity and Consistency.
- `SAVEPOINT`: Allows partial rollbacks, aiding in maintaining Consistency within a transaction.
- `SET TRANSACTION`: Controls Isolation levels, ensuring transactions do not interfere with each other.

## The `SET TRANSACTION` Command

- The `SET TRANSACTION` command in SQL is used to define or change the properties of a transaction, such as its isolation level and access mode. 
- These properties control how transactions interact with each other and affect the visibility of changes made during transactions.

1. **Isolation Levels:**
   - **Definition:** Isolation levels determine how transaction changes are visible to other transactions. They balance the trade-offs between data consistency and concurrency.
   - **Common Isolation Levels:**
     - `READ UNCOMMITTED`: 
       - Allows dirty reads, meaning changes made by uncommitted transactions are visible.
       - Allows transactions to read data that has been modified but not yet committed by other transactions. This means that dirty reads are possible.
       - **Pros:** Provides the highest level of concurrency and performance.
       - **Cons:** Can lead to inconsistent and unreliable data due to dirty reads.
     - `READ COMMITTED`: 
       - Prevents dirty reads; a transaction can only see changes committed before it started.
       - Ensures that a transaction only reads data that has been committed by other transactions. 
       - Dirty reads are prevented, but non-repeatable reads and phantom reads can still occur.
       - **Non-Repeatable Reads:** Occur when a transaction reads the same data twice and finds that the data has changed between reads.
       - **Pros:** Avoids dirty reads, ensuring that data read is always committed.
       - **Cons:** May still face issues with non-repeatable reads.
     - `REPEATABLE READ`: 
       - Ensures that if a row is read once, it will not change during the transaction, preventing non-repeatable reads.
       - Guarantees that if a transaction reads a row, it will see the same value if it reads the row again during the same transaction. Prevents dirty reads and non-repeatable reads, but phantom reads can still occur.
       - **Phantom Reads:** Occur when a transaction reads a set of rows that match a condition, and another transaction inserts, updates, or deletes rows that affect the set before the first transaction is completed.
       - **Pros:** Provides a consistent view of the data during the transaction.
       - **Cons:** Does not prevent phantom reads.
     - `SERIALIZABLE`: 
       - Provides the highest level of isolation by ensuring transactions are executed serially, one after the other, to avoid conflicts.
       - Ensures complete isolation by making transactions appear as if they are executed serially, one after the other. This level prevents dirty reads, non-repeatable reads, and phantom reads.
       - **Pros:** Provides the highest level of data consistency and isolation.
       - **Cons:** Can lead to reduced concurrency and performance because transactions are processed sequentially.

2. **Access Mode:**

   - Specifies whether a transaction should be read-only or read-write.
   - `Read-Only`: Prevents any modification to the database.
   - `Read-Write`: Allows both read and write operations.

### Syntax

The syntax for SET TRANSACTION can vary slightly between SQL databases, but the general form is:

```sql
SET TRANSACTION [TRANSACTION_NAME] 
[READ WRITE | READ ONLY]
[ISOLATION LEVEL {READ UNCOMMITTED | READ COMMITTED | REPEATABLE READ | SERIALIZABLE}];
```

### Oracle SQL Example


```sql
-- Set transaction to be read-only and use the REPEATABLE READ isolation level
SET TRANSACTION READ ONLY;
SET TRANSACTION ISOLATION LEVEL REPEATABLE READ;

BEGIN;

-- Perform transaction operations
UPDATE accounts SET balance = balance - 100 WHERE account_id = 1;

COMMIT;
```

**Explanation:**

- `SET TRANSACTION READ ONLY;` makes the transaction read-only, so no changes can be made to the database.
- `SET TRANSACTION ISOLATION LEVEL REPEATABLE READ;` ensures that if a row is read once during the transaction, it will not change until the transaction is completed.


### MySQL Example

```sql
-- Set the isolation level for the current session
SET SESSION TRANSACTION ISOLATION LEVEL SERIALIZABLE;

START TRANSACTION;

-- Perform transaction operations
UPDATE accounts SET balance = balance - 100 WHERE account_id = 1;

COMMIT;
```

**Explanation:**

- `SET SESSION TRANSACTION ISOLATION LEVEL SERIALIZABLE;` sets the transaction isolation level for the current session, ensuring the highest level of isolation.
- `START TRANSACTION;` begins the transaction.
- `COMMIT;` makes all changes made during the transaction permanent.