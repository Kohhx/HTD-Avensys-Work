import React, { useState, useMemo } from "react";

function Launch() {

  const [count, setCount] = useState(0);
  const [enteredName, setEnteredName] = useState("");
  // console.log("*****")

  console.log("Rendered")


  const cube = (n) => {
    let i = 0;
    while (i < 1000000000) {
      i++;
    }
    return n * n * n;
  };

  const handleChange = (e) => {
    setEnteredName(e.target.value)
  };


  const cubeResult = useMemo(() => cube(count),[count]);

  return (
    <div>
      <h1 style={{textAlign:"center"}}>Use Memo Example</h1>
      <hr />
      <div>
        <h1>
          The number is :{count} and its cube is : {cubeResult}
        </h1>
        <button onClick={() => setCount(count + 1)}>Increase</button>
        <button onClick={() => setCount(count - 1)}>Decrease</button>
      </div>
      <hr />

      <h2>The Name is: {enteredName}</h2>
      Enter Name: <input type="text" onChange={handleChange} />
    </div>
  );
}

export default Launch;
