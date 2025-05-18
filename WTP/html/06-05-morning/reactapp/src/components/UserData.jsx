import { Component } from "react";

export class UserData extends Component{
    constructor(){
        super();
        this.state={
            user:[]
        }
    }

    render(){
        return(
            <div>
                <h1>List of users</h1>
            </div>
        )
    }

    componentDidMount(){
        try{    
            const response = await fetch("https://jsonplaceholder.typicode.com/users")
            const data = await response.json();
            this.setState({users:data});
        }
        catch(eroor){
            console.log(error);
        }
    }
}