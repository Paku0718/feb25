import express from 'express';
import { createConnection } from 'mysql';
import {StatusCodes} from 'http-status-codes';

const PORT = 6000;
const app = express();
app.use(express.json());

var conn = createConnection({
    host:'localhost',
    user:'root',
    password:'root',
    database:'crud'
})

conn.connect((error)=>{
    if(error){
        console.log(error);
    }
    else{
        console.log("Connection Successfull...");
    }
});

app.post('/student',(request,response)=>{
    try{
        const data = request.body;
        const qry = `insert into student1 value(${data.id},'${data.name}','${data.phone}', ${data.marks})`;
        conn.query(qry, (error, result)=>{
            if(error){
                console.log(error);
            }
            else{
                response.status(StatusCodes.OK).send("Student Registed...");
            }
        })

    }
    catch(error){
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send("Something went wrong");
    }
    
})

app.get('/student', (request,response)=>{
    try{
        const qry = 'select* from student1';
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
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send("something went wrong");
    }
})

app.get('/student/:id', (request,response)=>{
    try{
        const id = parseInt(request.params.id);
        const qry = `select * from student1 where id=${id}`;
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
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send('Something went wrong');
    }
})

app.delete('/student/:id',(request,response)=>{
    try{
        const id = parseInt(request.params.id);
        const qry = `delete from student1 where id=${id}`;
        conn.query(qry,(error,result)=>{
            if(error){
                console.log(error);
            }
            else{
                response.status(StatusCodes.OK).send("Student record deleted...");
            }
        })
    }
    catch(error){
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send("Something went wrong");
    }
})

app.put('/student/:id',(request,response)=>{
    try{    
        const id = parseInt(request.params.id);
        const data = request.body;
        const qry = `update student1 set name='${data.name}', phone='${data.phone}', marks=${data.marks} where id=${id}`;
        conn.query(qry,(error, result)=>{
            if(error){
                console.log(error);
            }
            else{
                response.status(StatusCodes.OK).send("Updated student data");
            }
        })
    }
    catch(error){
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send("Something went wrong");
    }
})

app.listen(PORT,()=>{
    console.log(`Server started...`);
})


