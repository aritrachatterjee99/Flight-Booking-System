import React from "react";
import { Link } from "react-router-dom";
import "../Styles/Welcome.css"

const Welcome = ( ) => {

    const handleWelcome = () => {

    }
	return (
                <div className="welcome">
                    <h1 className="welcome_title">Welcome to Flight Booking App</h1>
                    <Link to={"/search"}>
                        <button type='button' onClick={handleWelcome} className="welcomesearchPageBtn">Search Flight</button>
			        </Link>
                    <Link to={"/book"}>
                        <button type='button' onClick={handleWelcome} className="welcomebookPageBtn">Book Flight</button>
			        </Link>
                    <Link to={"/cancelbooking"}>
                        <button type='button' onClick={handleWelcome} className="welcomecancelPageBtn">Cancel Booking</button>
			        </Link> 
                    
                </div>
            );
        }

export default Welcome; 