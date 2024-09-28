// server.js

const http = require('http');

const hostname = '127.0.0.1'; // Localhost
const port = 3000; // Port number

// Create an HTTP server
const server = http.createServer((req, res) => {
  // Set the response header
  res.statusCode = 200; // HTTP status 200 (OK)
  res.setHeader('Content-Type', 'text/plain');

  // Simulate a time-consuming task (non-blocking)
  setTimeout(() => {
    res.end('Hello, World!\n'); // Response to the client
  }, 2000); // 2 seconds delay
});

// Server listening
server.listen(port, hostname, () => {
  console.log(`Server running at http://${hostname}:${port}/`);
});
