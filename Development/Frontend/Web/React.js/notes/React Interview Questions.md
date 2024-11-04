[🏠 Home](../../../../../README.md)

<a href="../React.js.md">
<img src="../imgs/react-logo.png" height="20px">
React Home
</a>

---

<h1>React Interview Questions</h1>

## Index
- [Index](#index)
- [React `useState` 50 Interview Questions](#react-usestate-50-interview-questions)
	- [Basic Questions](#basic-questions)
	- [Intermediate Questions](#intermediate-questions)
	- [Advanced Questions](#advanced-questions)
	- [Practical Usage and Best Practices](#practical-usage-and-best-practices)
	- [Error Handling and Debugging](#error-handling-and-debugging)
	- [Comparisons and Alternatives](#comparisons-and-alternatives)

---

## React `useState` 50 Interview Questions

### Basic Questions

1. **What is the purpose of the `useState` hook in React?**  
   `useState` allows functional components to have local state. It returns a state variable and a function to update that state.

2. **How does `useState` differ from `this.setState` in class components?**  
   `useState` is used in functional components, while `this.setState` is used in class components. `useState` provides only a specific state variable rather than a global component state.

3. **What does `useState` return when it’s called?**  
   It returns an array with two elements: the current state value and a function to update that state.

4. **How do you initialize a state variable with `useState`?**  
   Pass the initial state as an argument to `useState`, e.g., `const [count, setCount] = useState(0);`.

5. **Can `useState` be called conditionally? Why or why not?**  
   No, React hooks cannot be called conditionally. Hooks must be called in the same order in every render to maintain state consistency.

6. **How can you update state with `useState`?**  
   Call the state update function, passing in the new value or a function to compute the new value.

7. **What happens if you update a `useState` variable with the same value it currently has?**  
   React skips the re-render if the new state is the same as the current state.

8. **What is a functional update in `useState`, and when should it be used?**  
   A functional update takes the form `setState(prevState => newState)`, allowing updates based on the previous state.

9. **Explain the syntax and structure of a basic `useState` hook.**  
   `const [state, setState] = useState(initialValue);` - It declares a state variable `state` and a function `setState` to update it.

10. **How do you handle multiple state variables using `useState`?**  
    Declare multiple `useState` hooks for each variable: `const [name, setName] = useState(''); const [age, setAge] = useState(0);`

### Intermediate Questions

11. **What are some common types of values managed by `useState`?**  
    Primitive values like numbers and strings, and complex values like arrays and objects.

12. **How does React determine when to re-render components that use `useState`?**  
    React re-renders components when a state update occurs, if the new state differs from the previous state.

13. **How does `useState` handle arrays and objects?**  
    `useState` doesn’t deep-merge arrays or objects; updating requires creating a new array or object reference.

14. **What is the initial state in `useState`, and when is it evaluated?**  
    The initial state is the value passed when `useState` is first called. It is evaluated only on the initial render.

15. **How can `useState` be used to toggle between two values?**  
    Using `setState(prev => !prev);` toggles a boolean state between true and false.

16. **Explain how to reset a `useState` variable to its initial value.**  
    Use the state update function, passing in the initial value.

17. **Can you pass functions or other hooks to `useState` as the initial state?**  
    Yes, a function can be passed to `useState` for lazy initialization, executed only on the initial render.

18. **How do you update state that depends on the previous state?**  
    Use a functional update: `setState(prevState => prevState + 1);`.

19. **What is the difference between `useState` and `useReducer`?**  
    `useState` is simpler and best for isolated state, while `useReducer` is suited for complex state logic with multiple actions.

20. **How can you handle asynchronous updates in `useState`?**  
    Although state updates in React are synchronous, you can use `useEffect` to handle side effects for async operations.

### Advanced Questions

21. **Explain how `useState` works internally.**  
    React queues updates for `useState` and schedules re-renders when necessary, comparing state changes to determine if a re-render is required.

22. **How can you debounce or throttle updates to `useState`?**  
    Use external libraries or custom hooks to debounce or throttle calls to the `setState` function.

23. **Describe a situation where using `useState` could cause performance issues.**  
    Performance issues arise with `useState` if a large state object or frequent updates cause excessive re-renders.

24. **How can stale closures affect state updates in `useState`?**  
    Closures in `useEffect` or callbacks may capture outdated state, leading to incorrect updates.

25. **What are potential issues with closures in functional updates for `useState`?**  
    Using old closures in functional updates may lead to outdated or unintended state changes if the closures don’t capture the latest state.

26. **Can `useState` persist data between page reloads? If not, how can you persist state?**  
    No, `useState` does not persist data. Use `localStorage` or session storage for persistence.

27. **How would you handle multiple `useState` hooks for complex state management?**  
    Combine related state into an object or switch to `useReducer` for more organized state management.

28. **How does `useState` behave with deeply nested objects?**  
    React only updates based on shallow comparisons, so deeply nested objects need full updates for each change.

29. **Can you chain multiple `setState` calls from `useState`?**  
    No, `useState` calls are batched. Update based on previous state with functional updates.

30. **How do you test components with `useState` using a testing library?**  
    Simulate state updates and verify component changes using tools like React Testing Library and Jest.

### Practical Usage and Best Practices

31. **Why should you avoid setting `useState` with `undefined`?**  
    Undefined state can cause unexpected issues in render logic. It’s best to initialize with a clear default value.

32. **Explain the implications of having large objects in `useState`.**  
    Large objects in `useState` may slow down re-renders, especially with frequent updates.

33. **How would you handle derived state in components with `useState`?**  
    Use `useMemo` or compute derived state within the component without storing it directly in state.

34. **How can you memoize functions that depend on state managed by `useState`?**  
    Use `useCallback` to memoize functions that depend on state, preventing unnecessary re-creations.

35. **What are some ways to optimize rendering performance with `useState`?**  
    Use `React.memo`, `useCallback`, and `useMemo` to avoid unnecessary re-renders.

36. **How can you create custom hooks that use `useState`?**  
    Wrap `useState` in a function and export it as a custom hook for reusable logic.

37. **Why should you avoid placing props in `useState`?**  
    Storing props in `useState` causes out-of-sync state. Instead, use props directly or compute derived values.

38. **How would you implement a counter component using `useState`?**  
    ```jsx
    const [count, setCount] = useState(0);
    const increment = () => setCount(prev => prev + 1);
    ```

39. **How would you implement a form with multiple inputs using `useState`?**  
    Use a single object state to manage multiple inputs: `const [formData, setFormData] = useState({});`.

40. **How can you use `useState` to handle toggling a modal open and closed?**  
    Use a boolean state: `const [isOpen, setIsOpen] = useState(false); setIsOpen(prev => !prev);`.

### Error Handling and Debugging

41. **What errors can arise if `useState` is misused inside a loop?**  
    Calling `useState` in loops violates hook rules, causing inconsistent state.

42. **How would you debug state that’s not updating as expected?**  
    Check the functional updates and inspect dependencies in effects.

43. **What causes `useState` not to trigger a re-render in certain cases?**  
    Passing the same value to `useState` prevents re-renders.

44. **Explain how React warns if you call `useState` outside of a functional component.**  
    React hooks must be used in functional components only, and React warns if this rule is broken.

45. **How would you prevent unnecessary re-renders when using `useState`?**  
    Use `React.memo`, memoize callbacks with `useCallback`, and manage complex state with `useReducer`.

### Comparisons and Alternatives

46. **What are the trade-offs of using `useState` versus `useReducer` for complex states?**  
    `useState` is simple, while `useReducer` is better for complex state logic, especially with multiple actions.

47. **When should `useState` be preferred over `useRef` for managing state?**  
    Use `useState` when a change should trigger a re-render. Use `useRef` for mutable values without re-renders.

48. **How does `useState` differ from storing state in a context provider?**  
    `useState` is for local state, while context provides global state accessible to multiple components.

49. **Can `useState` and `useEffect` be combined? How?**  
    Yes, `useEffect` can listen for `useState` changes and perform side effects accordingly.

50. **When should `useState` be avoided in favor of a global state management solution?**  
    Use global state when data needs to be shared across multiple components or is too complex for local state.
---

[🏠 Home](../../../../../README.md)

<a href="../React.js.md">
<img src="../imgs/react-logo.png" height="20px">
React Home
</a>
