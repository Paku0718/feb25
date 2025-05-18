import axios from "axios";

export function fetchAllStudents(){
    return axios.get("http://localhost:7800/student");
}