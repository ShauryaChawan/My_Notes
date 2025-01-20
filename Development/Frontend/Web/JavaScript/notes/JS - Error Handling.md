[🏠 Home](../../../README.md) <br/>
<a href="../JavaScript.md" > 
<img src="../imgs/js-logo.png" height="20px">
 Home
</a><br/>
[⬅️ Prev Chap - ]()
[➡️ Next Chap - ]()

---

<h1 style="text-align: center">The `this` Keyword</h1>

---

## Index
- [Index](#index)
- [Introduction](#introduction)

---

## Introduction

- The `try` statement defines a code block to run (to try).

- The `catch` statement defines a code block to handle any error.

- The `finally` statement defines a code block to run regardless of the result.

- The `throw` statement defines a custom error.

**Example**

```js
<!DOCTYPE html>
<html>
    <body>

        <h2>JavaScript try catch</h2>

        <p>Please input a number between 5 and 10:</p>

        <input id="demo" type="text">
        <button type="button" onclick="myFunction()">Test Input</button>

        <p id="p01"></p>

        <script>
            function myFunction() {
                const message = document.getElementById("p01");
                message.innerHTML = "";
                let x = document.getElementById("demo").value;
                try { 
                    if(x.trim() == "")  throw "is empty";
                    if(isNaN(x)) throw "is not a number";
                    x = Number(x);
                    if(x > 10)   throw "is too high";
                    if(x < 5)  throw "is too low";
                }
                catch(err) {
                    message.innerHTML = "Input " + err;
                }
                // Always reset the input value whenever clicked 
                // on the "Test Input"
                finally {
                    document.getElementById("demo").value = "";
                }
            }
        </script>

    </body>
</html>
```

[Error Handling in detail w3schools](https://www.w3schools.com/js/js_errors.asp)


---

[🏠 Home](../../../README.md) <br/>
<a href="../JavaScript.md" > 
<img src="../imgs/js-logo.png" height="20px">
 Home
</a><br/>
[⬅️ Prev Chap - ]()
[➡️ Next Chap - ]()