import { useState } from "react"
import axios from "axios";

export function RegisterationForm(){

    const [formData, setFormData] = useState({id:'', name:'', phone:'', marks:''});

    const handleChange = (event)=>{
        console.log(event.target.value);        
        setFormData({...formData,[event.target.name]:event.target.value});
    }

    const handleSubmit = (event)=>{
        try{
            event.preventDefault();
            console.log(formData);
            axios.post("http://127.0.0.1:5000/student")
        }
        catch(error){
            console.log(error);
        }
       
    }
    return(
        <div>
            <form action="">
                <div>
                    <label htmlFor="">Id</label>
                    <input type="text" placeholder="enter id" onChange={handleChange} name="id"/>
                </div>
                <div>
                    <label htmlFor="">Name</label>
                    <input type="text" placeholder="enter name" onChange={handleChange} name="name"/>
                </div>
                <div>
                    <label htmlFor="">Phone</label>
                    <input type="text" placeholder="enter phone" onChange={handleChange} name="phone"/>
                </div>
                <div>
                    <label htmlFor="">Marks</label>
                    <input type="text" placeholder="enter marks" onChange={handleChange} name="marks"/>
                </div>
                <button onSubmit={handleSubmit}>Submit</button>
            </form>
        </div>
    )
}