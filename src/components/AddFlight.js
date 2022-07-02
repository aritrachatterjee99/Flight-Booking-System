import React,{Component} from "react";
import axios from 'axios';
import { Link } from "react-router-dom";
import "../Styles/AddFlight.css"

class AddFlight extends Component {
  constructor(){
    super()

    this.state={
      flight_id: '',
      flight_company: '',
      flight_origin: '',
      flight_destination: '',
      flight_departure: '',
      flight_arrival: '',
      noOfSeats: ''
    };
  }


  changehandler2= e =>{
    this.setState({[e.target.name]: e.target.value})
  }

  submithandler2= e =>{
      e.preventDefault()
      console.log("Flight added successfully")
      axios.post('http://localhost:4001/admin/addflight' , this.state)
            .then(response => {
              console.log(response)
            })
            .catch(error => {
            console.log(error)
            }) 
  }


  render() 
  {
      const {flight_id,flight_company,flight_origin,flight_destination,flight_departure,flight_arrival,noOfSeats}=this.state
      return (
        <div className="ui_main_add">
          <h1 className="add_title">Add Flight</h1>
          <div className="ui_form_add">
            <form onSubmit={this.submithandler2}>
              <div className="input-field-add">
                <label for="flight_id"><b>Flight Id: </b></label><br/>    
                <input className="flight_id" placeholder="Flight Id" type="text" name="flight_id" value={flight_id} onChange={this.changehandler2} />
              </div>

              <div className="input-field-add">
                <label for="flight_company"><b>Flight Company: </b></label>    
                <input className="flight_company" placeholder="Enter Flight Company" type="text" name="flight_company" value={flight_company} onChange={this.changehandler2} />
              </div>

              <div className="input-field-add">
                <label for="flight_origin"><b>Flight Origin: </b></label><br/>     
                <input className="flight_origin" placeholder="Flight Origin" type="text" name="flight_origin" value={flight_origin} onChange={this.changehandler2} />
              </div>

              <div className="input-field-add">
                <label for="flight_destination"><b>Flight Destination: </b></label>    
                <input className="flight_destination" placeholder="Flight Destination" type="text" name="flight_destination" value={flight_destination} onChange={this.changehandler2} />
              </div>

              <div className="input-field-add">
                <label for="flight_departure"><b>Flight Departure: </b></label>    
                <input className="flight_departure" placeholder="Flight Departure" type="time" name="flight_departure" value={flight_departure} onChange={this.changehandler2} />
              </div>

              <div className="input-field-add">
                <label for="flight_arrival"><b>Flight Arrival: </b></label><br/>     
                <input className="flight_arrival" placeholder="Flight Arrival" type="time" name="flight_arrival" value={flight_arrival} onChange={this.changehandler2} />
              </div>

              <div className="input-field-add">
                <label for="noOfSeats"><b>No of Seats: </b></label><br/>     
                <input className="noOfSeats" placeholder="No of Seats" type="number" name="noOfSeats" value={noOfSeats} onChange={this.changehandler2} />
              </div>

            
              <button className="ui_button_add" type="submit">Add</button>
            </form>
            <div>
              <Link to={"/"}>
                <button className="ui_button_addcnfrm" type='submit'>Back to Home</button>
              </Link>
            </div>
          </div>
        </div>
    );
  };
}

export default AddFlight;