[🏠 Home](../../../README.md) <br/>
[Node.js Home](../notes/)

---

<h1 style="text-align: center">4. Node.js Core Modules</h1>

## Index
- [Index](#index)
- [Introduction](#introduction)
- [Global Objects and Modules](#global-objects-and-modules)
- [Importing/Exporting Modules (`require` and `module.exports`)](#importingexporting-modules-require-and-moduleexports)
	- [2.1. Importing Modules with `require()`](#21-importing-modules-with-require)
	- [2.2 Exporting Modules with module.exports](#22-exporting-modules-with-moduleexports)
- [Built-In Core Modules](#built-in-core-modules)

---

## Introduction

Node.js comes with a set of built-in modules that provide essential functionalities for building server-side applications. These modules are part of the Core API and don't require installation through a package manager (like npm). By leveraging these core modules, developers can access system functionalities such as file manipulation, networking, and operating system interaction.

---

[⬆️ Back to TOP ⬆️](#index)

## Global Objects and Modules

Node.js provides several global objects that are available in every module and can be accessed without importing them. These objects represent various utilities, such as file system access, process management, and timers.

**Key Global Objects:**

1. `global`

   - This is the global namespace object in Node.js. Any variable attached to global can be accessed anywhere in the Node.js application.
   - Example:

	```js
	global.myGlobalVar = 'This is global';
	// Output: 'This is global'
	console.log(global.myGlobalVar); 
	```

2. `process`

   - Provides information about and control over the current Node.js process. It is widely used to access environment variables, handle events like exiting the process, and more.
   - Example:

	```js
	// Access environment variables
	console.log(process.env.NODE_ENV); 
	// Exit the process with status code 1
	process.exit(1); 
	```

3. `__dirname`

   - Represents the directory name of the current module file.
   - Example:

	```js
	console.log(__dirname); 
	// Outputs the path to the current directory
	```

4. `__filename`

   - Represents the file name of the current module, including the full path.
   - Example:

	```js
	console.log(__filename); 
	// Outputs the path to the current file
	```

5. Timers

   - These include `setTimeout()`, `setInterval()`, and `setImmediate()` which are available globally and don’t need to be required from a module.
   - Example:

```js
setTimeout(() => {
  console.log('Executed after 2 seconds');
}, 2000);
```

**Global Scope Consideration:**

- Unlike the browser's global window object, Node.js modules have their own scope. 
- This means that variables or functions declared in one file are not accessible in another unless they are explicitly exported and imported.

---

[⬆️ Back to TOP ⬆️](#index)

## Importing/Exporting Modules (`require` and `module.exports`)

- Modules in Node.js are files or libraries that help break your application into reusable pieces of code. 
- By default, each file in Node.js is treated as a module. 
- Node.js provides mechanisms to both import and export code across files.

### 2.1. Importing Modules with `require()`

- `require()` is used to load modules in Node.js, which can be:
  - Core modules (e.g., `fs`, `path`)
  - Custom modules (e.g., user-created files)
  - Third-party modules installed via npm

```js
// Importing the 'fs' core module
const fs = require('fs');

// Importing a custom module (e.g., './myModule.js')
const myModule = require('./myModule');
```

---

### 2.2 Exporting Modules with module.exports

- `module.exports` is used to export functions, objects, or variables from a module so they can be imported and used in other modules.
- Example:

```js
// myModule.js
function greet(name) {
  return `Hello, ${name}!`;
}

module.exports = greet; 
// Exporting the 'greet' function

// -----

// In another file (app.js)
const greet = require('./myModule');
console.log(greet('John')); 
// Output: 'Hello, John!'
```

**ES6 Syntax (`import/export`)**

- Since Node.js v12, ES6-style import/export is natively supported using the .mjs extension.

Example:

```js
// myModule.js
export function greet(name) {
  return `Hello, ${name}!`;
}

// -----

// app.mjs
import { greet } from './myModule.mjs';
console.log(greet('John')); 
// Output: 'Hello, John!'

```

[⬆️ Back to TOP ⬆️](#index)

## Built-In Core Modules

- Node.js provides a variety of core modules that come pre-installed with Node.js. 
- These modules are foundational and provide access to crucial system functionalities like file systems, network, and operating systems.

👉 [Complete list of Node.js Modules - w3schools.com](https://www.w3schools.com/nodejs/ref_modules.asp)

| Module | Decription |
|----------|--------------------|
| [`assert`](https://www.w3schools.com/nodejs/ref_assert.asp) | Provides a set of assertion tests |
| [`buffer`](https://www.w3schools.com/nodejs/ref_buffer.asp) | To handle binary data |
| `child_process` | To run a child process |
| [`cluster`](https://www.w3schools.com/nodejs/ref_cluster.asp) | To split a single Node process into multiple processes |
| [`crypto`](https://www.w3schools.com/nodejs/ref_crypto.asp) | To handle OpenSSL cryptographic functions |
| [`dgram`](https://www.w3schools.com/nodejs/ref_dgram.asp) | Provides implementation of UDP datagram sockets |
| [`dns`](https://www.w3schools.com/nodejs/ref_dns.asp) | To do DNS lookups and name resolution functions |
| `domain` | (Deprecated) To handle unhandled errors |
| [`events`](https://www.w3schools.com/nodejs/ref_events.asp) | To handle events |
| [`fs`](https://www.w3schools.com/nodejs/ref_fs.asp) | To handle the file system |
| [`http`](https://www.w3schools.com/nodejs/ref_http.asp) | To make Node.js act as an HTTP server |
| [`https`](https://www.w3schools.com/nodejs/ref_https.asp) | To make Node.js act as an HTTPS server. |
| [`net`]() | To create servers and clients |
| [`os`]() | Provides information about the operation system |
| [`path`]() | To handle file paths |
| [`punycode`]() | (Deprecated) A character encoding scheme |
| [`querystring`]() | To handle URL query strings |
| [`readline`]() | To handle readable streams one line at the time |
| [`stream`]() | To handle streaming data |
| [`string_decoder`]() | To decode buffer objects into strings |
| [`timers`]() | To execute a function after a given number of milliseconds |
| [`tls`]() | To implement TLS and SSL protocols |
| `tty` |  |
| [`url`]() | To parse URL strings |
| [`util`]() | To access utility functions |
| `v8` | To access information about V8 (the JavaScript engine) |
| [`vm`]() | To compile JavaScript code in a virtual machine |
| [`zlib`]() | To compress or decompress files |


---

[🏠 Home](../../../README.md) <br/>
[Node.js Home](../notes/)