import React, { useState } from "react";

function Todo() {
  const [todos, setTodos] = useState(["Eating", "Sleeping", "Coding"]);
  const [task, setTask] = useState("");

  const changeHandler = (e) => {
    setTask(e.target.value);
   }

   const handleSubmit = (e) => {
      e.preventDefault();
      setTodos([...todos, task]);
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
          value={task}
        />
        <button onClick={handleSubmit}className="btn btn-success">+ Add Task</button>
      </div>

      <ul className="mt-3">
        {todos.map((todo, index) => (
          <li key={index} >{todo}</li>
        ))}
      </ul>
    </div>
  );
}

export default Todo;
