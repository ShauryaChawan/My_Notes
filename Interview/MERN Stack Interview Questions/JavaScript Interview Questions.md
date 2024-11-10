<h1>CSS Interview Questions</h1>

## Index

- [Index](#index)
- [Basic JavaScript Questions](#basic-javascript-questions)
	- [1. ✅ What is JavaScript, and how is it different from Java?](#1--what-is-javascript-and-how-is-it-different-from-java)
	- [2. ✅ How do you include JavaScript in an HTML document?](#2--how-do-you-include-javascript-in-an-html-document)
	- [3. ✅ What are the different data types in JavaScript?](#3--what-are-the-different-data-types-in-javascript)
	- [4. ✅ What is the difference between `var`, `let`, and `const`?](#4--what-is-the-difference-between-var-let-and-const)
	- [5. ✅ What are global and local variables in JavaScript?](#5--what-are-global-and-local-variables-in-javascript)
	- [6. ✅ What is variable shadowing in JavaScript?](#6--what-is-variable-shadowing-in-javascript)
	- [7. ✅ What is hoisting in JavaScript?](#7--what-is-hoisting-in-javascript)
	- [8. ✅ What is temporal dead zone (TDZ)?](#8--what-is-temporal-dead-zone-tdz)
	- [9. ✅ What is the difference between `undefined` and `null`?](#9--what-is-the-difference-between-undefined-and-null)
	- [10. ✅ What are JavaScript functions? How do you declare a function?](#10--what-are-javascript-functions-how-do-you-declare-a-function)
	- [11. ✅ What is the difference between parameters and arguments?](#11--what-is-the-difference-between-parameters-and-arguments)
	- [12. ✅ What is the purpose of the return statement in JavaScript functions?](#12--what-is-the-purpose-of-the-return-statement-in-javascript-functions)
	- [13. What are arrow functions in JavaScript?](#13-what-are-arrow-functions-in-javascript)
	- [14. How do you declare an arrow function with and without parameters?](#14-how-do-you-declare-an-arrow-function-with-and-without-parameters)
	- [15. What is the difference between regular functions and arrow functions?](#15-what-is-the-difference-between-regular-functions-and-arrow-functions)
	- [16. What is an object in JavaScript?](#16-what-is-an-object-in-javascript)
	- [17. How do you create an object in JavaScript?](#17-how-do-you-create-an-object-in-javascript)
	- [18. How do you access and modify object properties?](#18-how-do-you-access-and-modify-object-properties)
	- [19. What are arrays in JavaScript, and how do you declare them?](#19-what-are-arrays-in-javascript-and-how-do-you-declare-them)
	- [20. How do you add or remove elements from an array in JavaScript?](#20-how-do-you-add-or-remove-elements-from-an-array-in-javascript)
	- [21. What is the difference between push(), pop(), shift(), and unshift()?](#21-what-is-the-difference-between-push-pop-shift-and-unshift)
	- [22. What are JavaScript loops, and how do you create a for loop?](#22-what-are-javascript-loops-and-how-do-you-create-a-for-loop)
	- [23. How do you create a while loop and a do...while loop in JavaScript?](#23-how-do-you-create-a-while-loop-and-a-dowhile-loop-in-javascript)
	- [24. What is the difference between for...in and for...of loops in JavaScript?](#24-what-is-the-difference-between-forin-and-forof-loops-in-javascript)
	- [25. How do you use the break and continue statements in loops?](#25-how-do-you-use-the-break-and-continue-statements-in-loops)
	- [26. What is the typeof operator in JavaScript?](#26-what-is-the-typeof-operator-in-javascript)
	- [27. What is the == and === operator, and what’s the difference?](#27-what-is-the--and--operator-and-whats-the-difference)
	- [28. What is type coercion in JavaScript?](#28-what-is-type-coercion-in-javascript)
	- [29. What are conditional statements in JavaScript (e.g., if, else, else if)?](#29-what-are-conditional-statements-in-javascript-eg-if-else-else-if)
	- [30. What is a switch statement in JavaScript, and how does it work?](#30-what-is-a-switch-statement-in-javascript-and-how-does-it-work)
	- [31. What are template literals in JavaScript?](#31-what-are-template-literals-in-javascript)
	- [32. What is the spread operator (...), and how is it used?](#32-what-is-the-spread-operator--and-how-is-it-used)
	- [33. What are destructuring assignments in JavaScript?](#33-what-are-destructuring-assignments-in-javascript)
	- [34. What is the difference between slice() and splice()?](#34-what-is-the-difference-between-slice-and-splice)
	- [35. How do you convert a string to a number in JavaScript?](#35-how-do-you-convert-a-string-to-a-number-in-javascript)
	- [36. What is the isNaN() function used for in JavaScript?](#36-what-is-the-isnan-function-used-for-in-javascript)
	- [37. How do you create a timer using setTimeout() and setInterval() in JavaScript?](#37-how-do-you-create-a-timer-using-settimeout-and-setinterval-in-javascript)
	- [38. What is event handling in JavaScript?](#38-what-is-event-handling-in-javascript)
	- [39. How do you add an event listener in JavaScript?](#39-how-do-you-add-an-event-listener-in-javascript)
	- [40. What is the DOM (Document Object Model) in JavaScript?](#40-what-is-the-dom-document-object-model-in-javascript)
- [Intermediate JavaScript Questions](#intermediate-javascript-questions)
	- [69. What is function currying in JavaScript?](#69-what-is-function-currying-in-javascript)
- [Advanced JavaScript Questions](#advanced-javascript-questions)
- [JavaScript Performance Optimizations](#javascript-performance-optimizations)
- [Additional Advanced and Miscellaneous JavaScript Questions](#additional-advanced-and-miscellaneous-javascript-questions)

---

## Basic JavaScript Questions

### 1. ✅ What is JavaScript, and how is it different from Java?

JavaScript is a dynamic, interpreted scripting language primarily for web development, whereas Java is a compiled, statically-typed language used in various applications beyond web.

---

### 2. ✅ How do you include JavaScript in an HTML document?

- **Inline JS**
  - Directly in HTML elements using event attributes like `onclick`.

```html
<button onclick="alert('Hello!')">Click Me</button>
```

- **Internal JS**
  - Inside a `<script>` tag in the HTML, usually in `<head>` or `<body>`.

```html
<!-- Inside head with defer -->
<head>
    <script src="script.js" defer></script>
</head>

<!-- Inside body -->
<body>
    <!-- Content -->
    <script>
        console.log("This script runs after the content is loaded.");
    </script>
</body>
```

- **External JS**
  - Link an external .js file using `<script src="path/file.js"></script>`.

`index.html`
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <title>External JavaScript Example</title>
    <script src="script.js"></script>
</head>
<body>
    <button onclick="greet()">Click Me</button>
</body>
</html>
```

`script.js`
```js
function greet() {
    alert("Hello from external JavaScript!");
}
```

- **`defer` and `async`**
  - `defer`: Defers execution until the HTML document is fully parsed. This ensures scripts are executed in the order they are included in the document.
  - `async`: Loads the script asynchronously, so it will download in parallel with the HTML document parsing. Once downloaded, it will execute immediately, which might be out of order if there are multiple scripts.

```html
<!-- Loads the script after HTML parsing -->
<script src="script.js" defer></script>

<!-- Loads asynchronously without waiting for HTML parsing -->
<script src="script.js" async></script>
```

- **JS Module**
  - Using the `type="module"` attribute allows you to write JavaScript as a module, which enables scoped variables and the ability to import/export functions or variables.
  - Modules automatically use `defer`, so they wait for the HTML parsing to finish before running.

```html
<script type="module">
    import { greet } from './greet.js';
    greet();
</script>
```

---

### 3. ✅ What are the different data types in JavaScript?

JavaScript has primitive data types: `string`, `number`, `boolean`, `undefined`, `null`, `symbol`, and `bigint`, plus complex types like `object`.

---

### 4. ✅ What is the difference between `var`, `let`, and `const`?

- `var`: Function-scoped, reassignable, and hoisted (initialized as undefined).
- `let`: Block-scoped, reassignable, and hoisted with a temporal dead zone.
- `const`: Block-scoped, not reassignable, and requires initialization.

1. `var`

   - **Scope:** Function-scoped, meaning it's available within the function where it's declared. It’s not block-scoped, so it ignores `{ }` boundaries in non-function blocks.
   - **Reassignable:** Yes, `var` variables can be reassigned and even redeclared within the same scope.
   - **Hoisting:** Variables declared with `var` are hoisted to the top of their scope and initialized with `undefined`.

```js
var name = "Alice";
var name = "Bob"; // Re-declaration allowed
console.log(name); // "Bob"
```

2. `let`

- **Scope:** Block-scoped, so it's only accessible within the `{ }` block where it’s defined.
- **Reassignable:** Yes, `let` variables can be reassigned but not redeclared within the same scope.
- **Hoisting:** `let` is also hoisted, but it’s not initialized until the line where it’s defined, leading to a "temporal dead zone" if accessed before initialization.

```js
let age = 25;
age = 26; // Reassignment allowed
console.log(age); // 26
```

3. `const`

- **Scope:** Block-scoped, just like `let`.
- **Reassignable:** No, `const` variables cannot be reassigned or redeclared. They must be initialized when declared.
- **Immutability:** The variable itself cannot be reassigned, but if it's an object or array, the contents can still be changed.

```js
const city = "New York";
//    city = "Los Angeles"; // Error: Assignment to constant variable
```

---

### 5. ✅ What are global and local variables in JavaScript?

1. **Global Variables**: Global variables are declared outside of any function or block and can be accessed from anywhere in the code, including inside functions.

```js
let globalVar = "I am a global variable";

function displayGlobalVar() {
    console.log(globalVar); // Accessible here
}

displayGlobalVar(); // Output: I am a global variable
console.log(globalVar); // Output: I am a global variable
```

2. **Local Variables**: Local variables are declared within a function or a block and can only be accessed within that specific function or block. They are not accessible from outside.

```js
function displayLocalVar() {
    let localVar = "I am a local variable";
    console.log(localVar); // Accessible here
}

displayLocalVar(); // Output: I am a local variable
console.log(localVar); // ReferenceError: localVar is not defined
```

---

### 6. ✅ What is variable shadowing in JavaScript?

- Variable shadowing in JavaScript occurs when a variable declared within a certain scope (like a function or block) has the same name as a variable in an outer scope.
- In this case, the inner variable "shadows" or overrides the outer variable within that scope, meaning the inner variable takes precedence and the outer one becomes inaccessible within the block.
- Rules of shadowing:
  - `var` can be shadowed by `let` and `const`, but vice versa is not allowed.
  - `let` and `const` can shadow each other

```js
function test(){
	var a = "hello";
	let b = "world";
	const c = "byee";

	{
		let a = "hii";
		// const a = "hii" // allowed ✅
		
		// var b = "planet"; // not allowed ❌
		const b = "planet";
		
		// var c = "Byee"; // not allowed ❌
		let c = "Byee";
		console.log(a);
		console.log(b);
		console.log(c);
	}
}

test();
```

---

### 7. ✅ What is hoisting in JavaScript?

- Hoisting is a JavaScript mechanism where variable and function declarations are moved, or "hoisted," to the top of their containing scope (function or global scope) during the compile phase before any code is executed.
- This means you can use variables and functions before declaring them in the code.
- However, while declarations are **hoisted**, **initializations** (assignments) are not. This often leads to unexpected behavior, especially with `var`, `let`, and `const`.

**How Hoisting Works with `var`, `let`, and `const`**

1. `var` Hoisting:

   - Variables declared with `var` are hoisted to the top of their scope and initialized with `undefined`.
   - You can reference `var` variables before their declaration without an error, but the value will be undefined.

	```js
	console.log(a); // undefined, due to hoisting
	var a = "Alice";
	```

	This is because the `var` declaration is hoisted as if it were written like this:

	```js
	var a;
	console.log(a); // undefined
	a = "Alice";
	```

2. `let` and `const` Hoisting:

- Variables declared with `let` and `const` are also hoisted, but they are not initialized immediately.
- They remain in a "Temporal Dead Zone" (TDZ) from the start of the block until the line where they are declared.
- Accessing them before declaration causes a ReferenceError, unlike var, which simply logs `undefined`.

```js
console.log(age); // ReferenceError: Cannot access 'age' before initialization
let age = 30;
```

Here, `age` exists in memory but is in the TDZ, so it cannot be accessed until the `let` statement.

**Function Hoisting**

- Functions declared with the `function` keyword are hoisted to the top of their scope with their definition.
- This means you can call a function before it appears in the code.

```js
greet(); // "Hello!"
function greet() {
   console.log("Hello!");
}
```

**Note:** Function expressions and arrow functions assigned to `var`, `let`, or `const` do not get fully hoisted. Only their variable declarations are hoisted, not their definitions.

```js
sayHello(); // TypeError: sayHello is not a function
var sayHello = function() {
   console.log("Hello!");
};
```

---

### 8. ✅ What is temporal dead zone (TDZ)?

- The Temporal Dead Zone (TDZ) is the period between the start of the block and the point at which the variable is declared and initialized.
- During this period, the variable exists but cannot be accessed, and attempting to do so will result in a `ReferenceError`.
- The TDZ affects variables declared with `let` and `const` because, unlike `var`, they are not automatically initialized with undefined.

---

### 9. ✅ What is the difference between `undefined` and `null`?

| Feature           | `undefined`                               | `null`                                 |
|-------------------|-------------------------------------------|----------------------------------------|
| **Assignment**    | Automatically assigned by JavaScript      | Assigned intentionally by developers   |
| **Meaning**       | Variable is declared but uninitialized    | Explicitly "no value" or "empty"       |
| **Type**          | `"undefined"`                             | `"object"` (quirk in JavaScript)       |
| **Equality Check**| `undefined == null` is `true` (loose check) | `undefined === null` is `false`        |

---

### 10. ✅ What are JavaScript functions? How do you declare a function?

In JavaScript, functions are reusable blocks of code that perform specific tasks. They can take parameters (inputs) and return values.

1. **Function Declaration:** Defined with function and hoisted.

```js
function greet() { console.log("Hello!"); }
```

2. **Function Expression:** Function assigned to a variable; not hoisted.

```js
const greet = function() { console.log("Hello!"); };
```

3. **Arrow Function:** Shorter syntax; no this context.

```js
const greet = () => { console.log("Hello!"); };
```

---

### 11. ✅ What is the difference between parameters and arguments?

**Parameters:** These are variables listed in the function's definition. They act as placeholders for the values that the function will use.

```js
function greet(name) { // `name` is a parameter
    console.log("Hello, " + name);
}
```

**Arguments:** These are the actual values passed to the function when it’s called. They are assigned to the function’s parameters.

```js
greet("Alice"); // "Alice" is an argument
```

---

### 12. ✅ What is the purpose of the return statement in JavaScript functions?

**End Function Execution:** It stops the function’s execution immediately. Any code after return within the function won’t run.

**Return a Value:** It sends a value back to the function caller, allowing the function to output a result or data that can be stored or used elsewhere in the program.

---

### 13. What are arrow functions in JavaScript?

---

### 14. How do you declare an arrow function with and without parameters?

---

### 15. What is the difference between regular functions and arrow functions?

---

### 16. What is an object in JavaScript?

---

### 17. How do you create an object in JavaScript?

---

### 18. How do you access and modify object properties?

---

### 19. What are arrays in JavaScript, and how do you declare them?

---

### 20. How do you add or remove elements from an array in JavaScript?

---

### 21. What is the difference between push(), pop(), shift(), and unshift()?

---

### 22. What are JavaScript loops, and how do you create a for loop?

---

### 23. How do you create a while loop and a do...while loop in JavaScript?

---

### 24. What is the difference between for...in and for...of loops in JavaScript?

---

### 25. How do you use the break and continue statements in loops?

---

### 26. What is the typeof operator in JavaScript?

---

### 27. What is the == and === operator, and what’s the difference?

---

### 28. What is type coercion in JavaScript?

---

### 29. What are conditional statements in JavaScript (e.g., if, else, else if)?

---

### 30. What is a switch statement in JavaScript, and how does it work?

---

### 31. What are template literals in JavaScript?

---

### 32. What is the spread operator (...), and how is it used?

---

### 33. What are destructuring assignments in JavaScript?

---

### 34. What is the difference between slice() and splice()?

---

### 35. How do you convert a string to a number in JavaScript?

---

### 36. What is the isNaN() function used for in JavaScript?

---

### 37. How do you create a timer using setTimeout() and setInterval() in JavaScript?

---

### 38. What is event handling in JavaScript?

---

### 39. How do you add an event listener in JavaScript?

---

### 40. What is the DOM (Document Object Model) in JavaScript?

## Intermediate JavaScript Questions

41. What is the difference between synchronous and asynchronous code?
42. What is a callback function in JavaScript?
43. What are promises in JavaScript, and how do they work?
44. What are async/await functions in JavaScript?
45. What is try...catch in JavaScript, and how is it used for error handling?
46. How does JavaScript handle exceptions?
47. What is the difference between map(), filter(), and reduce() methods in JavaScript?
48. What is the forEach() method, and how is it different from map()?
49. How do you use the find() and findIndex() methods in arrays?
50. How does the includes() method work in JavaScript?
51. What is the purpose of the some() and every() methods in JavaScript arrays?
52. What is a closure in JavaScript, and how does it work?
53. What is the scope chain in JavaScript?
54. What are IIFEs (Immediately Invoked Function Expressions), and why are they used?
55. What is the difference between block scope and function scope?
56. What are modules in JavaScript?
57. What is the difference between export and default export in ES6 modules?
58. How do you import modules in JavaScript?
59. What is the event loop in JavaScript?
60. What is the purpose of setTimeout() in relation to the event loop?
61. How does setTimeout() and setInterval() work with the event loop?
62. What is the call stack in JavaScript?
63. What is recursion in JavaScript?
64. What is the difference between deep copy and shallow copy in JavaScript?
65. How do you deep clone an object in JavaScript?
66. What is strict mode in JavaScript?
67. How do you enable strict mode in JavaScript?
68. What is the difference between == and === in strict mode?
### 69. What is function currying in JavaScript?

**What is Currying?**

Currying is a function that takes one argument at a time and returns a new function expecting the next argument. It is a conversion of functions from callable as `f(a,b,c)` into callable as `f(a)(b)(c)`.

```js
function temp(a) {
	return function (b) {
			return function (c) {
					return `${a} ${b} ${c}`;
			}
	}
} 

console.log(temp(5)(6)(7)); // Output: "5 6 7"
```

Basically Currying doesn’t call a function. It just transforms a function. They are constructed by chaining closures by immediately returning their inner functions simultaneously.

**Giving names to anonymous inner function and tyring to access them:**

```js
function temp(a) {
	return function temp2(b) {
			return function temp3(c) {
					return `${a} ${b} ${c}`;
			}
	}
}

// Access each function in a variable
const temp2 = temp(5);   // temp2 is now temp2(b)
const temp3 = temp2(6);  // temp3 is now temp3(c)
console.log(temp3(7));   // Outputs: "5 6 7"
```

```js
function temp(a) {
  function temp2(b) {
    function temp3(c) {
      return `${a} ${b} ${c}`;
    }
    return { temp3 }; // return temp3 as part of an object
  }
  return { temp2 }; // return temp2 as part of an object
}

const functions = temp(5);
const result2 = functions.temp2(6);
const result3 = result2.temp3(7);

console.log(result3); // Outputs: "5 6 7"
```

Infinite Currying:

```js
function add(a) {
  return function (b) {
    if (b) return add(a + b);
    return a;
  };
}

console.log(add(5)(2)(4)(8)()); 
// Output: 19
```

--- 

1.  What is the bind(), call(), and apply() methods in JavaScript?
2.  What is the this keyword in JavaScript, and how does it behave?
3.  How does the this keyword behave in arrow functions?
4.  What are prototypes in JavaScript?
5.  What is the prototype chain in JavaScript?
6.  What is inheritance in JavaScript?
7.  What are getter and setter methods in JavaScript?
8.  What is the difference between class-based inheritance and prototypal inheritance?
9.  What are classes in JavaScript, and how are they used?
10. What are constructors in JavaScript classes?
11. What are static methods in JavaScript classes?
12. How does inheritance work in JavaScript classes?
13. What are symbols in JavaScript, and how are they used?
14. What are generators in JavaScript?
15. How does yield work in generator functions?
16. What is the difference between generator functions and normal functions?
17. How do you handle asynchronous iteration in JavaScript with generators?

## Advanced JavaScript Questions

87. What are higher-order functions in JavaScript?
90. What is memoization, and how can it be implemented in JavaScript?
91. How do you debounce and throttle functions in JavaScript?
92. What is the purpose of the Object.freeze() method?
93. What is the Object.seal() method, and how does it work?
94. How do you prevent object mutation in JavaScript?
95. What is the difference between Object.assign() and the spread operator for cloning objects?
96. What is functional programming in JavaScript?
97. How do pure functions work in JavaScript?
98. What are side effects in JavaScript, and how can they be avoided?
99. What is immutability in JavaScript?
100. What is the Map object in JavaScript?
101. How does the Set object work in JavaScript?
102. How do weak maps and weak sets differ from regular maps and sets in JavaScript?
103. How do you work with promises in a sequential manner (promise chaining)?
104. What is the Promise.all() method, and how is it used?
105. What is the Promise.race() method in JavaScript?
106. What is the Promise.any() method?
107. What is tail call optimization in JavaScript?
108. How does garbage collection work in JavaScript?
109. What is memory management in JavaScript, and how does it work?
110. What is the purpose of the Reflect API in JavaScript?
111. What is the Proxy object in JavaScript?
112. How can you use the Proxy object to intercept and modify operations on an object?
113. How do you handle polyfills in JavaScript?
114. What is the module pattern in JavaScript?
115. How do single-page applications (SPAs) work in JavaScript?
116. What is event delegation in JavaScript?
117. What is the difference between capturing and bubbling in event propagation?
118. How do you stop event propagation in JavaScript?
119. What are custom events in JavaScript, and how do you create them?
120. What are web workers in JavaScript, and how do they work?
121. How do you use the localStorage and sessionStorage APIs in JavaScript?
122. How does the fetch() API work in JavaScript?
123. What is the difference between the XMLHttpRequest and fetch() APIs?
124. How do you handle HTTP response statuses with fetch()?
125. What are service workers, and how are they used in JavaScript?

## JavaScript Performance Optimizations

126. What are some techniques to optimize JavaScript performance?
127. How do you handle and optimize long-running JavaScript code?
128. What is lazy loading in JavaScript, and how does it improve performance?
129. What is code splitting, and how does it improve performance in JavaScript?
130. How does tree shaking work in JavaScript, and why is it important?
131. What is async defer loading of JavaScript files, and why is it beneficial?
132. What are web workers, and how can they be used to improve performance?
133. What is the difference between client-side and server-side rendering?
134. What are some strategies for optimizing DOM manipulations in JavaScript?
135. How do you reduce the impact of reflow and repaint in the browser?
136. How do you optimize loops in JavaScript for performance?
137. What is debouncing, and how does it help in performance optimization?
138. What is throttling, and how does it improve performance?
139. What is the requestAnimationFrame() method, and how does it optimize animations?
140. How does minimizing the use of global variables improve performance in JavaScript?
141. What are the best practices for memory management in JavaScript?
142. How do you prevent memory leaks in JavaScript?
143. What is the difference between synchronous and asynchronous loading of scripts?
144. How do you reduce JavaScript bundle size in production?
145. What is lazy evaluation in JavaScript, and how can it optimize performance?
146. How do you avoid layout thrashing in JavaScript?
147. How does minimizing DOM access improve performance?
148. How does bundling and minification affect JavaScript performance?
149. What are the pros and cons of using inline JavaScript?
150. How do you defer the execution of JavaScript to speed up initial page load?
151. What is Gzip compression, and how does it relate to JavaScript performance?
152. What are performance tools in modern browsers, and how do they help optimize JavaScript?

## Additional Advanced and Miscellaneous JavaScript Questions

153. What are TypedArrays in JavaScript?
154. What is the ArrayBuffer and how does it relate to binary data in JavaScript?
155. How do you work with binary data in JavaScript?
156. What are template engines in JavaScript (like Handlebars, EJS)?
157. How does server-side JavaScript differ from client-side JavaScript?
158. How do you handle file uploads in JavaScript?
159. What is the File API in JavaScript?
160. What are the different ways to handle file input in JavaScript?
161. How does the drag-and-drop API work in JavaScript?
162. What are asynchronous iterators in JavaScript?What are tagged templates in JavaScript?
163. What are decorators in JavaScript, and how do they work?
164. How do you optimize JavaScript for mobile devices?
165. What are JavaScript observables, and how are they different from promises?
166. How does reactive programming work in JavaScript?
167. What is RxJS, and how is it used in JavaScript?
168. What is the role of functional programming in JavaScript?
169. What are partial applications in JavaScript?
170. What are mixins in JavaScript?
171. What is the concept of duck typing in JavaScript?
172. How do you handle accessibility with JavaScript?
173. What is the role of JavaScript in Progressive Web Apps (PWAs)?
174. How do you integrate JavaScript with WebAssembly?
175. What is the purpose of the Intl object in JavaScript?
176. What are Typed JavaScript languages like TypeScript?
177. What is the purpose of TypeScript, and how does it improve JavaScript development?
178. What are async generators, and how are they different from regular generators?
179. How do you integrate JavaScript with a backend (e.g., Node.js)?
180. How does JavaScript handle multithreading or concurrency?
181. What are event emitters in JavaScript?
182. What is CSP (Content Security Policy), and how does it relate to JavaScript?
183. How do you use JavaScript to manipulate cookies?
184. What is the document.cookie API in JavaScript?
185. How do you handle JSON in JavaScript?
186. What is the JSON.parse() and JSON.stringify() methods in JavaScript?
187. How do you handle CORS (Cross-Origin Resource Sharing) in JavaScript
188. How do you handle API rate limiting in JavaScript?
189. What is the window object in JavaScript?
190. What is the document object in JavaScript?
191. What is the difference between window.onload and document.onload?
192. How do you handle media queries in JavaScript?
193. How do you deal with time zones in JavaScript?
194. How do you work with dates and times in JavaScript?
195. What is the Intl.DateTimeFormat object in JavaScript?
196. How does event delegation improve performance in JavaScript?
197. How do you optimize large datasets processing in JavaScript?
198. How do you handle form validation with JavaScript?
199. How do you create and dispatch custom events in JavaScript?
200. How do you handle permissions (e.g., geolocation) in JavaScript?
201. How does WebSockets work in JavaScript?