// import { Component } from "react";

// export class MyComponent extends Component{
//     render(){ //it delivers the UI for this class component
//         return(
//             <div>
//                 <h1>Welcome to my Component</h1>
//             </div>
//         )
//     }
// }

export function MyComponent(props){
    return(
        <div>
            <h1>{props.heading}</h1>
            <p>{props.text}</p>
        </div>
    )
}