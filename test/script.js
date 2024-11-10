// function shareTheVideo(video) {
//   return new Promise((resolve, reject) => {
//     setTimeout(() => {
//       resolve(`Share the ${video} video`);
//     }, 500);
//   });
// }
// function importantAction(action) {
//   return new Promise((resolve, reject) => {
//     setTimeout(() => {
//       resolve(`Perform the action - ${action} urgently`);
//     }, 1000);
//   });
// }
// function likeTheVideo(like) {
//   return new Promise((resolve, reject) => {
//     setTimeout(() => {
//       reject(`Like the video "${like}" now !!`);
//     }, 2000);
//   });
// }

// const result = async () => {
//   try {
//     const msg1 = await importantAction("Vell Coders");
//     const msg2 = await likeTheVideo("VELLE Coders");
//     const msg3 = await shareTheVideo("Velle CODERS");
//     console.log({msg1, msg2, msg3});
//   } catch (err) {
//     console.log("Error:" + err);
//   }
// };

// console.log("start");
// result();
// console.log("end");


// Debounce function
function debounce(func, delay) {
  let timer;
  return function (...args) {
    clearTimeout(timer);  // Clear the previous timer
    timer = setTimeout(() => func.apply(this, args), delay);
  };
}

// Function to simulate a search request
function fetchResults(query) {
  document.getElementById("results").textContent = `Searching for "${query}"...`;
  console.log("API Call with query:", query);
}

// Apply debouncing to the fetchResults function
const debouncedSearch = debounce(fetchResults("fuck it up"), 500);

// Add event listener to input
document.getElementById("search").addEventListener("input", (event) => {
  debouncedSearch(event.target.value);  // Call debounced function
});
