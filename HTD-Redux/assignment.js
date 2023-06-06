// Customer --> buy_laptop, sell_laptop --> Shopkeeper --> MobileStore(40 laptops)
const { createStore } = require("redux");


// Initial State
const initialData = {
  noOfLaptops: 40,
};

//REDUCER
const mobileStoreReducer = (state = initialData, action) => {
  if (action.type === "BUY_LAPTOP") {
    return {noOfLaptops: state.noOfLaptops - 1}
  }

  if (action.type === "SELL_LAPTOP") {
    return {noOfLaptops: state.noOfLaptops + 1}
  }
  return state;
}

// Action
function buyLaptop() {
  return {
    type: "BUY_LAPTOP"
  }
}

function sellLaptop() {
  return {
    type: "SELL_LAPTOP"
  }
}
// Store
const mobileStore = createStore(mobileStoreReducer);


// Subscribe to store
mobileStore.subscribe(() => {
  console.log(mobileStore.getState())
})

mobileStore.dispatch(buyLaptop());
mobileStore.dispatch(buyLaptop());
mobileStore.dispatch(sellLaptop());
