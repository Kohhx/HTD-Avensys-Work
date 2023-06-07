import React from "react";
import { render } from "react-dom";
import First from "./First";
import { Provider } from "react-redux";
import { todoStore } from "./redux";
import Second from "./Second";
import Third from "./Third";

function App() {
  return (
    <div>
      <First />
      <Second />
      <Third />
    </div>
  );
}

render(
  <Provider store={todoStore}>
    <App />
  </Provider>,
  document.getElementById("root")
);
