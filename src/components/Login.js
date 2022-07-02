import React from 'react'
import { Link } from "react-router-dom";
import "../Styles/Login.css"

const Login = () => {
  const handleLogIn = () => {
    console.log("You are logged in successfully");
  }

  return (
    <div className='container'>
    <h1 className="H1">Login</h1>
    <div className='loginBox'>
     <label for="usernameInput"><b>Username: </b></label>
     <input className='usernameInput' placeholder='Username' required/>
     <br></br>
     <label for="passInput"><b>Password: </b></label>
      <input className='passInput' type="password"  placeholder='Password' required/>
      <br></br>
      <Link to={"/welcome"}>
        <button type='button' onClick={handleLogIn} className="loginPageBtn">Log In</button>
			</Link>
      <div className='forgPass'>
        <a href="./ForgotPassword">Forgotten password?</a>
      </div>
      <div>
        <Link to={"/signin"}>
          <button onClick={handleLogIn} className="RegisterZ"> Create New Account </button>
				</Link>
      </div>
    </div>
  </div>
  )
}

export default Login;