import { createStore, combineReducers } from "redux";

// INITIAL DATA
const initialData = {
  tasks: ["Cooking", "Coding"],
};

// ACTIONS - EXPORT
export const addTask = (task) => {
  return {
    type: "ADD_TASK",
    payload: task,
  };
}

// REDUCER AND COMBINE REDUCER
const todoReducer = (state = initialData, action) => {

  if (action.type === "ADD_TASK") {
    return {
      tasks: [...state.tasks, action.payload]
    }
  } else {
    return state;
  }

};

// Recommended to use combine reducer even if we have only one reducer
const rootReducer = combineReducers({
  todoReducer: todoReducer
})



// REDUX STORE - Export
export const todoStore = createStore(rootReducer);
