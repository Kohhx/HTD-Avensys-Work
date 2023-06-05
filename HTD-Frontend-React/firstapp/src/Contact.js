import React from "react";
import "./demo.css";

export default function Contact(props) {
  return (
    <div>
      <div class="card" style={{width: "18rem"}}>
        <img width="100px" height="300px" src={props.image} class="card-img-top" alt="..." />
        <div class="card-body">
          <h3 class="card-title">{props.name}</h3>
          <p class="card-text">{props.message}</p>
          <a href="#" class="btn btn-primary">
            Start Chat Now
          </a>
        </div>
      </div>
    </div>
  );
}
