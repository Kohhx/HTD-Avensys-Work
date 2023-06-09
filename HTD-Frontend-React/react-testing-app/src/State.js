import React, { useState } from 'react'

function State() {
  const [count, setCount] = useState(0)


  return (
    <div>
      <button onClick={() => setCount(count + 1)}>Increase</button>
      <button onClick={() => setCount(count - 1)}>Decrease</button>
      <h1 data-testid="countvalue">{count}</h1>
    </div>
  )
}

export default State
