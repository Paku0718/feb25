import express from 'express';
import { createConnection } from 'mysql';
import { StatusCodes } from 'http-status-codes';

const PORT = 5500;
const app = express();
app.use(express.json());

var conn = createConnection({
    host:"localhost",
    user:"root",
    password:"root",
    database:"newcrud"
})

conn.connect((error)=>{
    if(error){
        conseole.log(error);
    }
    else{
        console.log("MySql connected...");
    }
})

app.post('/student',(request,response)=>{
    try{
        const data = request.body;
        const qry = `insert into newstudent value(${data.id}, '${data.name}', '${data.phone}', ${data.marks})`
        conn.query(qry,(error,result)=>{
            if(error){
                console.log(error);
            }
            else{
                response.status(StatusCodes.OK).send("Student registered...");
            }
        })
    }
    catch(error){
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send("Something went Wrong");
    }
})

app.get('/student',(request, response)=>{
    try{
        const qry =`select * from newstudent`;
        conn.query(qry,(error,result)=>{
            if(error){
                console.log(error);
            }
            else{
                response.status(StatusCodes.OK).send(result);
            }
        })
    }
    catch(error){
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send("Something went wrong....");
    }
})

app.get('/student/:id',(request, response)=>{
    try{
        const id = parseInt(request.params.id);
        const qry =`select * from newstudent where id=${id}`;
        conn.query(qry,(error,result)=>{
            if(error){
                console.log(error);
            }
            else{
                response.status(StatusCodes.OK).send(result[0]);
            }
        })
    }
    catch(error){
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send("Something went wrong....");
    }
})

app.delete('/student/:id',(request,response)=>{
    try{
        const id= parseInt(request.params.id);
        const qry = `delete from newstudent where id=${id}`;
        conn.query(qry,(error, result)=>{
            if(error){
                console.log(error);
            }
            else{
                response.status(StatusCodes.OK).send("Student data deleted...");
            }
        })
    }
    catch(error){
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send("Something went wrong...");
    }
})

app.put('/student/:id',(request,response)=>{
    try{
        const data = request.body;
        const id = parseInt(request.params.id);
        const qry = `update newstudent set name='${data.name}', phone='${data.phone}', marks=${data.marks} where id= ${id}`;

        conn.query(qry, (error, result)=>{
            if(error){
                console.log(error);
            }
            else{
                response.status(StatusCodes.OK).send("Updated student data");
            }
        })
    }
    catch(error){
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send("Something went wrong...");
    }
})

app.listen(PORT,()=>{
    console.log("Server started...");
})