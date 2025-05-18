import {Alert, Container} from "react-bootstrap";

export function Dashboard(){
    return(
        <Container className="mt-4">
            <Alert variant="sucess">
                <h2>Welcome to Student Management application</h2>
            </Alert>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Architecto, voluptas.</p>
        </Container>
    )
}