//request body practice

import express from 'express';

const app = express();

const mymiddleware = (request, response,next)=>{
    console.log("Inside middleware");
    next();
}
app.use(mymiddleware);//it will register a middleware that has to be called on each and ever url

app.use(express.json());//it will register a middleware that has to be called on each and ever url

app.get("/",(request,response)=>{
    response.send("Welcome to our app");
})

app.post("/sum",(request,response) =>{
    // request.params // it will give url parameters
    // request.body // it will give data passes into the request body
    const data = request.body;
    console.log(data);
    response.send("sum");     
});

app.listen(4500,()=>{
    console.log("Server started...");
})