import React from "react";
import { useSelector } from "react-redux";

function Second() {

  const output = useSelector((data) => data.todoReducer.tasks);

  return (
    <div>
      <h1>Second Component</h1>
      {output.map((task, index) => {
        return <div key={index}>{task}</div>;
      })}
    </div>
  );
}

export default Second;
