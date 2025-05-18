import axios from "axios";
import { Component } from "react";

export class UserData extends Component {
  constructor() {
    super();
    this.state = {
      users: [], // fixed state key
    };
  }

  async componentDidMount() {
    try {
      const response = await axios.get("https://jsonplaceholder.typicode.com/users"); // await added
      console.log(response.data);
      this.setState({ users: response.data }); // consistent key
    } catch (error) {
      console.log(error);
    }
  }

  render() {
    return (
      <div>
        <h1>List of users</h1>
        <table border={1} cellPadding={10} cellSpacing={0}>
          <thead>
            <tr>
              <th>Id</th>
              <th>Name</th>
              <th>Email</th>
              <th>Username</th>
              <th>Phone</th>
            </tr>
          </thead>
          <tbody>
            {
              this.state.users.map((u) => (
                <tr key={u.id}>
                  <td>{u.id}</td>
                  <td>{u.name}</td>
                  <td>{u.email}</td>
                  <td>{u.username}</td>
                  <td>{u.phone}</td>
                </tr>
              ))
            }
          </tbody>
        </table>
      </div>
    );
  }
}
