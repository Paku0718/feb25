import { Button } from "bootstrap";
import { Alert, Container } from "react-bootstrap";
import Form from "react-bootstrap/Form";

export function StudentRegisterationForm() {
  return (
    <Container className="mt-4">
      <Alert variant="sucess">
        <h2>Register Student</h2>
      </Alert>
      <Container>
        <Form>
          <Row>
            <Col lg={4}>
              <Form.Group className="mb-3" controlId="formBasicPassword">
                <Form.Label>Id</Form.Label>
                <Form.Control type="text" placeholder="Enter Id" name="id" />
              </Form.Group>
            </Col>
            <Col lg={4}>
              <Form.Group className="mb-3" controlId="formBasicPassword">
                <Form.Label>Name</Form.Label>
                <Form.Control type="text" placeholder="Enter Name" name="name" />
              </Form.Group>
            </Col>
          </Row>
          <Row>
          <Col lg={4}>
              <Form.Group className="mb-3" controlId="formBasicPassword">
                <Form.Label>Phone</Form.Label>
                <Form.Control type="text" placeholder="Enter Phone" name="phone" />
              </Form.Group>
            </Col>
            <Col lg={4}>
              <Form.Group className="mb-3" controlId="formBasicPassword">
                <Form.Label>Marks</Form.Label>
                <Form.Control type="text" placeholder="Enter Marks" name="marks" />
              </Form.Group>
            </Col>
          </Row>
          <Button>Submit</Button>
        </Form>
      </Container>
    </Container>
  );
}
