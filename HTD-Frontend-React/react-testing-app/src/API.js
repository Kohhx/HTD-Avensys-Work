import React, { useEffect, useState } from "react";
// import axios from "axios";
// const axios = require("axios");

function API() {
  const [data, setData] = useState([]);

  useEffect(() => {
    // axios.get("https://fakestoreapi.com/products").then((res) => {
    //   setData(res.data);
    // });

    fetch("https://fakestoreapi.com/products")
    .then((res) => {
      return res.json();
    }).then((data) => {
      setData(data)
    });
  }, []);

  return (
    <div>
      <h1>API Fake Store</h1>
      {data.map((item, index) => {
        return <li key={index}>{item.title}</li>
      })}
    </div>
  );
}

export default API;
