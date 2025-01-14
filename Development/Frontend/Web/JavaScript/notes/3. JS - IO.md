[🏠 Home](../../../README.md) <br/>
<a href="../JavaScript.md" > 
<img src="../imgs/js-logo.png" height="20px">
 Home
</a><br/>
[⬅️ Prev Chap - Variable and Data Types](./2.%20JS%20-%20Variables%20&%20Datatypes.md)
[➡️ Next Chap - Operators](./4.%20JS%20-%20Operators.md)

---

<h1 style="text-align: center">3. JS Input and Output</h1>

## Index
- [Index](#index)
- [Input](#input)
  - [1. Using `prompt()`](#1-using-prompt)
  - [2. Using HTML Input Elements](#2-using-html-input-elements)
  - [3. Using Event Listeners](#3-using-event-listeners)
  - [4. Using Command Line Input (Node.js)](#4-using-command-line-input-nodejs)
  - [5. Using URL Parameters](#5-using-url-parameters)
  - [6. Using `confirm()`](#6-using-confirm)
  - [7. Using Custom Dialogs (e.g., Modal Windows)](#7-using-custom-dialogs-eg-modal-windows)
- [Output](#output)
  - [1. Inner HTML](#1-inner-html)
  - [2. `document.write()`](#2-documentwrite)
  - [3. Using `window.alert()`](#3-using-windowalert)
  - [4. Using `console.log()`](#4-using-consolelog)
  - [5. JavaScript Print](#5-javascript-print)

---

## Input

### 1. Using `prompt()`

The `prompt()` method displays a dialog box with a message and an input field for the user.

**Eaxmple:**
```js
let name = prompt("Enter your name:");
console.log("Hello, " + name + "!");
```

- **Use Case:** Simple user input in browsers.

- **Limitation:** Works only in browsers and pauses script execution until input is provided.

---

[⬆️ Back to Top ⬆️](#index)

### 2. Using HTML Input Elements

JavaScript can capture input values from HTML form elements.

**Example:**

```html
<!DOCTYPE html>
<html>
<body>
  <label for="username">Enter your name:</label>
  <input type="text" id="username">
  <button onclick="getInput()">Submit</button>

  <script>
    function getInput() {
      let name = document.getElementById("username").value;
      console.log("Hello, " + name + "!");
    }
  </script>
</body>
</html>
```

---

[⬆️ Back to Top ⬆️](#index)

### 3. Using Event Listeners

JavaScript can capture input in real-time using event listeners.

**Example:**

```html
<!DOCTYPE html>
<html>
<body>
  <label for="textInput">Type something:</label>
  <input type="text" id="textInput">

  <script>
    document.getElementById("textInput").addEventListener("input", function(event) {
      console.log("Current input: " + event.target.value);
    });
  </script>
</body>
</html>
```
---

[⬆️ Back to Top ⬆️](#index)

### 4. Using Command Line Input (Node.js)

In Node.js, you can take input from the command line using the `readline` module.

**Example:**

```js
const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question("Enter your name: ", function(name) {
  console.log("Hello, " + name + "!");
  rl.close();
});
```
---

[⬆️ Back to Top ⬆️](#index)

### 5. Using URL Parameters

You can take input from URL query strings.

```js
// URL: https://example.com?name=John
const urlParams = new URLSearchParams(window.location.search);
let name = urlParams.get("name");
console.log("Name from URL: " + name);
```

---

[⬆️ Back to Top ⬆️](#index)

### 6. Using `confirm()`

The `confirm()` method takes a simple yes/no input from the user.

**Example:**

```js
let proceed = confirm("Do you want to continue?");
if (proceed) {
  console.log("User chose to continue.");
} else {
  console.log("User canceled.");
}
```

---

[⬆️ Back to Top ⬆️](#index)

### 7. Using Custom Dialogs (e.g., Modal Windows)

Create custom input dialogs using HTML and CSS, and capture the data with JavaScript.

**Example:**

```html
<!DOCTYPE html>
<html>
<body>
  <button onclick="openDialog()">Open Dialog</button>
  <div id="dialog" style="display:none;">
    <label for="customInput">Enter value:</label>
    <input type="text" id="customInput">
    <button onclick="submitDialog()">Submit</button>
  </div>

  <script>
    function openDialog() {
      document.getElementById("dialog").style.display = "block";
    }
    function submitDialog() {
      let value = document.getElementById("customInput").value;
      console.log("Custom input: " + value);
      document.getElementById("dialog").style.display = "none";
    }
  </script>
</body>
</html>
```

---

[⬆️ Back to Top ⬆️](#index)

## Output

JavaScript can "display" data in different ways:

- Writing into an HTML element, using `innerHTML`.
- Writing into the HTML output using `document.write()`.
- Writing into an alert box, using `window.alert()`.
- Writing into the browser console, using `console.log()`.

---

[⬆️ Back to Top ⬆️](#index)
### 1. Inner HTML

```html
<!DOCTYPE html>
<html>
  <body>

    <h1>My First Web Page</h1>
    <p>My First Paragraph</p>

    <p id="demo"></p>

    <script>
      document.getElementById("demo").innerHTML = 5 + 6;
    </script>

  </body>
</html>
```

---

[⬆️ Back to Top ⬆️](#index)

### 2. `document.write()`

```html
<!DOCTYPE html>
<html>
  <body>

    <h1>My First Web Page</h1>
    <p>My first paragraph.</p>

    <script>
      document.write(5 + 6);
    </script>

  </body>
</html>
```

Note: Using 'document.write()' after an HTML document is loaded, will delete all existing HTML:

```html
<!DOCTYPE html>
<html>
  <body>

    <h1>My First Web Page</h1>
    <p>My first paragraph.</p>

    <button type="button" onclick="document.write(5 + 6)">Try it</button>

  </body>
</html>
```

[Try](https://www.w3schools.com/js/tryit.asp?filename=tryjs_output_write_over)

---

[⬆️ Back to Top ⬆️](#index)

### 3. Using `window.alert()`

```html
<!DOCTYPE html>
<html>
<body>

<h1>My First Web Page</h1>
<p>My first paragraph.</p>

<script>
window.alert(5 + 6);
</script>

</body>
</html>
```

You can skip the window keyword.

In JavaScript, the window object is the global scope object. This means that variables, properties, and methods by default belong to the window object. This also means that specifying the window keyword is optional

---

[⬆️ Back to Top ⬆️](#index)

### 4. Using `console.log()`

```html
<!DOCTYPE html>
<html>
<body>

<script>
console.log(5 + 6);
</script>

</body>
</html>
```

---

[⬆️ Back to Top ⬆️](#index)

### 5. JavaScript Print

JavaScript does not have any print object or print methods.

You cannot access output devices from JavaScript.

The only exception is that you can call the `window.print()` method in the browser to print the content of the current window.

```html
<!DOCTYPE html>
<html>
<body>

<button onclick="window.print()">Print this page</button>

</body>
</html>
````

---

[🏠 Home](../../../README.md) <br/>
<a href="../JavaScript.md" > 
<img src="../imgs/js-logo.png" height="20px">
 Home
</a><br/>
[⬅️ Prev Chap - Variable and Data Types](./2.%20JS%20-%20Variables%20&%20Datatypes.md)
[➡️ Next Chap - Operators](./4.%20JS%20-%20Operators.md)