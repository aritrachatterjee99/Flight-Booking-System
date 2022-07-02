import React, {Component} from 'react';
import axios from 'axios';
import "../Styles/Book.css"


class Book extends Component
{
    constructor(){
        super()

        this.state={
            flight_Id: '',
            user_First_Name: '',
            user_Last_Name: '',
            user_Gender: '',
            user_Contact: '',
            date_of_Journey: '',
            no_of_Passanger: ''
        }
    }
    
    changehandler1= e =>{
        this.setState({[e.target.name]: e.target.value})
    }

    submithandler1= e =>{
        e.preventDefault()
        console.log("Ticket booked successfully")
        axios.post('http://localhost:4003/book/newbooking' , this.state)
              .then(response => {
                console.log(response)
              })
              .catch(error => {
              console.log(error)
              }) 
      }


    render() 
    {
        const {flight_Id,user_First_Name,user_Last_Name,user_Gender,user_Contact,date_of_Journey,no_of_Passanger}=this.state
        return (
          <div className='ui_main_book'>
             <h1 className="book_title">Book Flight</h1>
            <div className='ui_form_book'>
              <form onSubmit={this.submithandler1}>
                
                <div className="input-field-book">
                  <label for="flight_Id"><b>Flight Id: </b></label><br/>    
                  <input className="flight_Id" placeholder="Enter Flight Id" type="text" name="flight_Id" value={flight_Id} onChange={this.changehandler1} />
                </div>

                <div className="input-field-book">
                  <label for="user_First_Name"><b>Passanger First Name: </b></label>    
                  <input className="user_First_Name" placeholder="First Name" type="text" name="user_First_Name" value={user_First_Name} onChange={this.changehandler1} />
                </div>

                <div className="input-field-book">
                  <label for="user_Last_Name"><b>Passanger Last Name: </b></label>    
                  <input className="user_Last_Name" placeholder="Last Name" type="text" name="user_Last_Name" value={user_Last_Name} onChange={this.changehandler1} />
                </div>

                <div className="input-field-book">
                    <label for="user_Gender"><b>Gender: </b></label><br/>    
                    <input className="user_Gender" placeholder="Gender" type="text" name="user_Gender" value={user_Gender} onChange={this.changehandler1} />
 
                </div>

                <div className="input-field-book">
                  <label for="user_Contact"><b>Contact Details: </b></label>    
                  <input className="user_Contact" placeholder="Enter Contact Details" type="number" name="user_Contact" value={user_Contact} onChange={this.changehandler1} />
                </div>

                <div className="input-field-book">
                  <label for="date_of_Journey"><b>Date of Journey: </b></label>    
                  <input className="date_of_Journey" placeholder="Enter Date of Journey" type="date" name="date_of_Journey" value={date_of_Journey} onChange={this.changehandler1} />
                </div>

                <div className="input-field-book">
                  <label for="no_of_Passanger"><b>Number of Passanger: </b></label>    
                  <input className="no_of_Passanger" placeholder="Enter Number of Passanger" type="number" name="no_of_Passanger" value={no_of_Passanger} onChange={this.changehandler1} />
                </div>
                <button className='ui_button_book' type="submit">Book</button>
              </form>
              <div>
                  <a href="/checkin">
                     <button className='bookcnfrmbtn' id="checkiningbtn">Chech In</button>
                  </a>
                </div>
            </div>
          </div>
      );
    };
}

export default Book;