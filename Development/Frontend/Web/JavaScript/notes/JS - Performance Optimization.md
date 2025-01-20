<h1>JS - Performance Optimizaion</h1>

## Index

## Debouncing

**Definition:** Debouncing ensures that a function is only called once after a certain "cooling-off" period of inactivity. It delays the function execution until a specified time has passed since the last time the function was invoked.

**How It Works:**

- If the event is triggered multiple times, the timer resets each time.
- The function is only executed if a certain period of inactivity (cool-down period) has elapsed.

**Example:** Consider a search box where a user types in a query. We don’t want to send an API request with every keystroke. Instead, we wait until the user stops typing for a certain period (e.g., 300ms) before making the request.

```js
function debounce(func, delay) {
  let timer;
  return function (...args) {
    clearTimeout(timer);
    timer = setTimeout(() => func.apply(this, args), delay);
  };
}

// Usage: Debounce function for search
const handleSearch = debounce((query) => {
  console.log("Fetching search results for:", query);
}, 300);
```