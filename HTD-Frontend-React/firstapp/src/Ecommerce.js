import React, { useState, useEffect } from "react";
import axios from "axios";

function Ecommerce() {
  const [products, setProducts] = useState([]);

  console.log("WHYY")

  useEffect(() => {
    // const fetchProducts= async () => {
    //   const products = await axios.get("https://fakestoreapi.com/products");
    //   setProducts(products.data);
    //   console.log(products.data)
    // };

    // fetchProducts();

    axios
      .get("https://fakestoreapi.com/products")
      .then((res) => setProducts(res.data))
      .catch((err) => console.log(err));

  }, []);

  console.log("WHYY2")

  return <div>
    <h1>Ecommerce</h1>
    {
      products.map(product => {
        return <div>
          <h2>{product.title}</h2>
          <img src={product.image}  width="200px" height="200px" alt="" />
          </div>
      })
    }
  </div>;
}

export default Ecommerce;
