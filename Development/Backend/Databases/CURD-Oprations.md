<h1> CURD Operations</h1>

---

## Index
- [Index](#index)
- [1. Create DB](#1-create-db)
- [2. Create a table / collection](#2-create-a-table--collection)
- [3. Insert a record](#3-insert-a-record)
- [4. Insert a record based on condition](#4-insert-a-record-based-on-condition)
- [5. Read a record](#5-read-a-record)
- [6. Read a record based on condition](#6-read-a-record-based-on-condition)
- [7. Update a record](#7-update-a-record)
- [8. Update a record based on condition](#8-update-a-record-based-on-condition)
- [9. Delete a record](#9-delete-a-record)
- [10. Delete a record based on condition](#10-delete-a-record-based-on-condition)
- [11. Update a table / collection](#11-update-a-table--collection)

---

## 1. Create DB

SQL

```sql
CREATE DATABASE SchoolDB;

USE SchoolDB;
```

MongoDB
```js
use SchoolDB;
```

---

## 2. Create a table / collection

SQL

```sql
CREATE TABLE Students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    grade VARCHAR(2)
);
```

MongoDB
```
db.createCollection("Students");
```

---

## 3. Insert a record

SQL

```sql
INSERT INTO Students (name, age, grade)
VALUES ('John Doe', 20, 'A');
```

MongoDB
```
db.Students.insertOne({ name: "John Doe", age: 20, grade: "A" });
```

---

## 4. Insert a record based on condition

SQL

```sql
INSERT INTO Students (name, age, grade)
SELECT 'Jane Doe', 22, 'B'
WHERE NOT EXISTS (
    SELECT 1 FROM Students WHERE name = 'Jane Doe'
);
```

MongoDB
```
if (!db.Students.findOne({ name: "Jane Doe" })) {
    db.Students.insertOne({ name: "Jane Doe", age: 22, grade: "B" });
}
```

---

## 5. Read a record

SQL

```sql
SELECT * FROM Students WHERE id = 1;
```

MongoDB
```
db.Students.findOne({ _id: ObjectId("someObjectId") });
```

---

## 6. Read a record based on condition

SQL

```sql
SELECT * FROM Students WHERE grade = 'A';
```

MongoDB
```
db.Students.findOne({ _id: ObjectId("someObjectId") });
```

---

## 7. Update a record

SQL

```sql
UPDATE Students
SET grade = 'A+'
WHERE id = 1;
```

MongoDB
```
db.Students.updateOne(
    { _id: ObjectId("someObjectId") },
    { $set: { grade: "A+" } }
);
```

---

## 8. Update a record based on condition

SQL

```sql
UPDATE Students
SET grade = 'B+'
WHERE age > 21;
```

MongoDB
```
db.Students.updateMany(
    { age: { $gt: 21 } },
    { $set: { grade: "B+" } }
);
```

---

## 9. Delete a record

SQL

```sql
DELETE FROM Students WHERE id = 1;
```

MongoDB
```
db.Students.deleteOne({ _id: ObjectId("someObjectId") });
```

---

## 10. Delete a record based on condition

SQL

```sql
DELETE FROM Students WHERE grade = 'C';
```

MongoDB
```
db.Students.deleteMany({ grade: "C" });
```

---

## 11. Update a table / collection

SQL

```sql
```

MongoDB
```
```

---
