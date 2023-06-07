import React, { useEffect } from "react";
import axios from "axios";
import { useDispatch, useSelector } from "react-redux";
import { addProducts } from "./redux";

function ProductStore1() {
  let dispatch = useDispatch();
  console.log(addProducts)
  const products = useSelector((state) => state.productsReducer.products);
  console.log(products)
  useEffect(() => {

    axios
      .get("https://fakestoreapi.com/products")
      .then((res) => {
        console.log(res.data)
        console.log(addProducts)
        dispatch(addProducts(res.data))
      })
      .catch((err) => console.log(err));

  }, []);

  return (
    <div className="store text-center">
      <h1>Ecommerce Store 1</h1>
      {products.map((product) => {
        return (
          <div>
            <h2>{product.title}</h2>
            <img src={product.image} width="200px" height="200px" alt="" />
          </div>
        );
      })}
    </div>
  );
}

export default ProductStore1;
