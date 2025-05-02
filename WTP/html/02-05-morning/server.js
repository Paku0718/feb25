const http = require("http");

var server = http.createServer((request, response)=>{
    var x =5;
    var y= 6;
    var z = x+y;
    response.write("hello world \n");
    response.write(`sum is: ${z} \n`);
    response.write("hello");
    response.end();
    // response.end();


}); // create a server and will return server object

server.listen(4500,()=>{
    console.log("server started on http://localhost:4500");
}); // start listening on the requests