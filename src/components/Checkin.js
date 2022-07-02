import React from 'react';
import { Link } from "react-router-dom";
import "../Styles/Checkin.css";


const Checkin = ( ) => {

    const handleCheckin = () => {

    }
  return (
    <div className='container_checkin'>
      <header className='head_checkin'>
        <h1>Check In</h1>
      </header>
      <form className='modal_content1_checkin' method='post'>
        <div className='input_field_checkin'>
          <label for="Seat"><b>Select Seat: </b></label>
          <span>
            <select className='Seat' label='row' name='Seat'>
              <option value="1">1</option>
              <option value="2">2</option>
              <option value="3">3</option>
              <option value="4">4</option>
              <option value="5">5</option>
              <option value="6">6</option>
              <option value="7">7</option>
              <option value="8">8</option>
              <option value="9">9</option>
              <option value="10">10</option>
              <option value="11">11</option>
              <option value="12">12</option>
              <option value="13">13</option>
              <option value="14">14</option>
              <option value="15">15</option>
              <option value="16">16</option>
              <option value="17">17</option>
              <option value="18">18</option>
              <option value="19">19</option>
              <option value="20">20</option>
              <option value="21">21</option>
              <option value="22">22</option>
              <option value="23">23</option>
              <option value="24">24</option>
              <option value="25">25</option>
              <option value="26">26</option>
              <option value="27">27</option>
              <option value="28">28</option>
              <option value="29">29</option>
              <option value="30">30</option>
            </select>
            <select className='Seat' label='col' name='Seat'>
              <option value="1">A</option>
              <option value="2">B</option>
              <option value="3">C</option>
              <option value="4">D</option>
              <option value="5">E</option>
              <option value="6">F</option>
            </select>
          </span>
          


        </div>
        <div >
          <Link to={"/bookconfirm"}>
            <button className='ui_button_checkin' type='submit' onClick={handleCheckin} >Confirm Seat</button>
          </Link>
        </div>
       
      </form>
    </div>
  );
};

export default Checkin;