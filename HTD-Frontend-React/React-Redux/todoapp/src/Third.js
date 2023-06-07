import React from 'react'
import { useSelector } from 'react-redux'

function Third() {
  const output = useSelector((data) => data.todoReducer.tasks);

  return (
    <div>
      <h1>Third Component</h1>
      {output.map((task, index) => {
        return <div key={index}>{task}</div>;
      })}
    </div>
  );
}

export default Third
