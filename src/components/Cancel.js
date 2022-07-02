import React, {Component} from 'react';
import axios from 'axios';

export default class Cancel extends Component {
    constructor(props) {
        super(props);
        this.state = {
            books: [],
            booking_Id: '',
            flight_Id: '',
            user_First_Name: '',
            user_Last_Name: '',
            user_Gender: '',
            user_Contact: '',
            date_of_Journey: '',
            no_of_Passanger: ''
        };
    }
    deleteHandler = (id, e) => {
        e.preventDefault();
        axios.delete(`'http://localhost:4003/book/cancelbooking/${id}`)
        .then((response) => {
            console.log("Delete successful");
        });
        
    };

    render() {
        const books = this.state.posts.map((book) => {
            return (
                <Post
                    key={book.id}
                    book={book}
                    bookDeleted={this.deleteHandler.bind(
                        this,
                        book.id,
                    )}
                />  
            );
        });
        return(
            <div className='text-right'>
             <button
                onClick={props.bookDeleted}
                className='deletebtn'>
                Delete </button>
            </div>
        )
    }
}
