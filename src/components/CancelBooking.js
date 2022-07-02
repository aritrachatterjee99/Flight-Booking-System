import React from 'react';
import { Link } from "react-router-dom";
import "../Styles/CancelBooking.css"



const Cancelbook = ( ) => {

    const handleCancelbook = () => {

    }
  return (
    <div className='ui_main_cancelk'>
      <header>
        <h1>Cancel Your Ticket</h1>
      </header>
      <form className='modal_content_cancel' method='post'>
        <div className='input_field_cancel'>
          <label for="booking_Id_cancel"><b>Booking Id: </b></label>
          <input className="booking_Id_cancel" placeholder="Enter Bookingt Id" name="booking_Id_cancel" required/>

          <br></br>

          <label for="Journey_Date"><b>Date of Journey: </b></label>
          <input className="Journey_Date" type="date" name="date_cancel" required/>
          


        </div>
        <div className='Regbutton5'>
          <Link to={"/cancelconfirm"}>
            <button type='submit' onClick={handleCancelbook} className="ui_button_cancel">Cancel Ticket</button>
          </Link>
        </div>
      </form>
    </div>
  );
};

export default Cancelbook;