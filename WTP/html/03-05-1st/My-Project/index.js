import express from 'express';

const app = express();

const myMiddleware = (request,response,next)=>{
    console.log("inside middleware");
    next();
}

app.use(myMiddleware);

app.get("/",(request,response)=>{
    response.send("welcome to our app");
});
app.post("/sum",myMiddleware,(request,response)=>{
    // request.params// it will give url parameters
    const data =  request.body //it will give data passed into the request body
    console.log(data);
    response.send("sum");
});

app.listen(9600,()=>{
    console.log("server started...")
});

