import express from 'express';

// create an express application 
const app = express(); //it will return object of newly created express app

app.get("/", (request,response)=>{
    response.send("Welcome");
});
app.get("/login", (request,response)=>{
    response.send("Welcome to login page");
});
app.get("/sum/:x/:y", (request,response)=>{
    // var a=5;
    // var b=6;
    // var c=a+b;
    // console.log(request.params.x); //{x:3, y:5}
    var a = parseInt(request.params.x);
    var b = parseInt(request.params.y);
    var c = a+b; 
    response.send(`The sum is : ${c}`);
});


app.listen(3500, () => {
    console.log("server is running....")
})