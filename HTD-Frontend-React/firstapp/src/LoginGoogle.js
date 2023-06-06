import React, { useContext } from "react";
import { auth, provider } from "./firebase";
import "./LoginGoogle.css";
import GoogleImage from "./images/google.png";
import { useNavigate } from "react-router";
import { myStore } from "./index";

// Method by firebase to display pop login
import { signInWithPopup } from "@firebase/auth";

function LoginGoogle() {
  const navigate = useNavigate();
  const { set } = useContext(myStore);

  const handleLogin = () => {
    console.log("Login with google");
    signInWithPopup(auth, provider)
      .then(() => {
        set(true);
        navigate("/mobile");

        // Get user Info
        // const username = auth.currentUser.displayName;
        // const email = auth.currentUser.email;
        // console.log(username, email)
      })
      .catch((error) => {
        alert("Login failed", error);
      });
  };

  return (
    <div className="d-flex justify-content-center align-items-center vh-100">
      <button
        className="google-btn d-flex align-items-center"
        onClick={handleLogin}
      >
        <div className="image-container">
          <img src={GoogleImage} alt="google login" />
        </div>
        <div className="btn-name" style={{ color: "white" }}>
          Sign in With Google
        </div>
      </button>
    </div>
  );
}

export default LoginGoogle;
