// Redux Tutorial - 1
// Customer --> BUY-CHOCOLATE -->  Shopkeeper --> Bakery(20 choc)

const { createStore } = require("redux");

// STATE
const initialData = {
  noOfChocolates: 20,
};

// CREATE A REDUCER
const chocolateReducer = (state = initialData, action) => {
  if (action.type === "BUY_CHOCOLATE") {
    return {
      noOfChocolates: state.noOfChocolates - 1,
    };
  }

  return state;
};

//ACTION
function buy() {
  return {
    type: "BUY_CHOCOLATE",
  };
}

// CREATE STORE
const bakery = createStore(chocolateReducer);

bakery.subscribe(function() {
    console.log(bakery.getState())
})

bakery.dispatch(buy());
bakery.dispatch(buy());
bakery.dispatch(buy());
