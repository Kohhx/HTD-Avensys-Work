import React from "react";
import "./demo.css";

export default function Contact() {
  return (
    <div>
      <div class="card" style={{width: "18rem"}}>
        <img width="100px" height="300px" src="https://img.freepik.com/free-vector/businessman-character-avatar-isolated_24877-60111.jpg?w=2000" class="card-img-top" alt="..." />
        <div class="card-body">
          <h3 class="card-title">Mark Anderson</h3>
          <p class="card-text">What time did react lesson start today?</p>
          <a href="#" class="btn btn-primary">
            Start Chat Now
          </a>
        </div>
      </div>
    </div>
  );
}
