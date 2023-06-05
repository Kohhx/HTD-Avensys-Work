import React, { useState } from 'react'

export function Login() {

  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  // const [isLogin, setIslogin] = useState(false);
  const [isLogin, setIslogin] = useState("");

  const handleLogin = () => {
    if (username === "Raju" && password === "Welcome") {
      console.log("Login Successful, valid user")
      setIslogin("Login Successful, valid user")
    } else {
      console.log("Login Unsuccessful, invalid user")
      setIslogin("Login Unsuccessful, invalid user")
    }
  }

  return (
    <div>
      { isLogin && <h1 style={{}}> {isLogin} </h1> }
      <div>Username <input class="form-control mb-3" type="text" onChange={(e) => setUsername(e.target.value)} value={username}/></div>
      <div>Password <input class="form-control mb-3" type="text" onChange={(e) => setPassword(e.target.value)} value={password}/></div>
      <button className="btn btn-primary text-center" onClick={handleLogin}>Login</button>
    </div>
  )
}

export default Login
