[🏠 Home](../../../README.md) <br/>
[Node.js Home](../notes/)

---

<h1 style="text-align: center">5. Node.js File System Operations</h1>

## Index
- [Index](#index)
- [1 Reading and Writing Files (`fs.readFile`, `fs.writeFile`)](#1-reading-and-writing-files-fsreadfile-fswritefile)
  - [1.1 Reading Files (`fs.readFile`)](#11-reading-files-fsreadfile)
  - [1.2. Writing Files (`fs.writeFile`)](#12-writing-files-fswritefile)
- [2. Synchronous vs. Asynchronous Operations](#2-synchronous-vs-asynchronous-operations)
  - [2.1. Asynchronous (Non-Blocking) Operations](#21-asynchronous-non-blocking-operations)
- [3. Working with Directories and Streams](#3-working-with-directories-and-streams)
  - [3.1 Working with Directories](#31-working-with-directories)
  - [3.2 Working with Streams](#32-working-with-streams)

---

## 1 Reading and Writing Files (`fs.readFile`, `fs.writeFile`)

Node.js offers a variety of methods for reading from and writing to files. The fs module makes it easy to handle these operations asynchronously (non-blocking) or synchronously (blocking).

### 1.1 Reading Files (`fs.readFile`)

`fs.readFile()` is used to asynchronously read the content of a file. It takes the file path, the encoding (optional), and a callback function that gets executed after reading the file.

**Example: Asynchronous version:**

```js
const fs = require('fs');

fs.readFile('example.txt', 'utf-8', (err, data) => {
  if (err) {
    console.error('Error reading file:', err);
  } else {
    console.log('File content:', data);
  }
});
```

- **Parameters:**
  - The first parameter is the file path (e.g., `example.txt`).
  - The second optional parameter is the file encoding (e.g., `utf-8` to read text files).
  - The callback function has two arguments: err (for error handling) and data (the file content).

**Synchronous Version (`fs.readFileSync`)**

If you prefer to read files in a blocking manner, you can use `fs.readFileSync()`. It doesn’t require a callback, and the file content is returned directly.

```js
const fs = require('fs');

try {
  const data = fs.readFileSync('example.txt', 'utf-8');
  console.log('File content:', data);
} catch (err) {
  console.error('Error reading file:', err);
}
```

---

[⬆️ Back to TOP ⬆️](#index)

### 1.2. Writing Files (`fs.writeFile`)

- `fs.writeFile()` is used to write data to a file asynchronously. 
- If the file doesn't exist, it creates a new file. 
- If it does exist, it will overwrite the content unless otherwise specified.

**Example:** Writing to a File Asynchronously

```js
const fs = require('fs');

const content = 'This is the content to be written to the file.';

fs.writeFile('example.txt', content, (err) => {
  if (err) {
    console.error('Error writing to file:', err);
  } else {
    console.log('File written successfully');
  }
});
```

- **Parameters:**
  - The first parameter is the file path (e.g., `example.txt`).
  - The second parameter is the data to write to the file.
  - The callback function receives an err argument for error handling.

**Synchronous Version (`fs.writeFileSync`)**

You can use `fs.writeFileSync()` to write files in a blocking manner.

```js
const fs = require('fs');

const content = 'This is the content to be written to the file.';

try {
  fs.writeFileSync('example.txt', content);
  console.log('File written successfully');
} catch (err) {
  console.error('Error writing to file:', err);
}
```

---

[⬆️ Back to TOP ⬆️](#index)

## 2. Synchronous vs. Asynchronous Operations

- One of the fundamental concepts in Node.js is its asynchronous, non-blocking I/O model. 
- This means that most operations, like reading files or querying databases, are asynchronous by default. 
- However, Node.js also provides synchronous versions of these operations.

### 2.1. Asynchronous (Non-Blocking) Operations

- In an asynchronous operation, Node.js initiates the task and continues executing the next lines of code without waiting for the task to complete.
- Once the operation finishes, a callback function is called to handle the result.

**Advantages:**

- Non-blocking: The event loop continues to process other tasks while waiting for the I/O operation to complete.
Better performance for I/O-bound operations.

Example (Reading a file asynchronously):

```js
const fs = require('fs');

fs.readFile('example.txt', 'utf-8', (err, data) => {
  if (err) {
    console.error('Error reading file:', err);
  } else {
    console.log('File content:', data);
  }
});

console.log('This will execute before the file is read');
```

---

[⬆️ Back to TOP ⬆️](#index)

## 3. Working with Directories and Streams

In addition to reading and writing files, Node.js provides methods to interact with directories and manage large data using streams.

### 3.1 Working with Directories
Node.js allows you to create, read, and delete directories through the fs module.

**Creating a Directory (`fs.mkdir`)**

- Asynchronously:

```js
const fs = require('fs');

fs.mkdir('new-directory', (err) => {
  if (err) {
    console.error('Error creating directory:', err);
  } else {
    console.log('Directory created successfully');
  }
});
```

- Synchronously:

```js
const fs = require('fs');

try {
  fs.mkdirSync('new-directory');
  console.log('Directory created successfully');
} catch (err) {
  console.error('Error creating directory:', err);
}
```

**Reading a Directory (`fs.readdir`)**

```js
const fs = require('fs');

fs.readdir('.', (err, files) => {
  if (err) {
    console.error('Error reading directory:', err);
  } else {
    console.log('Directory contents:', files);
  }
});
```

**Removing a Directory (`fs.rmdir`)**

```js
const fs = require('fs');

fs.rmdir('new-directory', (err) => {
  if (err) {
    console.error('Error removing directory:', err);
  } else {
    console.log('Directory removed successfully');
  }
});
```

---

[⬆️ Back to TOP ⬆️](#index)

### 3.2 Working with Streams

Streams are used to handle large amounts of data efficiently by processing the data in chunks, rather than loading the entire file into memory at once. Streams are a good choice when working with large files or when reading/writing data over networks.

Streams in Node.js are objects that let you read data from a source or write data to a destination in a continuous manner. There are four types of streams in Node.js:

1. **Readable**: Used to read data.
2. **Writable**: Used to write data.
3. **Duplex**: Can be both readable and writable (e.g., a TCP socket).
4. **Transform**: A duplex stream that can modify or transform the data as it is read or written (e.g., a compression stream).

**Reading a File with Streams**

Instead of loading the entire file at once, you can read it in chunks using streams.

```js
const fs = require('fs');

const readStream = fs.createReadStream('largefile.txt', 'utf-8');

readStream.on('data', (chunk) => {
  console.log('New chunk received:', chunk);
});

readStream.on('end', () => {
  console.log('Reading complete');
});

readStream.on('error', (err) => {
  console.error('Error reading file:', err);
});
```

- **How it works:**
  - `fs.createReadStream()` creates a readable stream.
  - The `data` event is fired whenever a chunk of data is available.
  - The `end` event is triggered when the entire file has been read.
  - The `error` event handles any errors during the read operation.

---

**Writing a File with Streams**

You can write data in chunks using writable streams.

```js
const fs = require('fs');

const writeStream = fs.createWriteStream('output.txt');

writeStream.write('This is the first line.\n');
writeStream.write('This is the second line.\n');

writeStream.end('This is the final line.');

writeStream.on('finish', () => {
  console.log('Writing completed');
});

writeStream.on('error', (err) => {
  console.error('Error writing to file:', err);
});
```

---

[🏠 Home](../../../README.md) <br/>
[Node.js Home](../notes/)