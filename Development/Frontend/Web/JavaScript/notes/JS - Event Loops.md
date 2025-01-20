[🏠 Home](../../../README.md) <br/>
<a href="../JavaScript.md" > 
<img src="../imgs/js-logo.png" height="20px">
 Home
</a><br/>
[⬅️ Prev Chap -]()
[➡️ Next Chap -]()

---

<h1 style="text-align: center">JS Event Loops</h1>

## Index

---

[⬆️ Back to Top ⬆️](#index)

## Introduction

- The event loop is a mechanism in JavaScript that ensures the non-blocking nature of JavaScript by handling asynchronous tasks. JavaScript has a single-threaded runtime, which means it can execute one task at a time in the call stack. 
- The event loop allows JavaScript to handle asynchronous tasks (like fetching data or timers) by coordinating between different components such as the call stack, web APIs, and task queues.

## Explanation with Steps:

1. Call Stack:
   - JavaScript executes synchronous code line by line.
   - The call stack keeps track of function calls.

2. Web APIs:
   - When asynchronous tasks are triggered (e.g., setTimeout, Promises, AJAX), they are sent to the browser's web APIs.

3. Task Queue & Microtask Queue:
   - Web APIs push callbacks to the task queue after completion (e.g., when a timer expires or data is fetched).
   - Promises (and async/await) callbacks go to the microtask queue (higher priority).

4. Event Loop:
   - Continuously checks the call stack.
   - If the call stack is empty, it pushes tasks from the task queues (starting with microtasks) to the call stack for execution.

**Example Code:**

```js
console.log("Start");

setTimeout(() => {
  console.log("Timeout callback");
}, 0);

Promise.resolve("Promise resolved").then((res) => {
  console.log(res);
});

console.log("End");
```

**Output:**

```
Start
End
Promise resolved
Timeout callback
```

[Understand Event loop by visualization - Link](http://latentflip.com/loupe/?code=JC5vbignYnV0dG9uJywgJ2NsaWNrJywgZnVuY3Rpb24gb25DbGljaygpIHsKICAgIHNldFRpbWVvdXQoZnVuY3Rpb24gdGltZXIoKSB7CiAgICAgICAgY29uc29sZS5sb2coJ1lvdSBjbGlja2VkIHRoZSBidXR0b24hJyk7ICAgIAogICAgfSwgMjAwMCk7Cn0pOwoKY29uc29sZS5sb2coIkhpISIpOwoKc2V0VGltZW91dChmdW5jdGlvbiB0aW1lb3V0KCkgewogICAgY29uc29sZS5sb2coIkNsaWNrIHRoZSBidXR0b24hIik7Cn0sIDUwMDApOwoKY29uc29sZS5sb2coIldlbGNvbWUgdG8gbG91cGUuIik7!!!PGJ1dHRvbj5DbGljayBtZSE8L2J1dHRvbj4%3D)

---

[🏠 Home](../../../README.md) <br/>
<a href="../JavaScript.md" > 
<img src="../imgs/js-logo.png" height="20px">
 Home
</a><br/>
[⬅️ Prev Chap -]()
[➡️ Next Chap -]()