// import { DemoComponent } from "./DemoComponent";
// import { MyComponent } from "./MyComponent";
import {Navbar} from './components/Navbar.jsx'
import { Route, Routes, BrowserRouter } from 'react-router-dom';
import {Home} from './components/Home.jsx'
import {About} from './components/About.jsx'
import {Contact} from './components/Contact.jsx'

function App() {
  return (
    <>
      <div>
        <Navbar></Navbar>
        <Routes>
          <Route path='/' element={<Home></Home>}></Route>
          <Route path='/about' element={<About></About>}></Route>
          <Route path='/contact' element={<Contact></Contact>}></Route>
        </Routes>
        {/* <h1>Hello world</h1> */}
        {/* <MyComponent text='Hello world' heading='Welcome to my website'></MyComponent> */}
        {/* <DemoComponent text='this is class component' heading='Welcome to component'></DemoComponent> */}
      </div>
    </>
  );
}

export default App;
