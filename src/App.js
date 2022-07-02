import React , {useState}from "react";
import './App.css';
import Header from "./components/Header";
import AddFlight from "./components/AddFlight";
import Login from "./components/Login";
import Signin from "./components/Signin";
import Home from "./components/Home";
import Book from "./components/Book";
import BookConfirmPage from "./components/BookConfirmPage";
import Welcome from "./components/Welcome";
import Adminlogin from "./components/AdminLogin";
import CancelBooking from "./components/CancelBooking";
import CancelConfirm from "./components/CancelConfirm";
import Checkin from "./components/Checkin";
import Searchflight from "./components/Searchflight";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";


function App() {
  const[flights, setFlights]=useState([]);
  const addFlightHandler = (flight) => {
    console.log(flight);
    setFlights([...flights, flight]);
  }
  return (
    <div className="App">
      <Header></Header>
      <Router>
				<Routes>
         <Route exact path="/" element={<Home/>}></Route> 
					<Route exact path="/login"
						 element={<Login /> }>
					</Route>
          <Route exact path="/signin"
              element={<Signin /> }>
					</Route>
          <Route exact path="/add"
             element={<AddFlight addFlightHandler={addFlightHandler}></AddFlight>}>
					</Route>
          <Route exact path="/book"
             element={<Book /> }>
					</Route>
          <Route exact path="/bookconfirm"
             element={<BookConfirmPage /> }>
					</Route>
          <Route exact path="/welcome"
             element={<Welcome /> }>
					</Route>
          <Route exact path="/adminlogin"
						 element={<Adminlogin /> }>
					</Route>
          <Route exact path="/cancelconfirm"
						 element={<CancelConfirm /> }>
					</Route>
          <Route exact path="/cancelbooking"
						 element={<CancelBooking /> }>
					</Route>
          <Route exact path="/checkin"
						 element={<Checkin /> }>
					</Route>
          <Route exact path="/search"
						 element={ <Searchflight/>}>
					</Route>
        </Routes>
      </Router>
      
      
    </div>
  );
}

export default App;
