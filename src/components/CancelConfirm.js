import React from "react";
import { Link } from "react-router-dom";
import "../Styles/CancelConfirm.css"


const cancelconfirm = () => {
  return (
    <div className="ui_main_cnclcnfrm">
      
      <div>
        <h1>Ticket Cancelled Successfully</h1>
      </div>
      <div>
        <Link to={"/"}>
          <button className="ui_button_cnclcnfrm" type='submit'>Back to Home</button>
        </Link>
      </div>
    </div>
  );
};

export default cancelconfirm;