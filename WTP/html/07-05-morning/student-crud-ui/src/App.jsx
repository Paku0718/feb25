import { BrowserRouter, Route, Routes } from "react-router-dom"
import { NavigationBar } from "./components/NavigationBar"
import { Dashboard } from "./components/Dashboard"
import { StudentRegisterationForm } from "./components/StudentRegisterationForm"
import { StudentList } from "./components/StudentList"

function App() {

  return (
   <div>  
      <NavigationBar/>
      <Routes>
        <Route path="/" element={<Dashboard/>}/>
        <Route path="/register-student" element={<StudentRegisterationForm/>}/>
        <Route path="/student-list" element={<StudentList/>}/>
      </Routes>
   </div>
  )
}

export default App
