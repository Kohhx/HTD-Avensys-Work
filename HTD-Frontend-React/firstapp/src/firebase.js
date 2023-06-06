import { initializeApp } from "firebase/app";

// Imports required for authentication with google
// getAuth() - > Help react application to connect to authentication in firebase
// new GoogleAuthProvider()- > Help react application to connect to google authentication
import { getAuth, GoogleAuthProvider } from "firebase/auth";

// Your web app's Firebase configuration
const firebaseConfig = {
  apiKey: "AIzaSyAedk_OCVOTdr_y-zjnFrqqzV6ur-YmYHU",
  authDomain: "authentication-app-e2f65.firebaseapp.com",
  projectId: "authentication-app-e2f65",
  storageBucket: "authentication-app-e2f65.appspot.com",
  messagingSenderId: "341741132763",
  appId: "1:341741132763:web:29e073ad8b5622667365fe",
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);

// Connect to Authentication
// auth ->  Refer to authentication in firebase
const auth = getAuth(app);

// Create a google provider authentication
// provider -> Refer to google authentication
const provider = new GoogleAuthProvider();

export { auth, provider }
