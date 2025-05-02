var fs = require("fs");
fs.readFile("myfidle.txt",(error,data)=>{
    if(!error){
        console.log(data.toString());
    }
    else{
        console.log(error);  
    }
});
console.log("after reading file...");