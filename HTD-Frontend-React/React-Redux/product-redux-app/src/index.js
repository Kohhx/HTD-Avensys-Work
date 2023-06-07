import React from "react";
import { render } from "react-dom";
import { Provider } from "react-redux";
import { productStore } from "./redux";
import ProductStore1 from "./ProductStore1";
import ProductStore2 from "./ProductStore2";
import ProductStore3 from "./ProductStore3";
import "./style.css";


function App() {
  return (
    <div className="d-flex gap-5">
      <ProductStore1 />
      <ProductStore2 />
      <ProductStore3 />
    </div>
  );
}

render(
  <Provider store={productStore}>
    <App />
  </Provider>,
  document.getElementById("root")
);
