[🏠 Home](../../../README.md) <br/>
<a href="../JavaScript.md" > 
<img src="../imgs/js-logo.png" height="20px">
 Home
</a><br/>
[⬅️ Prev Chap - Strict Mode]()
[➡️ Next Chap - Classes]()

---

<h1 style="text-align: center">28. `this` Keyword</h1>

## Index

--- 

## What is `this`?

In JavaScript, the `this` keyword refers to an object.

The `this` keyword refers to different objects depending on how it is used:

- In an object method, `this` refers to the object.
- Alone, `this` refers to the global object.
- In a function, `this` refers to the global object.
- In a function, in strict mode, `this` is undefined.
- In an event, `this` refers to the element that received the event.
- Methods like `call()`, `apply()`, and `bind()` can refer this to any object.

==============================

⚠️ NOTE ⚠️


`this` is not a variable. It is a keyword. You cannot change the value of `this`.

==============================

## `this` in a Method

When used in an object method, `this` refers to the object.

**Example:**

```js
const person = {
  firstName: "John",
  lastName : "Doe",
  id       : 5566,
  fullName : function() {
    return this.firstName + " " + this.lastName;
  }
};
```

In the example above, `this` refers to the `person` object.

Because the `fullName` method is a method of the `person` object.

Complete example:

```js
// Create an object:
const person = {
  firstName: "John",
  lastName: "Doe",
  id: 5566,
  fullName : function() {
    return this.firstName + " " + this.lastName;
  }
};
/* 

`
  fullName : function() {
    return firstName + " " + lastName;
  }
`
The above will trow a reference error

ERROR!
/tmp/8QzvNDrWU0/main.js:10
    return firstName + " " + lastName;
    ^

ReferenceError: firstName is not defined
*/

console.log(person.fullName());

// Output: John Doe
```

--- 