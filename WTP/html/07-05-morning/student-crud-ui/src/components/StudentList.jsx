import { useEffect, useState } from "react";
import {Alert, Button, Container, Table} from "react-bootstrap";
import { fetchAllStudents } from "../services/StudentService";

export function StudentList(){

    const [students, setStudents] = useState([]);

    const getStudents = async ()=>{
        try{
            const response = await fetchAllStudents();
        }   
        catch(error){
            console.log(error);
        }
    } 

    useEffect(()=>{
        getStudents();
    },[])


    return(
        <Container className="mt-4">
            <Alert variant="sucess">
                <h2>Student List</h2>
            </Alert>
            <Container className="mt-3">
                <Table>
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Name</th>
                            <th>Phone</th>
                            <th>Marks</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            students.map((s)=>{
                                return(
                                    <tr>
                                        <td>{s.id}</td>
                                        <td>{s.name}</td>
                                        <td>{s.phone}</td>
                                        <td>{s.marks}</td>
                                        <td>
                                            <Button variant="primary">Edit</Button>
                                            <Button variant="danger">Delete</Button>
                                        </td>
                                    </tr>
                                )
                            })
                        }
                    </tbody>
                </Table>
            </Container>
        </Container>
    )
}