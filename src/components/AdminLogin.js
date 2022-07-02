import React from 'react'
import { Link } from "react-router-dom";
import "../Styles/AdminLogin.css"

const Adminlogin = () => {
  const handleAdminlogin = () => {
    console.log("You are logged in successfully");
  }

  return (
    <div className='container'>
    <h1 className="H1">Admin Login</h1>
    <div className='loginBox'>
     <label for="usernameInput"><b>Username: </b></label>
     <input className='usernameInput' placeholder='Username'/>
     <br></br>
     <label for="passInput"><b>Password: </b></label>
      <input className='passInput' type="password" placeholder='Password'/>
      <br></br>
      <Link to={"/add"}>
        <button type='button' onClick={handleAdminlogin} className="loginPageBtn">Log In</button>
			</Link>
      <div className='forgPass'>
        <a href="./ForgotPassword">Forgotten password?</a>
      </div>
    </div>
  </div>
  )
}

export default Adminlogin;