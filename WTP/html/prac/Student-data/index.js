import express from 'express';
import { StatusCodes } from 'http-status-codes';
import { createConnection } from 'mysql';

const PORT = 5000;
const app = express();

app.use(express.json());

var conn = createConnection({
    host: "localhost",
    user: "root",
    password: "root",
    database: "wpt"
})

conn.connect((error) => {
    if (error) {
        console.log(error);
    }
    else {
        console.log("MYSQL Connect....");
    }
})



app.get('/', (request, response) => {
    response.status(StatusCodes.OK).send({ message: "Welcome to home page" });
})

app.post('/student', (request, response) => {
    try {
        const data = request.body;
        const qry = `insert into student values(${data.id},'${data.name}', '${data.phone}', ${data.marks})`;
        conn.query(qry, (error, result) => {
            if (error) {
                console.log(error);
                if (error.errno == 1062) {
                    response.status(StatusCodes.BAD_REQUEST).send({ message: " Id is Duplicate" })
                }
                else {
                    response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Problem in inserting data" });
                }
            }
            else {
                response.status(StatusCodes.OK).send({ message: "Data Inserted" });
            }
        });
    } catch (error) {
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Something went wrong" });
    }
})

app.get('/student', (request, response) => {
    try {
        const qry = "select * from student";
        conn.query(qry, (error, result) => {
            if (error) {
                console.log(error);
                response.status(StatusCodes.BAD_REQUEST).send({ message: "Problem in fetching data" });
            }
            else {
                response.status(StatusCodes.OK).send(result);
            }
        })
    }
    catch (error) {
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Something went wrong" });
    }
})
//get by id
app.get('/student/:id', (request, response) => {
    try {
        const id = parseInt(request.params.id);
        const qry = `select * from student where id=${id}`;
        conn.query(qry, (error, result) => {
            if (error) {
                console.log(error);
                response.status(StatusCodes.BAD_REQUEST).send({ message: "Problem in fetching data" });
            }
            else {
                if (result.length === 0) {
                    response.status(StatusCodes.NOT_FOUND).send({ message: `Student with id ${id} not found` });
                }
                else {
                    response.status(StatusCodes.OK).send(result[0]);
                }

            }
        })
    }
    catch (error) {
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Something went wrong" });
    }
})


// app.put('/student/:id', (request,response)=>{
//     try{
//         const id = parseInt(request.params.id);
//         const data = response.body;
//         const qry = `update student set name='${data.name}', phone='${data.phone}', marks='${data.marks}' where id=${id}`;
//         conn.query(qry, (error, result)=>{
//             if(error){
//                 response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({message:"Problem in updating data"});
//             }
//             else{
//                 response.status(StatusCodes.OK),send({message:"Data updated sucessfully"});
//             }
//         });
//     }
//     catch(error){
//         response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({message:"Something went wrong"});
//     }
// })

//Update
app.put('/student/:id',(request,response)=>{
    try{
        const x=parseInt(request.params.id);
        const data = request.body;
        const qry = `update student set name = '${data.name}', marks = ${data.marks} where id = ${x}`;
        conn.query(qry,(error, result)=>{
            if(error){
                console.log("Error in fetching");
                response.status(StatusCodes.CONFLICT).send({message : "Error in fetching data"});
            }
            else{
                response.status(StatusCodes.OK).send(result);
            }

        })
    }
    catch(error){
        response.status(StatusCodes.BAD_REQUEST).send({message : "Internal Error"});
    }
})



app.delete('/student/:id', (request, response) => {
    try {
        const id = parseInt(request.params.id);
        const qry = `delete from student where id=${id}`;
        conn.query(qry, (error, result) => {
            if (error) {
                response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Problem in deleting data" });
            }
            else {
                response.status(StatusCodes.OK).send({ message: "Student deleted" });
            }
        })
    }
    catch (error) {
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: "Something went wrong" });
    }
})


app.listen(PORT, () => {
    console.log(`Server stared on ${PORT}`);
});