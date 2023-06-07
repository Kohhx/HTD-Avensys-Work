import React from 'react'
import { useDispatch, useSelector } from "react-redux";

function ProductStore2() {
  const products = useSelector((state) => state.productsReducer.products);
  return (
    <div className="store text-center">
    <h1>Ecommerce Store 2</h1>
    {products.map((product) => {
      return (
        <div>
          <h2>{product.title}</h2>
          <img src={product.image} width="200px" height="200px" alt="" />
        </div>
      );
    })}
  </div>
  )
}

export default ProductStore2
