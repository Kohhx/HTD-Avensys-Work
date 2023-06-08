import React, { useState } from "react";
import { myData } from "./coviddata";
import { Chart } from "chart.js/auto";
import { Bar, Line, Doughnut, Scatter, Bubble, Pie } from "react-chartjs-2";

function MyChart() {
  const [chartData, setChartData] = useState({
    labels: myData.map((data) => data.year), // X-axis
    datasets: [
      {
        label: "Covid Cases",
        data: myData.map((data) => data.covidCases), // Y-axis
        backgroundColor: ["red", "blue", "green"],
      },
    ],
  });
  return (
    <div>
      <div style={{ height: "500px", width: "500px" }}>
        <Bar data={chartData} />
      </div>
      <div style={{ height: "500px", width: "500px" }}>
        <Line data={chartData} />
      </div>
      <div style={{ height: "500px", width: "500px" }}>
        <Doughnut data={chartData} />
      </div>
      <div style={{ height: "500px", width: "500px" }}>
        <Scatter data={chartData} />
      </div>
      <div style={{ height: "500px", width: "500px" }}>
        <Bubble data={chartData} />
      </div>
      <div style={{ height: "500px", width: "500px" }}>
        <Pie data={chartData} />
      </div>
    </div>
  );
}

export default MyChart;
