import React, { useState } from "react";
import { addTask } from "./redux";
import { useDispatch, useSelector } from "react-redux"

function First() {
  const allTasks = useSelector((data) => data.todoReducer.tasks);
  const [task, setTask] = useState([]);
  const dispatch = useDispatch();

  const changeHandler = (event) => {
    setTask(event.target.value);
    console.log(task);
  }

  const handleClick = () => {
    // Task and redux store
    dispatch(addTask(task));
  }

  return (
    <div class="container">
      <h1>Todo App</h1>
      <div className="d-flex align-items-center mt-2">
        <input
          type="text"
          className="form-control w-50"
          style={{ marginRight: "10px", display: "inline" }}
          onChange={changeHandler}
          // value={task}
        />
        <button onClick={handleClick} className="btn btn-success">+ Add Task</button>
      </div>
      <h1>First Component</h1>
      <ul className="mt-3">
        {allTasks.map((task, index) => (
          <li key={index} >{task}</li>
        ))}
      </ul>
    </div>
  );
}

export default First;
