import React, { useState } from "react";

function Launch() {
  // console.log("*****")

  function cube(n) {
    let i = 0;
    while (i < 1000000000) {
      i++;
    }
    return n * n * n;
  }

  const [count, setCount] = useState(0);

  const cubeResult = cube(count);

  return (
    <div>
      <div>
        <button onClick={() => setCount(count + 1)}>Increase</button>
        <button onClick={() => setCount(count - 1)}>Decrease</button>
      </div>

      {count} and the cube is : {cubeResult}
    </div>
  );
}

export default Launch;
