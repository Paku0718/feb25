import { Component } from "react";

export class ScoreBoard extends Component{

    constructor(){
        super();
        this.state ={
            score : 0
        }
        this.increaseScore = this.increaseScore.bind(this);
        this.decreaseScore = this.decreaseScore.bind(this);
    }

    increaseScore(){
        this.setState({ score : this.state.score + 1})
    }
    decreaseScore(){
        this.setState({ score : this.state.score - 1})
    }


    render(){
        return(
            <div>
                <h1>{this.state.score}</h1>
                <button onClick={this.increaseScore}>+</button>
                <button onClick={this.decreaseScore}>-</button>
            </div>
        )
    }
}
