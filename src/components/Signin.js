import React, {Component} from 'react';
import axios from 'axios';
import { Link } from "react-router-dom";
import "../Styles/Signin.css"


class Signup extends Component
{
    constructor(){
        super()

        this.state={
          user_First_Name: '',
          user_Last_Name: '',
          user_Contact: '',
          password: '',
          confirm_password: '',
          dob: '',
          gender: ''
        }
    }
    
    changehandler2= e =>{
        this.setState({[e.target.name]: e.target.value})
    }

    submithandler2= e =>{
        e.preventDefault()
        console.log("User Added Successfully")
        axios.post('http://localhost:4002/user/signup' , this.state)
              .then(response => {
                console.log(response)
              })
              .catch(error => {
              console.log(error)
              }) 
      }


    render() 
    {
        const {user_First_Name,user_Last_Name,user_Contact,password,confirm_password,dob,gender}=this.state
        return (
          <div className='ui_main_signin'>
             <h1 className="signin_title">Create New Account</h1>
            <div className='ui_form_signin'>
              <form onSubmit={this.submithandler2}>
                <div className="input-field-signin">
                  <label for="user_First_Name"><b>First Name: </b></label><br/>    
                  <input className="user_First_Name" placeholder="Enter First Name" type="text" name="user_First_Name" value={user_First_Name} onChange={this.changehandler2} />
                </div>

                <div className="input-field-signin">
                  <label for="user_Last_Name"><b>Last Name: </b></label><br/>    
                  <input className="user_Last_Name" placeholder="Enter Last Name" type="text" name="user_Last_Name" value={user_Last_Name} onChange={this.changehandler2} />
                </div>

                <div className="input-field-signin">
                  <label for="user_Contact"><b>Contact: </b></label><br/>    
                  <input className="user_Contact" placeholder="Enter Contact No" type="text" name="user_Contact" value={user_Contact} onChange={this.changehandler2} />
                </div>

                <div className="input-field-signin">
                  <label for="password"><b>Password: </b></label><br/>    
                  <input className="password" placeholder="Type your password" type="text" name="password" value={password} onChange={this.changehandler2} />
                </div>

                <div className="input-field-signin">
                  <label for="confirm_password"><b>Confirm Password: </b></label>    
                  <input className="confirm_password" placeholder="Retype your password" type="text" name="confirm_password" value={confirm_password} onChange={this.changehandler2} />
                </div>

                <div className="input-field-signin">
                  <label for="dob"><b>Date of Birth: </b></label><br/>    
                  <input className="dob"  type="date" name="dob" value={dob} onChange={this.changehandler2} />
                </div>

                <div className="input-field-signin">
                  <label for="gender"><b>Gender: </b></label><br/>    
                  <input className="gender" placeholder="Gender" type="text" name="gender" value={gender} onChange={this.changehandler2} />
                </div>
                <button className='ui_button_signin' type="submit">Sign In</button>
                <div >
                  <Link to={"/"}>
                    <button className='ui_button_signincnfrm' type='submit'>Go to Home Page</button>
                  </Link>
                </div>
              </form>
            </div>   
                <div>
                  <a href="/login">
                     <button className='loginingbtn' id="loginingbtn">Already Have a Account?</button>
                  </a>
                </div>
          </div>
      );
    };
}

export default Signup;