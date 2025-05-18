import express from 'express';

const PORT =9400;
const app = express();

app.get("/",(request,response)=>{
    response.status(200).send({message:"Welcome to home"});
});

app.get("/factorial/:n", (request,response)=>{
    try{
        const num = parseInt(request.params.n);
        if(num>0){
            for(var i=0; i<=num;i++){
                fact = fact*i;
            }
        }
        else{
            response.status(400).sent({message:"Invalid value"});
        }
    } catch(error){
        response.status(500).send({message:"Something wrong"});
    }
});

app.post("/product",(request,response)=>{
    try{

    }catch(error){
        response.status(500).send({message:"Ssomething went wrong"});
    }
})

app.listen(PORT,()=>{
    console.log(`server is running ${PORT}`);
})