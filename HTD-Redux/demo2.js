// Customer --> BUY_ICECREAM,BUY_CAKE --> SHopkeeper --> Cakeworld(20 icecreams and 30cakes )
// One store can have multiple reducers. Use multiple reducers for different resources
const { createStore, combineReducers } = require("redux");

// State
const cakeData = {
  noOfCakes: 30,
};

const iceCreamData = {
  noOfIcecreams: 20,
};

// ICE CREAM REDUCER
const iceCreamReducer = (state = iceCreamData, action) => {
  if (action.type === "BUY_ICECREAM") {
    return {...state, noOfIcecreams: state.noOfIcecreams - 1}
  }
  if (action.type === "SELL_ICECREAM") {
    return {...state, noOfIcecreams: state.noOfIcecreams + 1}
  }
  return state;
}

// ICE CREAM REDUCER
const cakeReducer = (state = cakeData, action) => {
  if (action.type === "BUY_CAKE") {
    return {...state, noOfCakes: state.noOfCakes - 1}
  }

  if (action.type === "SELL_CAKE") {
    return {...state, noOfCakes: state.noOfCakes + 1}
  }
  return state;
}

// COMBINE REDUCERS

const rootReducer = combineReducers({
  icecream: iceCreamReducer,
  cake: cakeReducer,
})

// Cakes Action
function buyCake() {
  return {
    type: "BUY_CAKE"
  }
}

function sellCake() {
  return {
    type: "SELL_CAKE"
  }
}

// Ice Cream Action
function buyIceCream() {
  return {
    type: "BUY_ICECREAM"
  }
}

function sellIceCream() {
  return {
    type: "SELL_ICECREAM"
  }
}
// One Store
const cakeWorld = createStore(rootReducer);


// Subscribe to store
cakeWorld.subscribe(() => {
  console.log(cakeWorld.getState())
})

cakeWorld.dispatch(buyCake());
cakeWorld.dispatch(buyCake());
cakeWorld.dispatch(buyIceCream());
cakeWorld.dispatch(sellIceCream());
