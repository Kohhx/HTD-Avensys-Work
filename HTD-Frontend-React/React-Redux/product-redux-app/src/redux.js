import { createStore, combineReducers } from "redux";

// INITIAL DATA
const initialData = {
  products: [],
};

// ACTIONS - EXPORT
export const addProducts = (products) => {
  return {
    type: "ADD_PRODUCTS",
    payload: products,
  };
}

// REDUCER AND COMBINE REDUCER
const productsReducer = (state = initialData, action) => {

  if (action.type === "ADD_PRODUCTS") {
    return {
      products: [...state.products, ...action.payload]
    }
  } else {
    return state;
  }

};

// Recommended to use combine reducer even if we have only one reducer
const rootReducer = combineReducers({
  productsReducer: productsReducer
})



// REDUX STORE - Export
export const productStore = createStore(rootReducer);
