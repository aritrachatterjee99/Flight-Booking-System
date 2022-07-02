import React from "react";
import { Link } from "react-router-dom";
import "../Styles/BookConfirmPage.css"

const bookconfirm = () => {
  return (
    <div className="ui_main_bookcnfrm">
      
      <div>
        <h1>Ticket Booked Successfully</h1>
      </div>
      <div className='Regbutton50'>
        <Link to={"/"}>
          <button className="ui_button_bookcnfrm" type='submit'>Back to Home</button>
        </Link>
      </div>
    </div>
  );
};

export default bookconfirm;