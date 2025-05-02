const mymodule = require("./mymodule.js"); // for user defined module developer need to give a relative path
console.log("hello world");
var rs = mymodule.sum(3,4);
console.log("sum is ", rs);
var pr = mymodule.product(3,4);
console.log("Product is ", pr);