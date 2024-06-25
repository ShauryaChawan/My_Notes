<center><h1>Express.JS</h1></center>

## Hello world example

```
const express = require('express')
// import eexpress from "express";

const app = express();
const port = 3000;

app.get('/', (req, res) => {
  res.send('Hello World!')
})

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})
```

## Basic Routing

1. Respond with Hello World! on the homepage:

```
app.get('/', (req, res) => {
  res.send('Hello World!')
})
```

2. Respond to POST request on the root route (/), the application’s home page:

```
app.post('/', (req, res) => {
  res.send('Got a POST request')
})
```

3. Respond to a PUT request to the `/user` route:

```
app.put('/user', (req, res) => {
  res.send('Got a PUT request at /user')
})
```

4. Respond to a DELETE request to the `/user` route:

```
app.delete('/user', (req, res) => {
  res.send('Got a DELETE request at /user')
})
```