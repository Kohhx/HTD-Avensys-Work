import React, { useState } from "react";
import { render } from "react-dom";
import MyChart from "./MyChart";
import { Bar, Line, Doughnut, Scatter, Bubble, Pie} from "react-chartjs-2";
import { myData } from "./coviddata";
import { Chart } from "chart.js/auto";

function App() {
  return (
    <div>
      <MyChart />
    </div>
  );
}

render(<App />, document.getElementById("root"));
