import { render } from "react-dom";
import Contact from "./Contact";
import Todo from "./Todo";
import Login from "./Login";
import Ecommerce from "./Ecommerce";
import Mobile from "./Mobile";
import Laptop from "./Laptop";
import Book from "./Book";
import ContactList from "./ContactList";
import WeatherForecast from "./WeatherForecast";

import { BrowserRouter, Route, Link, Routes } from "react-router-dom";
import LoginGoogle from "./LoginGoogle";
import { useState, createContext } from "react";
import { useNavigate } from "react-router-dom";

// Create context store to store authentication state
export const myStore = createContext();

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  // Not everywhere you can use navigate
  // You can only useNavigate in the component that is rendered by the Routes component
  // const navigate = useNavigate();

  //Since App is outside of the Routes component, we cannot use useNavigate
  // We can use window.location.pathname to redirect to a different page
  const handleLogout = () => {
    setIsLoggedIn(false);
    window.location.pathname = "/login";
  };

  return (
    <div>
      <BrowserRouter>
        <div className="d-flex justify-content-between">
          <div className="d-flex gap-3">
            {/* {isLoggedIn && ( */}
              <>
                <Link to="/mobile">Mobile</Link>
                <Link to="/laptop">Laptop</Link>
                <Link to="/book">Book</Link>
                <Link to="/project-1">Project 1</Link>
                <Link to="/project-2">Project 2</Link>
                <Link to="/project-3">Project 3</Link>
                <Link to="/project-4">Project 4</Link>
                <Link to="/project-5">Project 5</Link>
              </>
            {/* )} */}
          </div>
          {isLoggedIn ? (
            <Link onClick={handleLogout} to="/logout">
              Logout
            </Link>
          ) : (
            <Link to="/login">Login</Link>
          )}
        </div>

        <Routes>
          <Route path="/mobile" element={<Mobile />} />
          <Route path="/laptop" element={<Laptop />} />
          <Route path="/book" element={<Book />} />
          <Route path="/project-1" element={<ContactList />} />
          <Route path="/project-2" element={<Todo />} />
          <Route path="/project-3" element={<Login />} />
          <Route path="/project-4" element={<Ecommerce />} />
          <Route path="/project-5" element={<WeatherForecast />} />
          <Route
            path="/login"
            element={
              <myStore.Provider value={{ set: setIsLoggedIn }}>
                <LoginGoogle />
              </myStore.Provider>
            }
          />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

render(<App />, document.getElementById("root"));
