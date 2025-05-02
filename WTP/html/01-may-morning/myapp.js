var fs = require("fs");

fs.writeFile("myfile.txt","hello world",(error)=>{
    if(!error){
        console.log("write operation completed...")
    }
    else{
        console.log("Write operation failed");
    }
});
console.log("write operation completed");