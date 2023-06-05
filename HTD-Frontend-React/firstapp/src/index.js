import { render } from "react-dom";
import Contact from "./Contact";
import Todo from "./Todo";
import Login from "./Login";
import Ecommerce from "./Ecommerce";
import Mobile from "./Mobile";
import Laptop from "./Laptop";
import Book from "./Book";
import ContactList from "./ContactList";

import { BrowserRouter, Route, Link, Routes } from "react-router-dom";

function App() {
  // Project 1
  // return <div style={{display:"flex",gap:"5px"}}>
  //   <Contact name="James" message="Good morning" image="https://sm.ign.com/ign_ap/cover/a/avatar-gen/avatar-generations_hugw.jpg"/>
  //   <Contact name="Leon" message="Good morning" image="https://img.lovepik.com/element/40128/7461.png_1200.png"/>
  //   <Contact name="Sabrina" message="Good morning" image="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS_CQ3IrjZcisW-FO12jxRtSA9shZYuykqA2w&usqp=CAU"/>
  // </div>

  // Project 2
  // return <div>
  //   <Todo />
  // </div>

  // // Project 3
  // return (
  //   <div className="d-flex align-items-center justify-content-center vh-100">
  //     <Login />
  //   </div>
  // );

  // Project 4
  // return (
  //   <div className="d-flex align-items-center justify-content-center vh-100">
  //     <Ecommerce />
  //   </div>
  // );

  return (
    <div>
      <BrowserRouter>
        <div className="d-flex gap-3">
          <Link to="/mobile">Mobile</Link>
          <Link to="/laptop">Laptop</Link>
          <Link to="/book">Book</Link>
          <Link to="/project-1">Project 1</Link>
          <Link to="/project-2">Project 2</Link>
          <Link to="/project-3">Project 3</Link>
          <Link to="/project-4">Project 4</Link>
        </div>

        <Routes>
          <Route path="/mobile" element={<Mobile />} />
          <Route path="/laptop" element={<Laptop />} />
          <Route path="/book" element={<Book />} />
          <Route path="/project-1" element={<ContactList />} />
          <Route path="/project-2" element={<Todo />} />
          <Route path="/project-3" element={<Login />} />
          <Route path="/project-4" element={<Ecommerce />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

render(<App />, document.getElementById("root"));
