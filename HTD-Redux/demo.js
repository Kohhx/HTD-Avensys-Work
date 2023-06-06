// Customer --> BUY_ICECREAM,BUY_CAKE --> SHopkeeper --> Cakeworld(20 icecreams and 30cakes )
const { createStore } = require("redux");


// State
const initialData = {
  noOfIcecreams: 20,
  noOfCakes: 30,
};

//REDUCER
const cakeWorldReducer = (state = initialData, action) => {
  if (action.type === "BUY_CAKE") {
    return {...state, noOfCakes: state.noOfCakes - 1}
  }

  if (action.type === "BUY_ICECREAM") {
    return {...state, noOfIcecreams: state.noOfIcecreams - 1}
  }

  return state;
}

// Action
function buyCake() {
  return {
    type: "BUY_CAKE"
  }
}

function buyIceCream() {
  return {
    type: "BUY_ICECREAM"
  }
}
// Store
const cakeWorld = createStore(cakeWorldReducer);


// Subscribe to store
cakeWorld.subscribe(() => {
  console.log(cakeWorld.getState())
})

cakeWorld.dispatch(buyCake());
cakeWorld.dispatch(buyCake());
cakeWorld.dispatch(buyIceCream());
