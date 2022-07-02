import React, {Component} from "react";
import axios from "axios";
import "../Styles/Searchflight.css"
class Searchflight extends Component
{
    constructor(){
        super()

        this.state={
            flight_origin: '',
            flight_destination: '',
            flight : []
        }
    }
    
    changehandler=(event)=>{
        this.setState({[event.target.name]:event.target.value})
    }

    submithandler=event=>{
        event.preventDefault();
        axios.get('http://localhost:4002/user/getflightbyloc/'+this.state.flight_origin+'/'+this.state.flight_destination)
             .then(response => {
                this.setState({flight: response.data})
                if(response===200){
                    console.log(response.data)

                    console.log(response.state)}
                    else{
                        console.log("Cannot get Data"+ response.data)
                    }
                })
               .catch(error => {
                   console.log(error)
               }) 
            }


    render() 
    {
        const {flight_origin,flight_destination}=this.state
        return(
            <div className='ui_main_search'>
                <h1 className="search_title">Search Flight</h1>
                <div className='ui_form_search'>
                    <form onSubmit={this.submithandler}>
                        <div className="input-field-search">
                            <label for="flight_origin"><b>Origin: </b></label>    
                            <input className="flight_origin" placeholder="Origin" type="text" name="flight_origin" value={flight_origin} onChange={this.changehandler} />
                        </div>
                           
                        <div className="input-field-search">
                            <label for="flight_destination"><b>Destination: </b></label>
                            <input className="flight_destination" placeholder="Destination" type="text" name="flight_destination" value={flight_destination} onChange={this.changehandler} />
                        </div> 

                        <button className="ui_button_search" type="submit">Search</button>
                    </form>
                </div>
                <div className="results" id="Result"></div>
                <div className="result">
                    {this.state.flight.map(flight => <div className="searchresult" id="searchCard" key={flight.flight_id}>
                        <br/>
                        <div class="inline"><p><b>Flight Id: </b>{flight.flight_id}</p></div>
                        <div class="inline"><p><b>Flight Company: </b>{flight.flight_company}</p></div>
                        <div class="inline"><p><b>Flight Origin: </b>{flight.flight_origin}</p></div>
                        <div class="inline"><p><b>Flight Destination: </b>{flight.flight_destination}</p></div>
                        <div class="inline"><p><b>Flight Departure: </b>{flight.flight_departure}</p></div>
                        <div class="inline"><p><b>Flight Arrival: </b>{flight.flight_arrival}</p></div>
                        <div class="inline"><p><b>No of Seats: </b>{flight.noOfSeats}</p></div>
                        <div>
                            <a href="/book">
                                <button className="bookingbtn" id="bookingbtn">Book</button>
                            </a>
                        </div>
                    </div>)
                    }
                </div>

            </div>
        )

    }
}
export default Searchflight;

