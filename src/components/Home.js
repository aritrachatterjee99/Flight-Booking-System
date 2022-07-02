import React from "react";
import { Link } from "react-router-dom";
import headerimage from "../images/headerimage2.jpg";
import "../Styles/Home.css"

const Home = ( ) => {

    const handleHome = () => {

    }
	return (
                <div className="home">
                         <img className="headimg" src={headerimage} alt="headerimage" />
                         <br></br>
                         <Link to={"/login"}>
                            <button type='button' onClick={handleHome} className="homeloginPageBtn">Log In</button>
			             </Link>
                         <Link to={"/signin"}>
                            <button type='button' onClick={handleHome} className="homesigninPageBtn">Sign Up</button>
			             </Link>
                         <br></br>
                         <Link to={"/adminlogin"}>
                            <button type='button' onClick={handleHome} className="homeadminloginPageBtn">Admin Log In</button>
			             </Link>
                </div>
            );
        }

export default Home; 