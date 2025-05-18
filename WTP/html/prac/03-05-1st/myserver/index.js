import express from 'express';
import { WELCOME_TO_HOME, SOMETHING_WENT_WRONG, INVALID_VALUE } from './src/constants/ResponseMessages.js';
const PORT = 9400;

const app = express();
app.use(express.json());//without this request body is undefined

app.get("/", (request,response)=>{
    response.status(200).send({message:WELCOME_TO_HOME});
});

app.get("/factorial/:n",(request,response)=>{
    try {
        const num = parseInt(request.params.n);
        if(num>0){
            var fact = 1;
            for(var i=1; i<=num; i++){
                fact = fact * i;
            }
            response.status(200).send({factorial:fact});//can use http-status-codes but not use to remember codes
        }
        else{
            response.status(400).send({Message:INVALID_VALuE})
        }
    } catch (error) {
        response.status(500).send({message:SOMETHING_WENT_WRONG});
    }
});

app.post("/product",(request,response)=>{
    try{
        const data = request.body;
        const result = data.x * data.y;
        response.status(200).send({product:result});
    } catch(error){
        response.status(500).send({message:"Something went wrong"});
    }
})

app.listen(PORT, ()=>{
    console.log(`Server running on ${PORT}`);
})