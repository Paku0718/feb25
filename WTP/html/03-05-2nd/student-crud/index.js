import express from 'express';
import { STATUS_CODES } from 'http';

const PORT = 7800;
const app = express();

app.use(express.json());

app.get("/", (request, response)=>{
    response.status(STATUS_CODES.OK).send({message:'Welcome to the CRUD'});
});


app.post("/student", (request,response)=>{
    try {
        
    } catch (error) {
        response.status(STATUS_CODES.)
    }
})



app.listen(7800,()=>{
    console.log(`server is running on ${PORT}`);
    
})

